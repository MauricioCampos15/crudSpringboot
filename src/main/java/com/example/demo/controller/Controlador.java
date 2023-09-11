package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Persona;
import com.example.demo.model.Repository;

@Controller
@RequestMapping("/listar")
public class Controlador {

    @Autowired
    private repository repository;

    @GetMapping
    @ResponseBody
    public Iterable<Persona> listaUsuarios() {
        // Utiliza el método findAll() para recuperar todos las personas
        return repository.findAll();
    }
}

    
    // @PostMapping("/save")
    // public Persona crearPersona(@RequestBody Persona persona) {
    //     // Guarda la persona en la base de datos
    //     return repository.save(persona);
    // }
	

