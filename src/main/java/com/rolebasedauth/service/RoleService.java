package com.rolebasedauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rolebasedauth.dao.RoleDao;
import com.rolebasedauth.entity.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleDao roleDao;
	
	public Role createNewRole(Role role) {
		System.out.println("Service Role Service 16");
		return roleDao.save(role);
		
	}

}
