package rex;

public class Vehiculo {
	
	private String color;
	private String modelo;
	private int ruedas;
	private int anio;
	private int aceleracion=0;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String color, String modelo, int ruedas, int anio) {
		this.color = color;
		this.modelo = modelo;
		this.ruedas = ruedas;
		this.anio = anio;
		;
	}
	
	public void acelerar() {
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public int getAceleracion() {
		return aceleracion;
	}

	public void setAceleracion(int aceleracion) {
		this.aceleracion += aceleracion;
	}
	
	
	
	

}
