# Habitaciones


package nebrija;

import java.util.Scanner;

public class habitat {
	

	
	static String UserName;
	Scanner sc = new Scanner(System.in);
	
	
	void MenuInicio() {
		
		
		System.out.println("Bienvenido a la mazmorra de VELAX.");
		System.out.println("Introduce el nombre que va a tener el protagonista: ");
		UserName = sc.nextLine();	
	}
	
	void Movimiento1() {
		
		System.out.println("Menu de movimiento-->");
		System.out.println("Pulsa N para desplazarte hacia el Norte.");
		System.out.println("Pulsa E para desplazarte hacia el Este.");
		System.out.println("Pulsa O para desplazarte hacia el Oeste.");
		System.out.println("Pulsa S para desplazarte hacia el Sur.");
		System.out.println("Para retroceder pulsa A.");
		System.out.println("");
		System.out.println("Introduce la Z para salir del juego.");
		
		
		
		//String MovimientoInicial=sc.nextLine();
		
	}
	

	private char va,vb,vi,vd;
	
	static int maxpuertas=4;
	
	
	
	
	habitat (char arriba,char derecha, char izquierda, char abajo){
	
	int cont=0;
	
	if (arriba==' ') {
		cont++;
	}
	if (derecha==' ') {
		cont++;
	}
	if (izquierda==' ') {
		cont++;
	}
	if (abajo==' ') {
		cont++;
	}

	if (cont<=maxpuertas) {
		va=arriba;
		vi=izquierda;
		vd=derecha;
		vb=abajo;
	}
		
	}
	
	
	static void setmax (int num){
		
		if (num<=4 && num>=0) {
			maxpuertas=num;
		}
	}
	
	
	void printMe() {
		System.out.println("####"+va+"####");
		System.out.println("#       #");
		System.out.println("");
		System.out.println(vi +" " + UserName    +("  ")  +vd);
		System.out.println("");
		System.out.println("#       #");
		System.out.println("####"+vb+"####");
		
	}
	
	private static char vA='-',vI='|',vD='|',vB='-'; 
	
	private static boolean Parriba=true, Pderecha=true, Pabajo=true, Pizquierda=true, Earriba=true,Eabajo=true,Eizquierda=true,Ederecha=true,Existe=true;
	  
	void Booleanos() {
		
		 
			char raya = '-';
			char rayo = '|';
		
		if(Earriba) {
		  if(vA==raya) {
				
				Parriba= true;
				
			}else {
				
				Parriba = false;
				
			}
		  }else {
			  
			  Parriba = false;
			  
		  }
			
			
			if(Eabajo) {
			if(vB==raya) {
				
				Pabajo= true;
				
			}else {
				
				Pabajo = false;
				
			}}else{
				
				
				Pabajo = false;
				
				
			}
			
			if(Eizquierda) {
				
			if(vI==rayo) {
				
				Pizquierda= true;
				
			}else {
				
				Pizquierda = false;
				
			}}else {
				
				
				Pizquierda = false;
				
				
			}
			
			
			if(Ederecha) {
			
			if(vD==rayo) {
		
				Pderecha= true;
		
			}else {
		
				Pderecha = false;
		
			}}else {
				
				
				Pderecha = false;
				
			}
			
			
			if(Earriba|| Ederecha ||Eabajo ||Eizquierda) {
				
				Existe = true;
				
			}else {
				
				Existe = false;
				
				
			}
				
	}
	
	/*void Mapa() {
		
		int hola[][];
		
		int hola [][]= new hola[3][5];
		
		
		
	}*/
	
	
	  public static void main(String[] args) {
		  
		
		  habitat.setmax(4);
		  
		  habitat cocina =new habitat(vA,vI,vD,vB);
		 
			cocina.MenuInicio();
			cocina.printMe();
			
			
		vA= ' ';
			
		habitat cocina1 = new habitat(vA,vI,vD,vB);
			
		
		cocina1.printMe();
		cocina1.Booleanos();
		
		if(Existe) {
		
		System.out.println("La habitacion existe.");
		
			
		}
	
}
}

