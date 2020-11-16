
public class Sistemas {

	Facturas lista[]= new Facturas[500];
	
	public Sistemas() {
		lista[225]=new Facturas(1,"2020/10/26",new Cliente("lopez","lola","tucasa"));
		lista[105]=new Facturas(2,"2020/10/27",new Cliente("cricriDe","pajaro","sucasa"));
		lista[025]=new Facturas(3,"2020/10/28",new Cliente("miama","loca","micasa"));
	}
	
	public void listarImporte() {
		for(int i=0; i<lista.length;i++) {
			if(lista[i]!=null) {
				System.out.print("numero de factura: "+i+" ");
				lista[i].sumarPrecio();
			}
		}
	}
	
	public void listadoPorApellidoTotal(String apellido) {
		for(int i=0;i<lista.length;i++) {
			if(lista[i]!=null) {
				if(lista[i].getCliente().getApellidoCliente().equalsIgnoreCase(apellido)) {
				System.out.print("la facturacion del cliente : "+lista[i].getCliente().getApellidoCliente()+" es ");
				lista[i].totalFactura();
				}
			}
		}
	}
}
