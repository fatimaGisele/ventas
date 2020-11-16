
public class Facturas {

	Items items[]=new Items[10];
	
	private int id;
	private String fecha;
	private Cliente c1;
	
	
	public Facturas(int id, String fecha, Cliente c) {
		this.id=id;
		this.fecha=fecha;
		c1=c;
		items[5]= new Items("saraza", 56.5,6);
		items[4]=new Items("lola",5000,3);
		items[3]=new Items("cocucha",205,2);
	}
	
	public void mostrarFactura() {
		for(int i=0; i<items.length;i++) {
			if(items[i]!=null) {
				System.out.println("numero de factura: "+i);
				System.out.println("n° factura: "+id+" fecha: "+fecha);
				c1.mostrarCliente();
				items[i].mostrarItems();
			}
		}
	}
	
	public void totalFactura() {
		double tot=0, subt=0;
		for(int i=0; i<items.length;i++) {
			if(items[i]!=null) {
			subt=items[i].getPrecio()*items[i].getCant();
			tot=tot+subt;
			System.out.println("el total es: "+tot);
			}
		}
	}
	
	public void mostrarPrecioItems() {
		for(int i=0;i<items.length;i++) {
			if(items[i]!=null) {
				System.out.println("el precio del item: "+i+" "+items[i].getDesc()+" es: "+items[i].getPrecio());
			}
		}
	}
	public void sumarPrecio() {
		double tot=0;
		for (int i=0; i<items.length ; i++) {
			if (items[i] != null) {
				tot = tot + items[i].getPrecio();
			}
		} 
		System.out.println("El total es: "+tot);
	}
	public Cliente getCliente() {
		return (this.c1);
	}
}
