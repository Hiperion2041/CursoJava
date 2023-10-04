package Ej4Clase;

public class itemCarrito {
	
	private Producto producto;
	private int cantidad;

	public itemCarrito(Producto producto,int cantidad) {
		
		this.producto=producto;
		if(cantidad<3) {
			this.cantidad = cantidad;
			}else System.out.println("Error, la cantidad es mayor a 3");
	}
	public itemCarrito() {
		
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if(cantidad<=3) {
		this.cantidad = cantidad;
		}else System.out.println("Error, la cantidad es mayor a 3");
	}
	
	
}
