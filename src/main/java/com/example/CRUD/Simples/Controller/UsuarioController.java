package com.example.CRUD.Simples.Controller;

import com.example.CRUD.Simples.Repository.UsuarioRepository;
import com.example.CRUD.Simples.Service.UsuarioService;
import com.example.CRUD.Simples.entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody CriarUsuarioDTO criarUsuarioDTO) {
       var userId = usuarioService.criarUsuario(criarUsuarioDTO);

       return ResponseEntity.created(URI.create("/usuario" + userId.toString())).build();
    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("UsuarioId") String usuarioId){
        return null;
    }
}
