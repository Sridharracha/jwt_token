package com.rolebasedauth.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolebasedauth.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String>{

}
