package test;

import entity.Duck;  
import entity.MallardDuck;  
import entity.ModelDuck;  
import behavior.FlyRocketPower;

public class test{  
    public static void main(String[] args) {  
        Duck mallard = new MallardDuck();  
        mallard.performFly();  
        mallard.performQuack();  
        System.out.println("------------------");  
        Duck model = new ModelDuck();  
        model.performFly();    
        model.setFlyBehavior(new FlyRocketPower());  
        model.performFly();
}
