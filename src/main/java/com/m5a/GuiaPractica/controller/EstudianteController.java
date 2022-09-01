/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.GuiaPractica.controller;

import com.m5a.GuiaPractica.model.Estudiante;

import com.m5a.GuiaPractica.service.EstudianteService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL_USER
 */
@RestController
@RequestMapping("/students")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @Autowired
    private EstudianteService studentService;

    @GetMapping(value = "/")
    public List<Estudiante> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping(value = "/byStudentNumber/{studentNumber}")
    public Estudiante getStudentByStudentNumber(@PathVariable("studentNumber") Long studentNumber) {
        return studentService.findByStudentNumber(studentNumber);
    }

    @GetMapping(value = "/byEmail/{email}")
    public Estudiante getStudentByEmail(@PathVariable("email") String email) {
        return studentService.findByEmail(email);
    }

    @GetMapping(value = "/orderByGpa")
    public List<Estudiante> findAllByOrderByGpaDesc() {
        return studentService.findAllByOrderByGpaDesc();
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Estudiante student) {
        studentService.saveOrUpdateStudent(student);
        return new ResponseEntity("Guardado con exito", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{studentNumber}")
    public ResponseEntity<?> deleteStudentByStudentNumber(@PathVariable long studentNumber) {

        studentService.deleteStudentById(studentService.findByStudentNumber(studentNumber).getId());

        return new ResponseEntity("Borrado con exito", HttpStatus.OK);
    }

}
