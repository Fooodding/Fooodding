package com.fooding.api.infra.s3.exception;

public class S3Exception extends RuntimeException {

	public S3Exception() {
	}

	public S3Exception(String message) {
		super(message);
	}

	public S3Exception(String message, Throwable cause) {
		super(message, cause);
	}

	public S3Exception(Throwable cause) {
		super(cause);
	}

}
