package com.hibernatetry.hibernatepractice;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ContactDetails {

    @Column(name = "Address")
    private String address;
    @Column(name = "Guardian-Name")
    private String guardian;
    @Column(name = "Guardian-Contact-info")
    private String guardian_ph_number;

    public ContactDetails() {
        super();
    }

    public ContactDetails(String address, String guardian, String guardian_ph_number) {
        super();
        this.address = address;
        this.guardian = guardian;
        this.guardian_ph_number = guardian_ph_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getGuardian_ph_number() {
        return guardian_ph_number;
    }

    public void setGuardian_ph_number(String guardian_ph_number) {
        this.guardian_ph_number = guardian_ph_number;
    }
}
