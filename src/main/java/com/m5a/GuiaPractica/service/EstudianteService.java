/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.GuiaPractica.service;

import com.m5a.GuiaPractica.model.Estudiante;
import java.util.List;

/**
 *
 * @author DELL_USER
 */
public interface EstudianteService {

 
    List<Estudiante> findAll();

    Estudiante findByStudentNumber(long studentNumber);

    Estudiante findByEmail(String email);

    List<Estudiante> findAllByOrderByGpaDesc();

    Estudiante saveOrUpdateStudent(Estudiante student);

    void deleteStudentById(String id);

}
