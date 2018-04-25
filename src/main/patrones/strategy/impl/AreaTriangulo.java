package main.patrones.strategy.impl;

import main.patrones.strategy.AbstractArea;

public class AreaTriangulo extends AbstractArea {

	private float base;
	private float altura;
	
	public AreaTriangulo(float base, float altura) {
		super("Triángulo");
		this.base 	= base;
		this.altura = altura;
	}
	
	@Override
	public float calcularArea() {
		return this.base * this.altura;
	}
}
