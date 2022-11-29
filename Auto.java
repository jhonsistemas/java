package rex;

public class Auto extends Vehiculo{
	
	public Auto(String color, String modelo, int ruedas, int anio) {
		super(color, modelo, ruedas, anio);
		// TODO Auto-generated constructor stub
	}
	
	public Auto() {
		super();
	}

	public void acelerar() {
		this.setAceleracion(100);
	}
	

}
