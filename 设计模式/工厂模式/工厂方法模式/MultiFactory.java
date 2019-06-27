package 设计模式.工厂模式.工厂方法模式;

import 设计模式.工厂模式.静态工厂模式.MultiOperator;
import 设计模式.工厂模式.静态工厂模式.Operator;

public class MultiFactory implements Factory<Integer>{
    @Override
    public Operator<Integer> createOperator() {
        return new MultiOperator();
    }
}
