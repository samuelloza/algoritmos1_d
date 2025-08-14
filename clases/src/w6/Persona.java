package w6;

public class Persona {
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String MostrarPersona() {
		return "Datos de la persona " + this.nombre + " " + this.apellido;
	}
}
