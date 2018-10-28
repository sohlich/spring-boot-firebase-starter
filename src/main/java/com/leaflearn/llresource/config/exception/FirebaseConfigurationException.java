package com.leaflearn.llresource.config.exception;

import java.io.IOException;

/**
 * Created by Radomir Sohlich on 27/10/2018.
 */
public class FirebaseConfigurationException extends RuntimeException {

    public FirebaseConfigurationException() {
    }

    public FirebaseConfigurationException(String message) {
        super(message);
    }

    public FirebaseConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirebaseConfigurationException(Throwable cause) {
        super(cause);
    }

    public FirebaseConfigurationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
