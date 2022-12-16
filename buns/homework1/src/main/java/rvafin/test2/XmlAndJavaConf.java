package rvafin.test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAndJavaConf {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("javaAnnottationAndXml.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getPet().makeSound());
        context.close();
    }
}
