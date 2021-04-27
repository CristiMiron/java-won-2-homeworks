package ro.fasttrackit.homeworks.curs9.ex1;

public class Product {
    public int price;
    public String name;
    public String description;
    public int quantity;

    public Product(int price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getProduct(int price, String name, String description, int quantity) {
        setName(name);
        setPrice(price);
        setDescription(description);
        setQuantity(quantity);

        System.out.println("We create a new product called " + name + " which cost " + price +
                " and have this specs : " + description + ". Total quantity : " + quantity);


    }

}
