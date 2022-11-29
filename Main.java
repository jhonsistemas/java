package rex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Moto moto1= new Moto("red", "XXX", 2,2020);
		Moto moto2= new Moto();
		Auto auto1 = new Auto("blue", "Au",4,2022);
		Auto auto2 = new Auto();
		
		System.out.println("Ingresa el modelo, color, año y numero de ruedas de la moto2");
		moto2.setModelo(sc.nextLine());
		moto2.setColor(sc.nextLine());
		moto2.setAnio(sc.nextInt());
		moto2.setRuedas(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Ingresa el modelo, color, año y numero de ruedas de la auto2");
		auto2.setModelo(sc.nextLine());
		auto2.setColor(sc.nextLine());
		
		auto2.setAnio(sc.nextInt());
		auto2.setRuedas(sc.nextInt());
		
		System.out.println("Moto1: "+"Modelo: "+moto1.getModelo()+" ,Color: "+moto1.getColor()+" , Año: "+moto1.getAnio()+" ,Ruedas: "+moto1.getRuedas());
		System.out.println("Moto2: "+"Modelo: "+moto2.getModelo()+" ,Color: "+moto2.getColor()+" , Año: "+moto2.getAnio()+" ,Ruedas: "+moto2.getRuedas());
		System.out.println("Auto1: "+"Modelo: "+auto1.getModelo()+" ,Color: "+auto1.getColor()+" , Año: "+auto1.getAnio()+" ,Ruedas: "+auto1.getRuedas());
		System.out.println("Auto2: "+"Modelo: "+auto2.getModelo()+" ,Color: "+auto2.getColor()+" , Año: "+auto2.getAnio()+" ,Ruedas: "+auto2.getRuedas());
		
		
		auto1.acelerar();
		moto1.acelerar();
		
		System.out.println(auto1.getAceleracion());
		System.out.println(moto1.getAceleracion());

	}

}
