package ar.edu.unrn.modelo;

public class RemerasImportadas extends Calculador{
	
	public RemerasImportadas() {
		
	}

	@Override
	public double recargoUnitario(double precio) {
		return precio * 0.03;
	}

	@Override
	public double impuestoAduanero(double precio) {
		return precio * 0.05;
	}

	@Override
	public double precioFinal(double precio) {
		return precio * 0.25;
	}

	@Override
	public double transporte(double precio) {
		return 0;
	}

	@Override
	public double bonificacion(double precio) {
		return 0;
	}
	
}
