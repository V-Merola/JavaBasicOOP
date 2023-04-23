package javaoop.exercises._2;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }

    public  Student(Integer Age){
        this.age = age;
    }
    public Student(String name){
        this.name = name;
    }
    public Student(){

    }
}
