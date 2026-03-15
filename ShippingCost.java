class ShippingCost implements Shipping {

    private double totalShippingCost = 0;

    public double getTotalShippingCost() {
        return totalShippingCost;
    }

    @Override
    public void visit(Chair chair) {

        double cost = 1000; 
        totalShippingCost += cost;

        System.out.println("Chair shipping cost: Php " + cost);
    }

    @Override
    public void visit(Table table) {

        double cost = table.getArea() * 217;
        totalShippingCost += cost;

        System.out.println("Table shipping cost: Php " + cost);
    }

    @Override
    public void visit(Sofa sofa) {

        double cost = sofa.getDistance() * sofa.getVolume() * 7.5;
        totalShippingCost += cost;

        System.out.println("Sofa shipping cost: Php " + cost);
    }
}