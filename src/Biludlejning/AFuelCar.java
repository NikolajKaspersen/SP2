package Biludlejning;

abstract public class AFuelCar extends ACar {
    int kmPrLitre;

    public AFuelCar(String make, String model, int numberOfDoors) {

        super(make, model, numberOfDoors);

    }

    public String getFuelType()
    {
        return null;
    }

    public int getKmPrLitre()
    {
        return 0;
    }
    @Override
    public String toString()
    {
        return null;
    }
}
