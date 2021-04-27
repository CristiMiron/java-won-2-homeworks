package ro.fasttrackit.homeworks.curs9.ex1;

public class Cosmetics extends Product {

    public String color;
    public int weight;

    public Cosmetics(int price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void getCosmetic(String color, int weight) {
        setColor(color);
        setWeight(weight);
        System.out.println("The new cosmetic have name " + name + ". The color is " + color + " and the weight is " + weight);

    }
}
