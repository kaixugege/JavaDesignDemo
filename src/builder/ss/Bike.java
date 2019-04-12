package builder.ss;

public class Bike {
    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public Bike(String frame, String seat, String tire) {
        this.frame = frame;
        this.seat = seat;
        this.tire = tire;
    }

    public void show(){
        System.out.println(getFrame());
        System.out.println(getSeat());
        System.out.println(getTire());

    }

    private String frame;
    private String seat;
    private String tire;


}
