package Ej4Clase;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.StandardOpenOption;

public class clase4Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		clase4Ej2 h= new clase4Ej2();
		h.sumarDesdeTxT();
		h.codificarTexto();
		
	}
	
	public void sumarDesdeTxT() {
		
		String rutarelativa="Recursos/texto.txt";
		Scanner sc=new Scanner(System.in);
		Path archivo=Paths.get(rutarelativa);
		Integer i=0;
		System.out.println("Desea multiplicar (M) o sumar (S)");
		String h=sc.nextLine();
		int cont=0;
		try {
			for (String g:Files.readAllLines(archivo)) {
				if(cont>0) {
				if(h.equals("S")) {
				i=i+Integer.parseInt(g);
				} else if(h.equals("M")) {
					i=i*Integer.parseInt(g);
				}
				}
				if(cont<1) {
					i=Integer.parseInt(g);
				cont++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
		sc.close();
	}
	
	public void codificarTexto() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Desea codificar (C) o decodificar (D)");
		String resp=sc.nextLine();
		
		if (resp.toUpperCase().equals("C")) {
			System.out.println("Escriba la ruta relativa donde se encuentra el texto a codificar");
			String textoCodificar=sc.nextLine();
			System.out.println("Ingrese la ruta relativa donde quiere que se guarde la codificacion");
			String textoCodificado=sc.nextLine();
			System.out.println("Escriba la cantidad de espacio a ser codificado");
			Integer cant=Integer.parseInt(sc.nextLine());
			Path cod=Paths.get(textoCodificar);
			try {
				for(String h:Files.readAllLines(cod)) {
					byte[] codif=h.getBytes();
					
					for(int i=0;i<codif.length;i++) {
						codif[i]=(byte) (codif[i]+cant);
					}
					
					String codificado=new String(codif);
					
					Files.writeString(Paths.get(textoCodificado), codificado+"\n",StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					System.out.println("El texto fue codificado con exito");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error en la codificacion no se pudo codificar");
				e.printStackTrace();
			}
		}
		
		if (resp.toUpperCase().equals("D")) {
			System.out.println("Escriba la ruta relativa donde se encuentra el texto a decodificar");
			String textoDecodificar=sc.nextLine();
			System.out.println("Ingrese la ruta relativa donde quiere que se guarde la decodificacion");
			String textoDecodificado=sc.nextLine();
			System.out.println("Escriba la cantidad de espacio a ser decodificado");
			Integer cant=Integer.parseInt(sc.nextLine());
			Path cod=Paths.get(textoDecodificar);
			Path decod=Paths.get(textoDecodificado);
			try {
				
				for(String h:Files.readAllLines(cod)) {
					byte[] codif=h.getBytes();
					
					for(int i=0;i<codif.length;i++) {
						codif[i]=(byte) (codif[i]-cant);
					}
					
					String codificado=new String(codif);
					
					Files.writeString(decod, codificado+"\n",StandardOpenOption.CREATE, StandardOpenOption.APPEND);
					System.out.println("El texto fue decodificado con exito");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error en la codificacion no se pudo codificar");
				e.printStackTrace();
			}
			sc.close();
		}
	}
	
}
