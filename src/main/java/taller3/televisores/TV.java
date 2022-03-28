package taller3.televisores;

public class TV {
	private static int numTV=0;
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV+=1;
	}
	
	public void setMarca(Marca marca){
		this.marca = marca;
	}
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setControl(Control control){
		this.control = control;
	}
	public Control getControl() {
		return this.control;
	}
	
	public void setPrecio(int precio){
		this.precio = precio;
	}
	public int getPrecio(){
		return this.precio;
	}
	
	public void setVolumen(int volumen){
		if(this.estado == true && volumen >=0 && volumen <=7)
			this.volumen = volumen;
		else return;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setCanal(int canal){
		if(this.estado == true && canal>=1 && canal<=120)
			this.canal = canal;
		else return;
	}
	public int getCanal() {
		return this.canal;
	}
	
	public static void setNumTV(int num){
		TV.numTV = num;
	}
	public static int getNumTV() {
		return TV.numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (this.canal<120 && this.estado == true)
			this.canal+=1;
		else return;
	}
	
	public void canalDown() {
		if (this.canal>1 && this.estado == true)
			this.canal -= 1;
		else return;
	}
	
	public void volumenUp() {
		if (this.volumen<7 && this.estado == true)
			this.volumen += 1;
		else return;
	}
	
	public void volumenDown() {
		if (this.volumen>0 && this.estado == true)
			this.volumen -= 1;
		else return;
	}
}