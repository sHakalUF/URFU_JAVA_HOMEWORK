package rvafin2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Person {
    @Autowired
    @Qualifier("dog")
    private Pet pet;
    @Value("${person.name}") private String name;

    public Person() {}

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy meth");
    }
}
