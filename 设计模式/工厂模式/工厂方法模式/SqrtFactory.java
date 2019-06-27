package 设计模式.工厂模式.工厂方法模式;

import 设计模式.工厂模式.静态工厂模式.Operator;

public class SqrtFactory implements Factory<Double>{
    @Override
    public Operator<Double> createOperator() {
        return new SqrtOperator();
    }
    public Operator<Double> add() {
        return new add();
    }
}
