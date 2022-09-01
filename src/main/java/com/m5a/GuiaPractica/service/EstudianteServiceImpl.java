/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.GuiaPractica.service;

import com.m5a.GuiaPractica.model.Estudiante;
import com.m5a.GuiaPractica.repository.EstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL_USER
 */
@Service
public class EstudianteServiceImpl  implements EstudianteService {

    @Autowired
    EstudianteRepository studentRepository;

    
     @Override
    public List<Estudiante> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Estudiante findByStudentNumber(long studentNumber) {
        return studentRepository.findByStudentNumber(studentNumber);
    }

    @Override
    public Estudiante findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<Estudiante> findAllByOrderByGpaDesc() {
        return studentRepository.findAllByOrderByGpaDesc();
    }

    @Override
    public Estudiante saveOrUpdateStudent(Estudiante student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

 
    

}
