package Biludlejning;

public class GasolineCar extends AFuelCar{
    private int kmPrL;
    private int fee;
    public GasolineCar(String make, String model, int numberOfDoors)
    {
        super(make, model, numberOfDoors);
    }
    public int getRegistrationFee()
    {
        if (kmPrL > 20 && kmPrL < 50)
        {
            fee = 330;
        }
        else if (kmPrL > 15 && kmPrL < 20)
        {
            fee = 1050;
        }
        else if (kmPrL > 10 && kmPrL < 15) {
             fee = 2340;
        }

        else if (kmPrL > 5 && kmPrL < 10)
        {
             fee = 5500;
        }
        else if (kmPrL < 5)
        {
             fee = 10470;
        }
        return fee;

    }

    @Override
    public String toString()
    {
        return null;
    }

}
