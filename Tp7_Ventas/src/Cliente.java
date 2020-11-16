
public class Cliente {

	private String apellido;
	private String nombre;
	private String direccion;
	
	public Cliente(String ape, String nom, String direc) {
		apellido=ape;
		nombre=nom;
		direccion=direc;
	}
	
	public String getApellidoCliente() {
		return(apellido);
	}
	public String getNombreCliente() {
		return(nombre);
	}
	public String getDirecCliente() {
		return(direccion);
	}
	
	public void mostrarCliente() {
		System.out.println("apellido: "+apellido+" nombre:"+nombre+" direccion: "+direccion);
	}
	
	public void listaCliente(String apellido) {
		
	}
}
