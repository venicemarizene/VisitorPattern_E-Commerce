class Chair implements Furniture {

    private double weight;

    public Chair(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Shipping visitor) {
        visitor.visit(this);
    }
}