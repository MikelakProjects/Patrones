package main.patrones.strategy.impl;

import main.patrones.strategy.AbstractArea;

public class AreaCircular extends AbstractArea {

	private float radio;
	
	public AreaCircular(float radio) {
		super("Círculo");
		this.radio = radio;
	}
	
	@Override
	public float calcularArea() {
		return (float) (Math.PI * Math.pow(radio, 2));
	}
}
