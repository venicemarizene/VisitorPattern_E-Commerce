import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Furniture> cart = new ArrayList<>();

        Chair chair = new Chair(5);
        Table table = new Table(2, 1.5);
        Sofa sofa = new Sofa(50, 3);

        chair.setWeight(6);
        table.setLength(2.5);
        sofa.setDistance(60);

        cart.add(chair);
        cart.add(table);
        cart.add(sofa);

        ShippingCost shippingVisitor = new ShippingCost();

        for (Furniture item : cart) {
            item.accept(shippingVisitor);
        }

        System.out.println("----------------------");
        System.out.println("Total Shipping Cost: Php " + shippingVisitor.getTotalShippingCost());
    }
}