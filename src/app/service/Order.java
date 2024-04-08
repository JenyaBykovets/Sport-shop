package app.service;
import app.model.Cap;
import app.model.Tshirt;

public class Order {
    public Tshirt tshirt;
    public Cap cap;

    public Order(Tshirt tshirt, Cap cap) {
        this.tshirt = tshirt;
        this.cap = cap;
    }

    public double calculateTotalPrice() {
        return tshirt.getPrice() + cap.getPrice();
    }
}


