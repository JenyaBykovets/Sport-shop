package app.model;

public class Tshirt implements Product {
    public String color;
    public String manufacturer;
    double price;

    public Tshirt(String color, String manufacturer, double price) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}




