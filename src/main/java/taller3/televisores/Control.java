package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public TV getTv() {
		return this.tv;
	}
	
	public void canalUp() {
		if (this.tv.getCanal()<120 && this.tv.getEstado() == true)
			this.tv.canalUp();
		else return;
	}
	
	public void canalDown() {
		if (this.tv.getCanal()>1 && this.tv.getEstado() == true)
			this.tv.canalDown();
		else return;
	}
	
	public void volumenUp() {
		if (this.tv.getVolumen()<7 && this.tv.getEstado() == true)
			this.tv.volumenUp();
		else return;
	}
	
	public void volumenDown() {
		if (this.tv.getVolumen()>0 && this.tv.getEstado() == true)
			this.tv.volumenDown();
		else return;
	}
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	public void setCanal(int canal){
		if(this.tv.getEstado() == true && canal>=1 && canal<=120)
			this.tv.setCanal(canal);
		else return;
	}
}
