package Biludlejning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new DieselCar();
        Car car1 = new ElectricCar(400,200);
        Car car2 = new GasolineCar();
    }
}