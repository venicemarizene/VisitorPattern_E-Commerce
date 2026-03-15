class Sofa implements Furniture {

    private double distance;
    private double volume;

    public Sofa(double distance, double volume) {
        this.distance = distance;
        this.volume = volume;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void accept(Shipping visitor) {
        visitor.visit(this);
    }
}