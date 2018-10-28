package com.leaflearn.llresource.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.leaflearn.llresource.config.exception.FirebaseConfigurationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

@Configuration
public class FirebaseConfig {


	@Value("classpath:plant-grow-2018-405f7b38397f.json")
	Resource resourceFile;

	@PostConstruct
	public void init() {

		try(InputStream inputStream = resourceFile.getInputStream()) {
			FirebaseOptions options =
					new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(inputStream)).build();
			FirebaseApp.initializeApp(options);
		} catch (IOException e) {
			throw new FirebaseConfigurationException(e);
		}

	}
}
