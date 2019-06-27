package 设计模式.建造者模式;

import 设计模式.建造者模式.impl.Item;
import 设计模式.建造者模式.impl.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
