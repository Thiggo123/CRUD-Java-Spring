package com.example.CRUD.Simples.Controller;

import com.example.CRUD.Simples.Repository.UsuarioRepository;
import com.example.CRUD.Simples.Service.UsuarioService;
import com.example.CRUD.Simples.entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody CriarUsuarioDTO criarUsuarioDTO) {

    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("UsuarioId") String usuarioId){
        return null;
    }
}
