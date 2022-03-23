package Biludlejning;

abstract public class ACar implements Car{
    protected String RegistrationNumber;
    final String Make;
    final String Model;
    final int NumberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        RegistrationNumber = registrationNumber;
        Make = make;
        Model = model;
        NumberOfDoors = numberOfDoors;
    }


    public String getRegistrationNumber()
    {
        return null;
    }
    public String getMake()
    {
        return null;
    }
    public String getModel()
    {
        return null;
    }
    public int getNumberOfDoors()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return null;
    }
}
