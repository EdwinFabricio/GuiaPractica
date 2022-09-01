/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.GuiaPractica.repository;

import com.m5a.GuiaPractica.model.Estudiante;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author DELL_USER
 */
public interface EstudianteRepository extends MongoRepository<Estudiante, String>{
    
   
    Estudiante findByStudentNumber(long studentNumber);

    Estudiante findByEmail(String email);

    List<Estudiante> findAllByOrderByGpaDesc();
    
}
