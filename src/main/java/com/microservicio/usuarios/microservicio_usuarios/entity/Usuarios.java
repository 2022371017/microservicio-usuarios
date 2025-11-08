package com.microservicio.usuarios.microservicio_usuarios.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "t_usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matricula", nullable = false, unique = true)
    private String matricula;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "rol", nullable = false)
    private String rol;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "estatus", nullable = false)
    private int estatus;

}