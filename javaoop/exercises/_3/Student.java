package javaoop.exercises._3;

public class Student {
    private String name;
    private int age;

    private String surname;
    private String matricola;

    private String nameCourse;

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

    //getter setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 0) {
            this.age = age;
        }else System.out.println("Error");
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setMatricola(String matricola){
        this.matricola = matricola;
    }

    public void setNameCourse(String nameCourse){
        this.nameCourse = nameCourse;
    }

    ///
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSurname(){
        return surname;
    }
    public String getMatricola(){
        return matricola;
    }

    public String getNameCourse(){
        return nameCourse;
    }

}
