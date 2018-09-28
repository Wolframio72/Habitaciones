package nebrija;

public class Animal {

	private int edad = 0;
	private String nombre;
	private float peso;
	
	public int getEdad(){
		return edad;
	}
	
	public float getPeso(){
		return peso;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	
	public void setEdad(int n) {
		
		if(n>=0) {
			edad=n;
		}
	}
	public void setPeso(float a) {
		
		if(a>=0) {
			peso=a;
		}
	}
	public void setNombre(String c) {
		
		nombre = c;
	
	}
	
	
	
	
	
}
