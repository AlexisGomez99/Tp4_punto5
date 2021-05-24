package ar.edu.unrn.modelo;

public abstract class Calculador {
	private String nombrePrenda;
	
	
	public double calcularPrecio(double precioPrenda){
		return precioPrenda + recargoUnitario(precioPrenda) + impuestoAduanero(precioPrenda)
		+transporte(precioPrenda)+ bonificacion(precioPrenda)+ precioFinal(precioPrenda);
	}

	public abstract double recargoUnitario(double precio);
	public abstract double impuestoAduanero(double precio);
	public abstract double precioFinal(double precio);
	public abstract double transporte(double precio);
	public abstract double bonificacion(double precio);
	
}
