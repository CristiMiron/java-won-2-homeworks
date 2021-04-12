package ro.fasttrackit.homeworks.curs9.ex1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(100, "Cosmetic", "crema de fata", 5000);
        product.getProduct(100, "Cosmetic", "crema de fata", 5000);
        Cosmetics cosmetics = new Cosmetics(500, "avon", "lifting", 50);
        cosmetics.getCosmetic("white", 50);
        Electronics electronic = new Electronics(1000, "Big Electronics", "for home", 5);
        electronic.getElectronic("fridge", 10, 15, 20, 25);
        Fridge fridge = new Fridge(1000, "Big Electronics", "for home", 5);
        fridge.getTemperature(6.5);
        System.out.println(product);
        System.out.println(cosmetics);
        System.out.println(electronic);
        System.out.println(fridge);


    }
}
