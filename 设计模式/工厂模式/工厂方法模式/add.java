package 设计模式.工厂模式.工厂方法模式;

import 设计模式.工厂模式.静态工厂模式.Operator;

public class add implements Operator<Double> {
    @Override
    public Double getResult(Double... args) {
        System.out.println("厉害了我滴哥");
        return null;
    }
}
