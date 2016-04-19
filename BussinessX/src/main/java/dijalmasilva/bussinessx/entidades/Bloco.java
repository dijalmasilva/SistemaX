/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.bussinessx.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Bloco implements Serializable{

    @Id
    @Column(length = 50)
    private String nome;

    public Bloco() {
    }

    public Bloco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Bloco{" + "nome=" + nome + '}';
    }
}
