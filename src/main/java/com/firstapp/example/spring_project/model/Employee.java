package com.firstapp.example.spring_project.model;

public class Employee {

//    private int empId;
//    private String empName;
//    private String email;
//    private Address adress;

    public  int empId;
    public String empName;
    public String email;
    public Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
