package ar.edu.unrn.modelo;

public class RemerasImportadas extends Calculador{
	
	public RemerasImportadas() {
		
	}

	public double calcularPrecio(double precioPrenda) {
		double total= precioPrenda +(precioPrenda * 0.03);
		total += total*0.05;
		total += total* 0.25;
		return total;
		
	}
	
}
