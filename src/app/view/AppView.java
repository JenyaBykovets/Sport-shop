package app.view;
import app.service.Order;
import app.service.OrderBuilder;


public class AppView {
    public void runAppView() {
        OrderBuilder builder = new OrderBuilder();

        builder.addTshirt("Red", "Active sports", 10.0);
        builder.addCap("White", "Smart caps", 5.0);
        Order orderA = builder.buildOrder();

        builder.addTshirt("Blue", "Active sports", 12.0);
        builder.addCap("Black", "Smart caps", 8.0);
        Order orderB = builder.buildOrder();

        System.out.println("Order A:");
        printOrder(orderA);
        System.out.println("\nOrder B:");
        printOrder(orderB);
    }

    public static void printOrder(Order order) {
        System.out.println("T shirt: " + order.tshirt.color + ", " + order.tshirt.manufacturer + ", Price: $" + order.tshirt.getPrice());
        System.out.println("Cap: " + order.cap.color + ", " + order.cap.manufacturer + ", Price: $" + order.cap.getPrice());
        System.out.println("Total: $" + order.calculateTotalPrice());
    }
}




