package com.leaflearn.llresource.service;

import com.leaflearn.llresource.security.FirebaseTokenHolder;

public interface FirebaseService {

	FirebaseTokenHolder parseToken(String idToken);

}
