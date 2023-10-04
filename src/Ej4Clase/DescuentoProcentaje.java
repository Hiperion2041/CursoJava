package Ej4Clase;

public class DescuentoProcentaje extends Descuento{
	
	private double porcentaje;
	
	public DescuentoProcentaje(double porcentaje) {
		
		this.porcentaje=porcentaje;
	}

	public double descuentoHacer(double total) {
		
		return total*(1-porcentaje/100);
	}
}
