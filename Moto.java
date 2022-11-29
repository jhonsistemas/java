package rex;

public class Moto extends Vehiculo{

	
	public Moto(String color, String modelo, int ruedas, int anio) {
		super(color, modelo, ruedas, anio);
	}
	
	public Moto() {
		super();
	}
	
	public void acelerar() {
		this.setAceleracion(50);
	}
}
