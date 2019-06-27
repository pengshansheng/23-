package 设计模式.工厂模式.工厂方法模式;

import 设计模式.工厂模式.静态工厂模式.Operator;

public class SqrtOperator implements Operator<Double> {
    @Override
    public Double getResult(Double... args) {
        if (args != null && args.length >= 1) {
            return Math.sqrt(args[0]);
        } else {
            throw new RuntimeException("Params Number Error " + args.length);
        }
    }
}
