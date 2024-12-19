package com.example.CRUD.Simples.Service;

import com.example.CRUD.Simples.Controller.CriarUsuarioDTO;
import com.example.CRUD.Simples.Repository.UsuarioRepository;
import com.example.CRUD.Simples.entity.Usuario;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UUID criarUsuario(CriarUsuarioDTO criarUsuarioDTO) {

        var entity = new Usuario(
                UUID.randomUUID(),
                criarUsuarioDTO.Nome(),
                criarUsuarioDTO.Email(),
                criarUsuarioDTO.Senha(),
                Instant.now(),
                null
        );

        var usuarioSalvo = usuarioRepository.save(entity);

        return usuarioSalvo.getUsuarioId();
    }
}
