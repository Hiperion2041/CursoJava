package Ej4Clase;

public class pruebaProducto {
	
	public static void main(String[] args) {
		
		Producto producto1=new Producto("Lapiz",20);
		Producto producto2=new Producto("Goma",50);
		Producto producto3=new Producto("Carpeta",50);
		itemCarrito item1=new itemCarrito(producto1,2);
		itemCarrito item2=new itemCarrito(producto2,2);
		itemCarrito item3=new itemCarrito(producto3,2);
		Carrito carro1=new Carrito();
		carro1.agregarItem(item1);
		carro1.agregarItem(item2);
		carro1.agregarItem(item3);
		System.out.println(carro1.PrecioTotal());
		DescuentoFijo des=new DescuentoFijo(40);
		System.out.println(des.descuentoHacer(carro1.PrecioTotal()));
		DescuentoProcentaje des1=new DescuentoProcentaje(20);
		System.out.println(des1.descuentoHacer(carro1.PrecioTotal()));
	}

}
