package oop;

public class Person {
    String fullName;
    String post;
    String email;
    int phoneNumber;
    double salary;
    int age;

    Person (String fullName,String post,String email,int phoneNumber,double salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.age =age;
    }


    public void printInfo (){
        System.out.printf("��� - %s , ��������� - %s , ��. ����� - %s , ����� ���. - %d , �������� - %f , ������� - %d ", fullName,post,email,phoneNumber,salary,age);
    }

}
