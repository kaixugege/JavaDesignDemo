package strategy;

public class Cat  implements Animail,AnimalNew{
    @Override
    public void fly() {
        System.out.println("猫 "+"飞");
    }

    @Override
    public void eat() {
        System.out.println("猫 "+"吃");
    }
}
