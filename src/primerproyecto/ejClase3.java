package primerproyecto;
import java.util.Scanner;

public class ejClase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejClase3 prueba=new ejClase3();
		
		prueba.cantidadAparaciones("gooool", 'o');
		
		prueba.ascOrDesc(2, 4, 6, "D");
		
		prueba.ascOrDesc(847, 245, 645, null);
		
		prueba.sumarMenores();

	}

	public void cantidadAparaciones (String palabra,char letra) {
		int contador=0;
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)==letra){
				contador++;
			}
		}
		System.out.println("La cantidad de veces que aparece la letra "+letra+" es "+contador);
	}
	
	public void ascOrDesc(int num1, int num2,int num3,String comohacer) {
		int[] orden=new int[3];
		if (num1 <= num2 && num1 <= num3) {
	        orden[0] = num1;
	        if (num2 <= num3) {
	            orden[1] = num2;
	            orden[2] = num3;
	        } else {
	            orden[1] = num3;
	            orden[2] = num2;
	        }
	    } else if (num2 <= num1 && num2 <= num3) {
	        orden[0] = num2;
	        if (num1 <= num3) {
	            orden[1] = num1;
	            orden[2] = num3;
	        } else {
	            orden[1] = num3;
	            orden[2] = num1;
	        }
	    } else {
	        orden[0] = num3;
	        if (num1 <= num2) {
	            orden[1] = num1;
	            orden[2] = num2;
	        } else {
	            orden[1] = num2;
	            orden[2] = num1;
	        }
	    }

	    if ("D".equals(comohacer)) {
	        int temp = orden[0];
	        orden[0] = orden[2];
	        orden[2] = temp;
	    }

	    for (int i : orden) {
	        System.out.println(i);
	    }
		
	}
	
	public void sumarMenores() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingrese tamaño del vector deseado");
			int vect=sc.nextInt();
			int[] vector1=new int[vect];
			for(int i=0;i<vect;i++) {
				System.out.println("Ingrese un numero");
				int num1=sc.nextInt();
				vector1[i]=num1;
			}
			int suma =0;
			System.out.println("Ingrese numero para que los menores se sumen");
			int num2 =sc.nextInt();
			System.out.println("=======");
			for (int i=0;i<vector1.length;i++) {
				
				if(vector1[i]<num2) {
					int cont=vector1[i];
					suma=suma+cont;
				}
				
			}
			
			System.out.println("La suma da "+suma);
		}
	}
}
