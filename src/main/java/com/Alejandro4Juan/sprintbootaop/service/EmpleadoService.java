package com.Alejandro4Juan.sprintbootaop.service;

import com.Alejandro4Juan.sprintbootaop.model.Empleado;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    public Empleado postEmpleado (String id, String name){
        Empleado emp = new Empleado(name,id);
        System.out.println("Se agrego un empleado");
        return emp;
    }
    public  String deletedEmpleado (String id){
        return "emplado eliminado: "+ id;
    }
}
