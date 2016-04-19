/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.entidades;

import dijalmasilva.bussinessx.enums.TypeSala;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Sala implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    @OneToOne
    private Bloco bloco;
    private long capacidade;
    @Enumerated(EnumType.STRING)
    private TypeSala tipo;

    public Sala() {
    }

    public Sala(String nome, Bloco bloco, long capacidade, TypeSala tipo) {
        this.nome = nome;
        this.bloco = bloco;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public Sala(long id, String nome, Bloco bloco, long capacidade, TypeSala tipo) {
        this.id = id;
        this.nome = nome;
        this.bloco = bloco;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }

    public long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(long capacidade) {
        this.capacidade = capacidade;
    }

    public TypeSala getTipo() {
        return tipo;
    }

    public void setTipo(TypeSala tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Sala{" + "id=" + id + ", nome=" + nome + ", bloco=" + bloco + ", capacidade=" + capacidade + ", tipo=" + tipo + '}';
    }

}
