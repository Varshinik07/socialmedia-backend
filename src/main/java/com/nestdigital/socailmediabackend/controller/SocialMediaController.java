package com.nestdigital.socailmediabackend.controller;

import com.nestdigital.socailmediabackend.dao.SocialMediaDao;
import com.nestdigital.socailmediabackend.model.SocialMediaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SocialMediaController {
    @Autowired
    public SocialMediaDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addsocialmedia",consumes = "application/json",produces = "application/json")
    public String addsocialmedia(@RequestBody SocialMediaModel socialmedia){
       dao.save(socialmedia);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/login",consumes = "application/json",produces = "application/json")
    public List<SocialMediaModel>socialmedialogin(@RequestBody SocialMediaModel socialmedia)
    {
        return (List<SocialMediaModel>) dao.socialmedia(socialmedia.getEmailid(),socialmedia.getPassword());
    }
}
