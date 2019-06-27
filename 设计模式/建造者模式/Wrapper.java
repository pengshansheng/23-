package 设计模式.建造者模式;

import 设计模式.建造者模式.impl.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }

}
