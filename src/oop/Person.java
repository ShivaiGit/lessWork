package oop;

public class Person {
    private String fullName;
    private String post;
    private String email;
    private int phoneNumber;
    private double salary;
    private int age;

    Person (String fullName,String post,String email,int phoneNumber,double salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.age =age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo (){
        System.out.printf("ФИО - %s , Должность - %s , Эл. почта - %s , Номер тел. - %d , Зарплата - %f , Возраст - %d ", fullName,post,email,phoneNumber,salary,age);
    }

    public void printPers (String fullName,String post,String email,int phoneNumber,double salary, int age) {
        if (age > 40)
            printInfo();
    }
}
