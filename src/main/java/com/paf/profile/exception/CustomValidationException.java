package com.paf.profile.exception;
/**
 *  Common application exception.
 *
 * @author ADITHYA
 */
public class CustomValidationException extends RuntimeException {
    public CustomValidationException() {
        super();
    }

    public CustomValidationException(String s) {
        super(s);
    }

    public CustomValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
