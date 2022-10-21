package com.nestdigital.socailmediabackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="user")
public class SocialMediaModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dob;
    private BigInteger phone_no;
    private String place;
    private String emailid;
    private String password;

    public SocialMediaModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public BigInteger getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(BigInteger phone_no) {
        this.phone_no = phone_no;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SocialMediaModel(int id, String name, String dob, BigInteger phone_no, String place, String emailid, String password) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phone_no = phone_no;
        this.place = place;
        this.emailid = emailid;
        this.password = password;
    }
}
