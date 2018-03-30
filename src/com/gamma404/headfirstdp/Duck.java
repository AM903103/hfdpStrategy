package com.gamma404.headfirstdp;

public abstract class Duck {
    //region 會變動的行為,delegate給負責實作的類別,鴨子不用知道如何實作
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    //endregion

    abstract void display();

    //region 會變動的透過：實作介面的物件,去達成功能(幫忙實作)
    public void performFy(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    //endregion

    //不會變動的 是在抽象類別
    //所有鴨子都會游泳
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

}
