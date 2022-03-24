package Biludlejning;

public class GasolineCar extends AFuelCar
{

    private int fee;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }


    @Override
    public String getFuelType()
    {
        return "GasolineCar";
    }



    public int getRegistrationFee()
    {
        int kmPrL= getKmPrLitre();
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
    public String toString() {
        return "GasolineCar{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", NumberOfDoors=" + NumberOfDoors +
                '}';
    }

}
