package app.service;
import app.model.Cap;
import app.model.Tshirt;
public class OrderBuilder {
    Tshirt tshirt;
    Cap cap;

    public void addTshirt(String color, String manufacturer, double price) {
        this.tshirt = new Tshirt(color, manufacturer, price);
    }

    public void addCap(String color, String manufacturer, double price) {
        this.cap = new Cap(color, manufacturer, price);
    }

    public Order buildOrder() {
        return new Order(tshirt, cap);
    }
}

