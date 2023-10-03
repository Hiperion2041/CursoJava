package primerproyecto;

public class ej2Clase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ej2Clase3 prueba= new ej2Clase3();
		
		prueba.codificador("hola que tal");
		prueba.codificador2Lugares("hola que tal");

	}
	
	public void codificador(String frase) {
		byte[] codif=frase.getBytes();
		
		for(int i=0;i<codif.length;i++) {
			codif[i]++;
		}
		
		String codificado=new String(codif);
		
		System.out.println(codificado);
	}
	
	public void codificador2Lugares(String frase) {
byte[] codif=frase.getBytes();
		
		for(int i=0;i<codif.length;i++) {
			codif[i]=(byte) (codif[i]+2);
		}
		
		String codificado=new String(codif);
		
		System.out.println(codificado);
	}

}
