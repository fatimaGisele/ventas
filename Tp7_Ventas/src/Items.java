
public class Items {
	
private String descripcion;
private double precio;
private int cantidad;

public Items(String desc, double p, int cant) {
	descripcion=desc;
	precio=p;
	cantidad=cant;
}
public double getPrecio() {
	return(precio);
}
public int getCant() {
	return(cantidad);
}
public void mostrarItems() {
	System.out.println("descripcion: "+descripcion+" precio unitario: "+precio+" cantidad: "+cantidad);
}
public void precioItem() {
	double tot=0;
	tot=precio*cantidad;
	System.out.println("por la cantidad de: "+cantidad+" a un precio de: "+precio+" cada uno, es un total de: "+tot);
}
public String getDesc() {
	return(descripcion);
}
}
