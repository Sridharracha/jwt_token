package com.rolebasedauth.service;

import com.rolebasedauth.dao.RoleDao;
import com.rolebasedauth.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rolebasedauth.dao.UserDao;
import com.rolebasedauth.entity.User;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;

	
	public User registerNewUser(User user) {
		System.out.println("Service User Service 23");
		return userDao.save(user);
		
	}

	/*public void initRolesAndUser(){

		Role adminRole = new Role();
		adminRole.setRoleName("Admin");
		adminRole.setRoleDescription("Admin Role");
		roleDao.save(adminRole);

		Role userRoles = new Role();
		userRoles.setRoleName("User");
		userRoles.setRoleDescription("Default Role for new user");
		roleDao.save(userRoles);

		User adminuser = new User();
		adminuser.setUserFirstName("admin");
		adminuser.setUserLastName("admin");
		adminuser.setUserFirstName("amin123");
		adminuser.setUserPassword("admin@pass");
		Set<Role> adminRoles = new HashSet<>();
		adminRoles.add(adminRole);
		adminuser.setRole(adminRoles);
		userDao.save(adminuser);

		User user = new User();
		user.setUserFirstName("Sri");
		user.setUserLastName("Ram");
		user.setUserFirstName("SriRam");
		user.setUserPassword("SriRam123");
		Set<Role> userroles = new HashSet<>();
		userroles.add(userRoles);
		user.setRole(userroles);
		userDao.save(user);
		System.out.println("Service Role Service 59");

	}
*/
}
