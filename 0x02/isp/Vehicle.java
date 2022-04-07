

public class Vehicle implements IVehicle, IVehicleCar {
	private String color;
    private String year;
    private double engine;

    public Vehicle(String color, String year, double engine){
        this.color  = color;
        this.year = year;
        this.engine = engine;
    }

	@Override
	public void configureVehicle(String color, String year, double engine, int seats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startVehicle() {
		// TODO Auto-generated method stub
		
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
