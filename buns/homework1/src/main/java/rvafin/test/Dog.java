package rvafin.test;

public class Dog implements Pet {

    private String name;
    private int age;

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
