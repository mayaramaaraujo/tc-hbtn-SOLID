package com.example.demo.solid;
import com.example.demo.solid.Car;
import com.example.demo.solid.Motorcycle;

public class Main {
	private static String typeVehicle;
	public static void main(String[] args) {
		typeVehicle = "CAR";

        if (typeVehicle == "CAR"){
            Car vehicle = new Car("Azul", "2022", 2.6);
            vehicle.startVehicle();
        } else if (typeVehicle == "MOTORCYCLE"){
            Motorcycle vehicle = new Motorcycle("white", "2010", 250);
            vehicle.startVehicle();
        }
	}

}
