/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.bussinessx.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Bloco implements Serializable{

    @Id
    @GeneratedValue
    private long id;
    @Column(length = 50)
    private String nome;

    public Bloco() {
    }

    public Bloco(String nome) {
        this.nome = nome;
    }

    public Bloco(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bloco{" + "id=" + id + ", nome=" + nome + '}';
    }
}
