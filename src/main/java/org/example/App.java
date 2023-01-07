package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
         System.out.println("Hello Spring!");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

       Logistics logistics = context.getBean(Logistics.class);
        TransportFactory transportFactory = context.getBean(TransportFactory.class);

        System.out.println(transportFactory);
        System.out.println(logistics);
    }
}
