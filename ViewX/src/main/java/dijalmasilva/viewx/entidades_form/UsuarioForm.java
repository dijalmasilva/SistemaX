/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.viewx.entidades_form;

import dijalmasilva.bussinessx.enums.UserType;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class UsuarioForm {

    private String email;
    private String nome;
    private String senha;
    private UserType tipo;
    private String matricula;

    public UsuarioForm() {
    }
    
    public UsuarioForm(String email, String nome, String senha, UserType tipo, String matricula) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
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
    
    
}
