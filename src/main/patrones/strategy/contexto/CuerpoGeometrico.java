package main.patrones.strategy.contexto;

import main.patrones.strategy.AbstractArea;
import main.patrones.strategy.exceptions.ConstructorIncorrectException;

public class CuerpoGeometrico {

	private AbstractArea _estrategia;
	private final float  radio;
	private final int 	 lados;
	private final float	 base;
	private final float  altura;
	
	/**
	 * Constructor para polígonos regulares
	 */
	public CuerpoGeometrico(float radio, int lados) throws ConstructorIncorrectException {
		if (lados < 5) {
			throw new ConstructorIncorrectException();
		}
		this.radio 	= radio;
		this.lados 	= lados;
		this.base  	= 0;
		this.altura = 0;
	}
}
