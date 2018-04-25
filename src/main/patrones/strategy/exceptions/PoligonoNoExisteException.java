package main.patrones.strategy.exceptions;

public class PoligonoNoExisteException extends Exception {
	
	private static final long serialVersionUID = 5864253553672461183L;

	public PoligonoNoExisteException() {
		super("El polígono no existe");
	}
}
