package rvafin.test;

public class Person {
    private Pet pet;
    private String name;

    public Person(Pet pet, String name) {
        this.pet = pet;
        this.name = name;
    }

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

    public void destroy(){
        System.out.println("Destroy meth");
    }
}
