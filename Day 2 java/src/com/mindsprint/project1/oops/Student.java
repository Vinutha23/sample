package com.mindsprint.project1.oops;

public class Student {
    int id;
    String name;
    String email;
    String address;
    public Student(String name,String email,String address){
        this((int)Math.round(Math.random()*1000),name,email,address);
        this.name=name;
        this.email=email;
        this.address=address;
    }

    public Student(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public static void main(String[] args) {
//        Student s1=new Student();
//        Student s2=new Student();

    }
}
