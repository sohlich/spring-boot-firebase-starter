package com.leaflearn.llresource.service.shared;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import com.leaflearn.llresource.security.FirebaseTokenHolder;
import com.leaflearn.llresource.service.exception.FirebaseTokenInvalidException;
import org.apache.commons.lang3.StringUtils;

public class FirebaseParser {
	public FirebaseTokenHolder parseToken(String idToken) {
		if (StringUtils.isBlank(idToken)) {
			throw new IllegalArgumentException("FirebaseTokenBlank");
		}
		try {
			FirebaseToken token =
					FirebaseAuth.getInstance().verifyIdToken(idToken);


			return new FirebaseTokenHolder(token);
		} catch (Exception e) {
			throw new FirebaseTokenInvalidException(e.getMessage());
		}
	}
}
