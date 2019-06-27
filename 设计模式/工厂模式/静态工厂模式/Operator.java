package 设计模式.工厂模式.静态工厂模式;

public interface Operator<T> {
    T getResult(T... args);
}
