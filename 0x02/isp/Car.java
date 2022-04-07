public class Car implements IVehicle, IVehicleCar, IMotorVehicle {

	public Car(String color, String year, double engine) {
		super();
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

	@Override
	public void configureCar(String color, String year, double engine, int seats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureMotorcycle(String color, String year, double engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kmPerLitre() {
		// TODO Auto-generated method stub
		
	}

}
