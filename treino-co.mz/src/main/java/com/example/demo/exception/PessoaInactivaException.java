package com.example.demo.exception;

public class PessoaInactivaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PessoaInactivaException(String string) {
		super(string);
	}

}
