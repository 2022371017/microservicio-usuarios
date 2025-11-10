package com.microservicio.usuarios.microservicio_usuarios.service;

import com.usuarios.usuarios.repository.MateriasRepository;
import com.microservicio.usuarios.microservicio_usuarios.repository.UsuariosRepository;
import com.usuarios.usuarios.dto.UsuariosListDto;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;
    
    // Historia de usuario Listar usuarios - Jonathan Molina De Jesús
    public List<UsuariosListDto> listarUsuarios(){
        return usuariosRepository.findAll()
                .stream()
                .map(usuario -> {
                    UsuariosListDto dto = new UsuariosListDto();
                    dto.setId(usuario.getId());
                    dto.setMatricula(usuario.getMatricula());
                    dto.setNom(usuario.getNom());
                    dto.setRol(usuario.getRol());
                    dto.setEmail(usuario.getEmail());
                    return dto;
                })
                .collect(Collectors.toList());
}
    
}
