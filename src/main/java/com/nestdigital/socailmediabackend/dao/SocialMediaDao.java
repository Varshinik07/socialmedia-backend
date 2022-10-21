package com.nestdigital.socailmediabackend.dao;

import com.nestdigital.socailmediabackend.model.SocialMediaModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SocialMediaDao extends CrudRepository<SocialMediaModel,Integer> {
    @Query(value = "SELECT `id`, `dob`, `phone_no`, `emailid`, `name`, `place`, `password` FROM `user` WHERE `emailid`= :emailid AND `password`= :password",nativeQuery = true)
    List<SocialMediaModel>socialmedia (String emailid,String password);
}
