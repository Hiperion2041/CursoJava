package Ej4Clase;
import java.util.Scanner;

public class Ej4Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ej4Clase testh= new Ej4Clase();
		
		testh.ordenarSegun(0, 0, 0, null);
		testh.ascOrDesc(30, 60, 40, "D");
		testh.ascOrDescPidNum();
		
	}
	
	public void ascOrDesc(int num1, int num2, int num3, String comohacer) {
	    int[] orden = new int[3];
	    
	    
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
	
	
	public void ascOrDescPidNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		Integer num1=Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese el segun numero");
		Integer num2=Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese el tercer numero");
		Integer num3=Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese si desea que sea Ascendente(A) o descendente (D)");
		String comohacer=sc.nextLine();
		comohacer.toUpperCase();
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
	    sc.close();
		
	}
	
	public void ordenarSegun(int a, int b,int c, String h) {
		
		if(a==0 && b==0 && c==0 && h==null) {
			
			ascOrDescPidNum();
		}else ascOrDesc(a,b,c,h);
		
		
	}

}
