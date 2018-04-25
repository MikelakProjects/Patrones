package main.patrones.strategy.impl;

import main.patrones.strategy.AbstractArea;

public class AreaPoligonoRegular extends AbstractArea {

	private float radio;
	private int numLados;
	
	public AreaPoligonoRegular(float radio, int numLados) {
		super("Polígono regular");
		this.radio 	  = radio;
		this.numLados = numLados;
	}
	
	@Override
	public float calcularArea() {
		double numerador = numLados * Math.pow(radio, 2) * Math.sin((2 * Math.PI) / numLados);
		double denominador = 2;
		return (float) ((float) numerador / denominador);
	}
}
