import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.applet.AppletContext;

public class Director {
    IAbstractFactory abstractFactory=null;
    public void operate(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("AbstractFactory0.1/applicationContext.xml");
        IAbstractFactory abstractFactory=(IAbstractFactory)applicationContext.getBean("factory");
        ICar car=abstractFactory.createCar();
        IFOOD food=abstractFactory.createFood();
        food.eat();
        car.go();
    }
}
