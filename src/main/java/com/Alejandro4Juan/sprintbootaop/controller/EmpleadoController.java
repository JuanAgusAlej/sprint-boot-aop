package com.Alejandro4Juan.sprintbootaop.controller;

import com.Alejandro4Juan.sprintbootaop.model.Empleado;
import com.Alejandro4Juan.sprintbootaop.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @RequestMapping(value = "/create/empleado",method = RequestMethod.GET)
    public Empleado Create (@RequestParam("name") String name, @RequestParam("id") String id){
        return empleadoService.postEmpleado(id,name);
    }
}
