package com.rolebasedauth.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolebasedauth.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role,String>{

}
