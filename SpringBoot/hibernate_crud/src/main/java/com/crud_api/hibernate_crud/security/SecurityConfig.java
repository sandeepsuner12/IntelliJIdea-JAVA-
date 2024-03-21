package com.crud_api.hibernate_crud.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder){
       UserDetails admin= User.withUsername("Ram")
                .password(encoder.encode("pwdr"))
                .roles("ADMIN").build();

       UserDetails viwer = User.withUsername("Sam")
               .password(encoder.encode("pwds"))
               .roles("VIWER").build();
        return new InMemoryUserDetailsManager(admin,viwer);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

//        httpSecurity.csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/testdemo/")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin();

        httpSecurity.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable())
                .authorizeHttpRequests((requests) -> requests
//                        .requestMatchers("/products","/products/**","/product").permitAll()
                                .anyRequest().permitAll()
//                        .requestMatchers("/products","/products/**","/product").hasRole("ADMIN")
//                        .anyRequest()
//                        .authenticated()
                )
//                .formLogin(Customizer.withDefaults());
                .httpBasic();


        return httpSecurity.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
