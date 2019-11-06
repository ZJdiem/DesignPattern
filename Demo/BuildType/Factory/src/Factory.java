import edu.hbu.csc.car.ICar;
import edu.hbu.csc.car.ICarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;

public class Factory {
    public static void main(String[] args) {

        String configFile="Factory/applicationContext.xml";
        ApplicationContext context=new FileSystemXmlApplicationContext(configFile);
        ICarFactory factory = (ICarFactory)context.getBean("vf");
        factory.fistStep();
        ICar car=factory.getCar();
        car.go("东北");
    }
}
