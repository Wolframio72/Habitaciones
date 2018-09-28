package nebrija;

import java.util.Scanner;



public class menu {
	
	private static int menu = 0;
	private static int edad = 0;
	private static String nombre;
	private static float peso = 0;
	private static String raza;
	private static int x =0;
	private static boolean ebo = true;
	
	void Menu() {
		
		Scanner hola = new Scanner(System.in);
		
		System.out.println("Introduce un 1 para perros y un 2 para gatos.");
		
		menu = hola.nextInt();
		
	}
	
	void opciones() {
		
		
		while(menu==1||menu==2) {
			
			
			switch(menu) {
			
			case 1:
				
				
				
				
				Scanner sc = new Scanner(System.in);
				Scanner holi = new Scanner(System.in);
				
				Perro perrito = new Perro();

				System.out.println("Introduce la edad del perro:");
				edad = sc.nextInt();
				System.out.println("Introduce el nombre del perro: ");
				nombre = holi.nextLine();
				System.out.println("Introduce el peso del perro: ");
				peso = sc.nextFloat();
				System.out.println("Introduc la raza del perro: ");
				raza = holi.nextLine();
				System.out.println("El perro tiene ebola 1 o 0?.");
				x = sc.nextInt();
				
				if(x == 1) {
				
					ebo = true;
					
				}else {
					
					ebo = false;
					
				}
					
				perrito.setEdad(edad);
				perrito.setPeso(peso);
				perrito.setNombre(nombre);
				perrito.setRaza(raza);
				perrito.setEbola(ebo);
				
				
				System.out.println("La edad del perro es : " + perrito.getEdad());
				System.out.println("El peso del perro es: "+perrito.getPeso());
				System.out.println("El nombre del perro es: "+perrito.getNombre());
				System.out.println("La raza del perro es: "+perrito.getRaza());
				
				
				if(perrito.getEbola()) {
					
				System.out.println("El perro la va a palmar no mas.");
				
				break;
				
				}
				
				
			case 2:
				
				Gato gatito = new Gato();
				break;
				
			default: 	
			
			break;
				
				
			}
			
			
			
			
			
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		menu jony = new menu();
		
		jony.Menu();
		jony.opciones();
		
		
		
		
		
			
		
	
		
			
			
		}
		
		
		
	}


