package main.patrones.strategy.exceptions;

public class ConstructorIncorrectException extends Exception {

	private static final long serialVersionUID = -661867824307530535L;

	public ConstructorIncorrectException() {
		super("El constructor es incorrecto");
	}
}
