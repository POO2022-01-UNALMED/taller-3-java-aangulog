package televisores;

public class Marca {

	private String nombre;
	
	public Marca(String nombre){
		this.nombre = nombre;
	}
	
	public void setMarca(String marca){
		this.nombre = marca;
	}
	
	public String getMarca() {
		return this.nombre;
	}	
}