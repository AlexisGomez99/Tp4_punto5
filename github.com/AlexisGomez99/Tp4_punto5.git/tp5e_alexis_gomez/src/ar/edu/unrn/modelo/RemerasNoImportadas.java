package ar.edu.unrn.modelo;

public class RemerasNoImportadas extends Calculador{

	public RemerasNoImportadas() {

	}

	public double calcularPrecio(double precioPrenda) {
		double total= precioPrenda +(precioPrenda * 0.015);
		total += total*0.2;
		total += total*0.15;
		return total;
		
	}
}
