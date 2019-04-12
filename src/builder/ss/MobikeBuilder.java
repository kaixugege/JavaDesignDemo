package builder.ss;

public class MobikeBuilder extends Builder {

    private String frame;
    private String seat;
    private String tire;

    @Override
    void buildFrame() {
        frame = " mobike frame";
    }

    @Override
    void buildSeat() {
        seat = " mobike seat";
    }

    @Override
    void buildTire() {
        tire = "mobike seat";
    }

    @Override
    Bike createBike() {
        return new Bike(frame, seat, tire);
    }
}
