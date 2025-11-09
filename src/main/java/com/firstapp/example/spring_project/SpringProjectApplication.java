package com.firstapp.example.spring_project;

import com.firstapp.example.spring_project.model.Address;
import com.firstapp.example.spring_project.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringProjectApplication.class, args);

        System.out.println("Hello!  This is my first spring app");


        //Tight coulping....
        Employee emp = new Employee();
        emp.empId = 123;
        emp.empName = "Ritika";
        emp.email = "ritika@gmail.com";



        Address ad = new Address();
        ad.streetNo = 22;
        ad.streetName = "maan rd";
        ad.cityName = "Pune";

		emp.address = ad;

        System.out.println("emp details is :" + emp);

        System.out.println("emp details is :" + emp);


    }



}
