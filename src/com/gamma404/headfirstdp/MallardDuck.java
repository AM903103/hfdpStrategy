package com.gamma404.headfirstdp;

//綠頭鴨
public class MallardDuck extends Duck{

    public MallardDuck() {

        //要改變綠頭鴨的叫的方式或是飛的方式 只要改new的部分 不會動到其他鴨子
        //缺點是實作這些方式的類別 可能很多
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
