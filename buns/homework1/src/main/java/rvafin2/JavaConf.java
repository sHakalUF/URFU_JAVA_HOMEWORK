package rvafin2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rvafin2.configurations.MyConfig;


public class JavaConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getPet().makeSound());
        context.close();
    }
}
