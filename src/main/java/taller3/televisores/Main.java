package televisores;

public class Main {

	public static void main(String[] args) {

		Marca marca =  new Marca("Semsung");
		   
		   TV tv =  new TV(marca, true);
		   Control control =  new Control();
		   
		   control.enlazar(tv);
		

	System.out.println(control.getTv());}}
