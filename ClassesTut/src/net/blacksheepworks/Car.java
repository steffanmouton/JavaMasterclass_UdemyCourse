package net.blacksheepworks;

public class Car
{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if (validModel.equals("mini") || validModel.equals("carrera"))
            this.model = model;
        else
            this.model = "Invalid Model Type: " + validModel;
    }
}
