package 设计模式.工厂模式.工厂方法模式;

import 设计模式.工厂模式.静态工厂模式.Operator;

public interface Factory<T> {
    /**
     * 由于静态工厂方法模式不满足OCP, 因此就出现了工厂方法模式;
     * 工厂方法模式和静态工厂模式最大的不同在于:
     * 静态工厂模式只有一个(对于一个项目/独立模块)只有一个工厂类,
     * 而工厂方法模式则有一组实现了相同接口的工厂类.
     * */
    Operator<T> createOperator();
}
