package com.leaflearn.llresource.service.impl;

import com.leaflearn.llresource.security.FirebaseTokenHolder;
import com.leaflearn.llresource.service.FirebaseService;
import com.leaflearn.llresource.service.shared.FirebaseParser;
import org.springframework.stereotype.Service;

@Service
public class FirebaseServiceImpl implements FirebaseService {
	@Override
	public FirebaseTokenHolder parseToken(String firebaseToken) {
		return new FirebaseParser().parseToken(firebaseToken);
	}
}
