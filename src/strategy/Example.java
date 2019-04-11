package strategy;
//策略模式


public class Example {
    public static void main(String args[]) {
        new Run().run();
    }

    public static class Run {
        private void run() {
            Animail dog = new Dog();
            Cat cat = new Cat();
            cat.eat();
            startFly(dog);
            startFly(cat);
        }

        private void startFly(Animail animail) {
            animail.fly();
        }
    }


}
