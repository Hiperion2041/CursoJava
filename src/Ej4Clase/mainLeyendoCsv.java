package Ej4Clase;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class mainLeyendoCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String archivo="Recursos/items.csv";
		Path ruta=Paths.get(archivo);
		Carrito carro1=new Carrito();
		try {
			for(String i:Files.readAllLines(ruta)) {
				String[] partes=i.split(",");
				String nombre=partes[0];
				Double precio=Double.parseDouble(partes[1]);
				Integer cantidad=Integer.parseInt(partes[2]);
				Producto producto=new Producto(nombre,precio);
				itemCarrito carrito1=new itemCarrito();
				carrito1.setProducto(producto);
				carrito1.setCantidad(cantidad);
				carro1.agregarItem(carrito1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(carro1.PrecioTotal());
		

	}

}
