package com.gestion_empleado.controller;


import com.gestion_empleado.Entity.Empleado;
import com.gestion_empleado.repositiry.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class empleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/empleados")
    public List<Empleado> listarTodosLosEmpleados(){
        return empleadoRepository.findAll();
    }
}
