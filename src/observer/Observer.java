package observer;

/**
 * 这是一个观察者接口，顶一一个更新的接口给那些在目标发生改变的时候被通知的对象
 */
public interface Observer {
    /**
     * 更新的接口
     *
     * @param sub 传入目标对象，方便回去相应的目标对象的状态
     */
    public void update(Sub sub);
}
