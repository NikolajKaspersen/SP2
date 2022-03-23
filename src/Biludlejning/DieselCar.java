package Biludlejning;

public class DieselCar extends AFuelCar{
    private int kmPrL;
    private int fee;
    private int i;

    private boolean particleFilter;

    public DieselCar(String make, String model, int numberOfDoors) {
        super(make, model, numberOfDoors);
    }

    public boolean hasParticleFIlter()
    {

        if(false)
        {
            i = 1000;
        }
        return true;
    }

    public int getRegistrationFee()
    {
        if (kmPrL > 20 && kmPrL < 50)
        {
            fee = 330+130;
        }
        else if (kmPrL > 15 && kmPrL < 20)
        {
            fee = 1050+1390;
        }
        else if (kmPrL > 10 && kmPrL < 15) {
            fee = 2340+1850;
        }

        else if (kmPrL > 5 && kmPrL < 10)
        {
            fee = 5500+2770;
        }
        else if (kmPrL < 5)
        {
            fee = 10470+15260;
        }
        return fee+i;
    }

    @Override
    public String toString()
    {
        return null;
    }
}
