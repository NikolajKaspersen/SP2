package Biludlejning;

public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;
    private int kmPrL = 0;
    private int whPrKm;
    private int fee;



    public ElectricCar(int batteryCapacity, int maxRange)
    {
        super(make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    public int getBatteryCapacitykWh()
    {
        return 0;
    }

    public int getMaxRangeKm()
    {
        return 0;
    }

    public int getWhPrKm()
    {
        return batteryCapacity/maxRange;
    }
    public double getkmPrL()
    {
        return (getWhPrKm()/91.25)/100;
    }

    public int getRegistrationFee()
    {

        if (getkmPrL() > 20 && getkmPrL() < 50)
        {
            fee = 330;
        }
        else if (getkmPrL() > 15 && getkmPrL() < 20)
        {
            fee = 1050;
        }
        else if (getkmPrL() > 10 && getkmPrL() < 15) {
            fee = 2340;
        }

        else if (getkmPrL() > 5 && getkmPrL() < 10)
        {
            fee = 5500;
        }
        else if (getkmPrL() < 5)
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
