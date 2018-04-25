package main.patrones.strategy.exceptions;

public class PoligonoNoSoportadoException extends Exception {

	private static final long serialVersionUID = 1612665371341498178L;

	public PoligonoNoSoportadoException() {
		super("El polígono no está soportado");
	}
}
