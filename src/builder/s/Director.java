package builder.s;

public class Director {


    public Director setBuilder(Builder builder) {
        this.builder = builder;
        return this;
    }

    private Builder builder;

    public Director setPartA(String partA) {
        this.partA = partA;
        builder.buildPartA(" A");
        return this;
    }

    public Director setPartB(String partB) {
        this.partB = partB;
        builder.buildPartB(" B");
        return this;
    }

    public Director setPartC(String partC) {
        this.partC = partC;
        builder.buildPartC(" C");
        return this;
    }

    private String partA; //可以是任意类型
    private String partB;
    private String partC;
    public Product create() {
        return builder.build();
    }

}
