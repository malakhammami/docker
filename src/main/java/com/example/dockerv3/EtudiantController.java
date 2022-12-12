package com.example.dockerv3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@CrossOrigin("*")
public class EtudiantController {

    @Autowired
    EtudiantRepository ER ;
    @GetMapping("/all")
    public List<Etudiant> getAllEtudiant(){
        return ER.findAll();
    }
}
