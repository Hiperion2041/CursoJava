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
			preciototal+=(i.getProducto().getPrecio())*i.getCantidad();
			
		}
		return preciototal;
	}
	
	public String toString() {
		
		for(itemCarrito i:carro) {
			return i.getProducto().getNombre()+"\n"+
					i.getProducto().getPrecio()+"\n"+
					i.getCantidad();
			
		}
		return "a";
	}

	public ArrayList<itemCarrito> getCarro() {
		return carro;
	}

	

}
