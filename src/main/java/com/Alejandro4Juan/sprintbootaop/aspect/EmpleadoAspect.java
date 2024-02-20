package com.Alejandro4Juan.sprintbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class EmpleadoAspect {

    @Before(value = "execution(* com.Alejandro4Juan.sprintbootaop.service.EmpleadoService.*(..)) && args(name, id)")
    public void beforePostEmpleado (JoinPoint joinPoint, String name, String id){

        System.out.println("Metodo Before: "+ joinPoint.getSignature());
        System.out.println("Creando empleado...: ".concat(name));
    }
    @After(value = "execution(* com.Alejandro4Juan.sprintbootaop.service.EmpleadoService.*(..)) && args(name, id)")
    public void afterPostEmpleado (JoinPoint joinPoint, String name, String id){

        System.out.println("Metodo Before: "+ joinPoint.getSignature());
        System.out.println("Empleado Creado:  ".concat(name));
    }


}
