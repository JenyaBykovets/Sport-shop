package app.model;
public class Cap implements Product {
    public String color;
    public String manufacturer;
    double price;

    public Cap(String color, String manufacturer, double price) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

