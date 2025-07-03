package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Aclass a = (Aclass) context.getBean("aBean");
        a.welcome();

        Bclass b = (Bclass) context.getBean("bBean");
        b.welcome();

        Cclass c = (Cclass) context.getBean("cBean");
        c.welcome();

        System.out.println( "Hello World!" );
    }
}
