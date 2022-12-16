package rvafin.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConf {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beansConfigsXml.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getPet().makeSound());
        context.close();
    }
}
