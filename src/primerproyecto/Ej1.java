package primerproyecto;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej1 prueba= new Ej1();
		prueba.entreNumeros(5, 20);
		prueba.entreNumerospar(5, 20);
		prueba.entreNumerosparoimpar(5, 20, false);
		prueba.numerosImparFor(5, 20);
		System.out.println(prueba.esClaseAlta(10000,4,10,2,false));
		}
	
	public void entreNumeros(int a, int b) {
		while (a<=b) {
			System.out.println(a);
			a++;
		}
		System.out.println("===============================");
	}
		public void entreNumerospar(int a, int b) {
			while (a<=b) {
				if(a%2==0) {
					System.out.println(a);
					}
				a++;
				}
			System.out.println("===============================");
				
			}
		
		public void entreNumerosparoimpar(int a, int b, boolean c) {
			
			if(c==true) {
				System.out.println("Se mostraran los numeros pares");
				while(a<b) {
					if(a%2==0) {
						System.out.println(a);
					}
					a++;
				}
				System.out.println("===============================");
			} else if(c==false) {
				System.out.println("Se mostraran los numeros impares");
				while (a<b) {
					if(a%2!=0) {
						System.out.println(a);
					}
					a++;
				}
				System.out.println("===============================");
			}
			
		}
		
		public void numerosImparFor(int a, int b) {
			for (a=a;a<b;a++) {
				
				if(a%2!=0) {
					System.out.println(a);
				}
			}
		}
		
		public boolean esClaseAlta(int ingresosTotales, int cantVehiculos,int antVehiculos, int cantInmuebles, boolean poseLujo) {
			return ingresosTotales>=489083||(cantVehiculos>=3 && antVehiculos<5)||cantInmuebles>=3||poseLujo==true;
			
		}
		
	}


