package Biludlejning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new DieselCar("ford","fiasta","361",2,25,false);
        Car car1 = new ElectricCar(400,200,"1616","tesla","s1",2);
        Car car2 = new GasolineCar("2462","Kia","Picanto",9,3);

        Car car3 = new GasolineCar("23","ford","forfiesta",4,15);
        FleetOfCars fleetOfCars = new FleetOfCars();
        fleetOfCars.addCar(car3);

        fleetOfCars.addCar(car);
        fleetOfCars.addCar(car1);
        fleetOfCars.addCar(car2);
        fleetOfCars.addCar(car3);
        System.out.println(fleetOfCars.toString());
        System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet());
    }
}
