/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.bussinessx.entidades;

import dijalmasilva.bussinessx.enums.UserType;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = true)
    private String nome;
    @Column(nullable = false)
    private String senha;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] foto;
    @Enumerated(value = EnumType.STRING)
    private UserType tipo;
    @Column(length = 6, unique = true, nullable = false)
    private String matricula;

    public Usuario() {
    }

    public Usuario(String email, String nome, String senha, byte[] foto, UserType tipo, String matricula) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.foto = foto;
        this.tipo = tipo;
        this.matricula = matricula;
    }

    public Usuario(Long id, String email, String nome, String senha, byte[] foto, UserType tipo, String matricula) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.foto = foto;
        this.tipo = tipo;
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public UserType getTipo() {
        return tipo;
    }

    public void setTipo(UserType tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

}
