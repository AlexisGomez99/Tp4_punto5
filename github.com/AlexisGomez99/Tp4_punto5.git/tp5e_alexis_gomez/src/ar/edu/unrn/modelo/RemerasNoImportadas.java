package ar.edu.unrn.modelo;

public class RemerasNoImportadas extends Calculador{

	public RemerasNoImportadas() {

	}

	@Override
	public double recargoUnitario(double precio) {
		return 0;
	}

	@Override
	public double impuestoAduanero(double precio) {
		return 0;
	}

	@Override
	public double precioFinal(double precio) {
		return precio * 0.15;
	}

	@Override
	public double transporte(double precio) {
		return precio * 0.015;
	}

	@Override
	public double bonificacion(double precio) {
		return precio * 0.20;
	}
}
