package com.microservicio.usuarios.microservicio_usuarios.dto;

import lombok.Data;

@Data
public class UsuariosEditDto {
    private String matricula;
    private String nom;
    private String rol;
    private String email;
    private int estatus;
}
