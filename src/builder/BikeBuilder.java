package builder;

public class BikeBuilder {

    private String wheel;
    private String frame;
    private String chain;

    public BikeBuilder wheel(String wheel){
        this.wheel = wheel;
        return this;
    }

    public BikeBuilder frame(String frame){
        this.frame = frame;
        return this;
    }

    public BikeBuilder chain(String chain){
        this.chain = chain;
        return this;
    }

    public BikeCreator build(){
        System.out.println(wheel);
        System.out.println(frame);
        System.out.println(chain);
        return new BikeCreator();
    }
}
