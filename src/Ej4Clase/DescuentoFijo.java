package Ej4Clase;

public class DescuentoFijo extends Descuento {
	
	private double descuentoFijo;

	public DescuentoFijo(double descuentofijo) {
		
		this.descuentoFijo=descuentofijo;
	}
	
	@Override
	public double descuentoHacer(double total) {
		
		return total-descuentoFijo;
	}
	
}
