package builder.s;

public abstract class Builder {

    public abstract void buildPartA(String a);
    public abstract void buildPartB(String b);
    public abstract void buildPartC(String c);

    public abstract Product build();

}
