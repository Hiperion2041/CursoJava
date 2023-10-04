package Ej4Clase;
import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<itemCarrito> carro=new ArrayList<itemCarrito>();
	
	public Carrito() {
		
	}
	
	public void agregarItem(itemCarrito item) {
		if(carro.size()<3) {
		carro.add(item);
		}else System.out.println("Limite de carrito alcanzado");
	}
	
	public double PrecioTotal() {
		double preciototal=0;
		for (itemCarrito i:carro) {
			int cantidad=i.getCantidad();
			preciototal+=(i.getProducto().getPrecio())*cantidad;
			
		}
		return preciototal;
	}

}
