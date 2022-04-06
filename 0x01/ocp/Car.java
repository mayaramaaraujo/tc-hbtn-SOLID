package com.example.demo.solid;

public class Car extends Vehicle implements IVehicleCar {

	public Car(String color, String year, double engine) {
		super(color, year, engine);
		configureVehicle(color, year, engine, 0);
	}

	@Override
	public void configureVehicle(String color, String year, double engine, int seats) {
		System.out.println("Criando um carro com Interface: " + color + " " + engine);
	}

	@Override
	public void startVehicle() {
		System.out.println("Ligando os Motores com Interface");
	}

}
