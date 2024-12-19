package com.example.CRUD.Simples.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.yaml.snakeyaml.constructor.Constructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tb_Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID UsuarioId;

    @Column(name = "Nome")
    private String Nome;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Senha")
    private String Senha;

    @CreationTimestamp
    private Instant dataCriacao;

    @UpdateTimestamp
    private Instant dataAtualizacao;

    public Usuario() {
    }

    public Usuario(UUID usuarioId, String nome, String email, String senha, Instant dataCriacao, Instant dataAtualizacao) {
        UsuarioId = usuarioId;
        Nome = nome;
        Email = email;
        Senha = senha;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
    }

    public UUID getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(UUID usuarioId) {
        UsuarioId = usuarioId;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public Instant getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Instant dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Instant getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Instant dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
