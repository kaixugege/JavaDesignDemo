package annotations;


import annotations.a1.Parent;

@Description(value = "这是类的注解")
public class Child extends Parent implements People {

    @Override
    public String name() {
        return null;
    }

    @Description(value = "这是 方法 的注解")
    @Override
    public int age() {
        return 0;
    }

    @Override
    public void work() {

    }

}
