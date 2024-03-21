package com.solugenix.TourismProject.ServiceImpl;


import java.nio.channels.NonReadableChannelException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.solugenix.TourismProject.config.JwtHelper;
import com.solugenix.TourismProject.model.Admin;
import com.solugenix.TourismProject.model.JwtRequest;
import com.solugenix.TourismProject.model.JwtResponse;
import com.solugenix.TourismProject.model.Status;
import com.solugenix.TourismProject.model.User;
import com.solugenix.TourismProject.repository.AdminRepository;
import com.solugenix.TourismProject.repository.UserRepository;
import com.solugenix.TourismProject.service.LoginService;


@Service
public class LoginServiceImpl  implements LoginService{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private JwtHelper jwtHelper;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserDetailsService userDetailsService;


	@Override
	public JwtResponse verifyLogin(JwtRequest jwtRequest)
	{
		this.doAuthenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
        UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtHelper.generateToken(jwtRequest.getUsername());

        return new JwtResponse(token,jwtRequest.getUsername()); 

		/*System.out.println(admin.toString());
		Admin admin2=adminRepository.findByUsername(admin.getUsername());
		System.out.println(admin.getUsername());
		System.out.println("Admin password:"+admin.getPassword());
		System.out.println("Admin2 Password:"+admin2.getPassword());
		boolean b1=admin!=null;
		boolean b2=admin2!=null;
		//boolean b3=passwordEncoder.matches(admin.getPassword(), admin2.getPassword());
		System.out.println(b1+"    "+b2+"  ");
		//User user2=userRepository.findByEmail(user.getUsername());
		if (admin != null && admin2 != null  && admin.getPassword().equals(admin2.getPassword()))
		{
			System.out.println("True Status");
			return new Status(true);
		}else {
			System.out.println("False Status");
		    return new Status(false);
		}*/
	}


	@Override
	public JwtResponse verifyLoginUser(JwtRequest jwtRequest) {
		this.doAuthenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
        UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtHelper.generateToken(jwtRequest.getUsername());
        System.out.println("i am in userDetails"+userDetails);
        System.out.println("Token"+token);
        return new JwtResponse(token,jwtRequest.getUsername());
		/*System.out.println(user.toString());
		System.out.println("Email::"+user.getUsername());
		User user2=userRepository.findByEmail(user.getUsername());
		//System.out.println(user2.toString());
		boolean b1=user != null;
		boolean b2=user2 !=null;
		boolean b3=passwordEncoder.matches(user.getPassword(), user2.getPassword());
		System.out.println(b1 +"  "+b2+"  "+b3);
		System.out.println(user.getPassword());
		//System.out.println(user2.getPassword());
		if(user != null && user2 != null && passwordEncoder.matches(user.getPassword(), user2.getPassword()))
		{
			System.out.println("user login succesfully!");
			return new Status(true);
		}
		else 
			{
			System.out.println("invalid Credentials !! Please try again.");
			return new Status(false);
		}*/
		
	}
//	private boolean doAdminAuthenticate(String username,String password)
//	{
//		Admin admin=adminRepository.findByUsername(username);
//		if(admin == null)
//		{
//			 throw new UsernameNotFoundException("Invalid Admin Username or Password!!");
//		}
//        if (!passwordEncoder.matches(password, admin.getPassword()))
//        {
//	            throw new UsernameNotFoundException("Invalid Admin Username or Password!!");
//	       }
//        return true;
//	}
	private void doAuthenticate(String email,String password){
		System.out.println("i am in userDetails"+ email + password);
        
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(email,password);
        System.out.println("Token"+authenticationToken);
        try {
            authenticationManager.authenticate(authenticationToken);
        }catch (BadCredentialsException e){
            throw new RuntimeException("Invalid Username or Password !!");
        }
    }




	@Override
	public Status forgotPassword(String email,long mobile) {
		System.out.println(email);
		User user2=userRepository.findByEmail(email);
		//System.out.println(user2);
		boolean b1=user2 != null ; 
		boolean b2=user2.getEmail().equals(email);
		boolean b3=user2.getPhnumber() == mobile;
		//System.out.println(b1 +"  "+b2+"  "+b3);
		if(user2 != null && user2.getEmail().equals(email) && user2.getPhnumber() == mobile)
		{
			return new Status(true);
		}
		else {
			return new Status(false);
		}
	}


	@Override
	public Status confirmPassword(String confirmPassword, String userEmail) {
		System.out.println("User emailkdvnovblowbnv:"+userEmail);
		User user=userRepository.findByEmail(userEmail); 
		user.setPassword(passwordEncoder.encode(confirmPassword));
		userRepository.save(user);
		
		System.out.println(userRepository.findByEmail(userEmail));
		return new Status(true);
	}

	
}
