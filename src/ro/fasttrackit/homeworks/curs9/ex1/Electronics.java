package ro.fasttrackit.homeworks.curs9.ex1;

public class Electronics extends Product {

    private String type;
    public int length;
    public int width;
    public int height;
    public int weight;

    public Electronics(int price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void getElectronic(String type, int height, int weight, int width, int length) {
        setType(type);
        setHeight(height);
        setWeight(weight);
        setLength(length);
        setHeight(height);

        System.out.println("We create a new line of products called electronics");
        System.out.println("We also have one type of electronics called : " + type + ", which have this specs : " +
                " length : " + length + ", width : " + width + ", height : " + height + ", weight : " + weight);
    }

    public String getType() {
        return type;
    }
}
