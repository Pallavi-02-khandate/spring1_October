package com.jpahiberanet.example.hospital_management_db.controller;


import com.jpahiberanet.example.hospital_management_db.model.Doctor;
import com.jpahiberanet.example.hospital_management_db.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/doctor/apis")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping ("/save")
    public String saveDoctor( @RequestBody Doctor doctor){

        String response=doctorService.saveDoctor(doctor);
        return response;
    }

}
