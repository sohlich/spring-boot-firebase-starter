package com.leaflearn.llresource.service.impl;

import com.leaflearn.llresource.security.FirebaseUserDetails;
import com.leaflearn.llresource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.*;

@Service(value = UserServiceImpl.NAME)
public class UserServiceImpl implements UserService {

	public final static String NAME = "UserService";


	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails userDetails = new FirebaseUserDetails(username);
		if (userDetails == null)
			return null;


		return userDetails;
	}

	@PostConstruct
	public void init() {

	}


}
