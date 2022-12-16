package rvafin2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(value = "prototype")
public class Dog implements Pet {
    private String name = "Pavel";
    private int age = 5;

    @PostConstruct
    public void init(){
        System.out.println("Create Dog obj");
    }

    public Dog(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeSound() {
        return "gav-gav";
    }
}
