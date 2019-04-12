package builder.ss;

public class Director {
    public Director(Builder builder) {
        this.builder = builder;
    }
    private Builder builder;

    public Bike build(){

        builder.buildFrame();
        builder.buildSeat();
        builder.buildTire();
        return builder.createBike();
    }


}
