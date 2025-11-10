package com.microservicio.usuarios.microservicio_usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http:localhost:5173")
@RestController
@RequestMapping("/api/usuarios")

public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    // Historia de usuario Listar usuarios - Jonathan Molina De Jesús
    @GetMapping("/listar-usuarios")
    public ResponseEntity<List<UsuariosListDto>> listarUsuarios(){
        List<UsuariosListDto> usuarios = usuariosService.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }

}
