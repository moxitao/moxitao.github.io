package entity;

import behavior.FlyNoWay;  
import behavior.Quack;

public class RobberDuck extends Duck{  
  
    public RobberDuck(){  
        quackBehavior = new Quack();  
        flyBehavior = new FlyNoWay();  
    }  
      
    @Override  
    public void display() {  
        System.out.println("I'm a model duck");  
    }  

}
