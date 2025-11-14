package com.microservicio.usuarios.microservicio_usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.usuarios.microservicio_usuarios.entity.Usuarios;

public interface  UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
