package 设计模式.建造者模式;

import 设计模式.建造者模式.impl.Item;
import 设计模式.建造者模式.impl.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }
    @Override
    public abstract float price();
}
