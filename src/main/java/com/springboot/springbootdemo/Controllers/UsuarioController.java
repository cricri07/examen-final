package com.springboot.springbootdemo.Controllers;

import com.springboot.springbootdemo.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value ="prueba")
    public String prueba(){
        return "prueba";
    }






















    @RequestMapping(value ="usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Jurado");
        usuario.setEmail("lucas@gmail.com");
        usuario.setTelefono("3453454");

        return usuario;

    }
}
