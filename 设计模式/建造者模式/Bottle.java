package 设计模式.建造者模式;

import 设计模式.建造者模式.impl.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
