package entity;

import is.FlyBehavior;  
import is.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;//��
    QuackBehavior quackBehavior;//�� 
      
    /** 
     * Ѽ�ӵ���ò 
     */  
    public abstract void display();  
      
    public void performFly(){  
        flyBehavior.fly();  
    }  
      
    public void performQuack(){  
        quackBehavior.quack();  
    }  
      
    public void swim(){  
        System.out.println("All ducks float, even decoys");  
    }  
  
    public void setFlyBehavior(FlyBehavior flyBehavior) {  
        this.flyBehavior = flyBehavior;  
    }  
  
    public void setQuackBehavior(QuackBehavior quackBehavior) {  
        this.quackBehavior = quackBehavior;  
    }  
}
