package 设计模式.工厂模式.工厂方法模式;

import 设计模式.工厂模式.静态工厂模式.AddOperator;
import 设计模式.工厂模式.静态工厂模式.Operator;

public class AddFactory implements Factory<Integer> {

    @Override
    public Operator<Integer> createOperator() {
        return new AddOperator();
    }
}
