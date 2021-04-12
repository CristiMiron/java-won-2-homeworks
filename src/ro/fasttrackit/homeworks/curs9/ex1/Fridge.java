package ro.fasttrackit.homeworks.curs9.ex1;

public class Fridge extends Electronics {

    public double temperature;

    public Fridge(int price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void getTemperature(double temperature) {
        setTemperature(temperature);
        System.out.println("The temperature is set on : " + temperature);
    }
}
