/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.entidades;

import dijalmasilva.bussinessx.enums.TypeStatus;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
@SequenceGenerator(name = Material.Sequence_name,
        initialValue = 1000000,
        allocationSize = 15)
public class Material implements Serializable {

    public static final String Sequence_name = "Material_Sequence";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Sequence_name)
    private long tombamento;

    @Column(length = 50)
    private String nome;
    @Transient
    private int quantidade;
    @Enumerated(EnumType.STRING)
    private TypeStatus status;

    public Material(String nome, int quantidade, TypeStatus status) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.status = status;
    }

    public Material() {
    }

    public Material(long tombamento, String nome, int quantidade, TypeStatus status) {
        this.tombamento = tombamento;
        this.nome = nome;
        this.quantidade = quantidade;
        this.status = status;
    }

    public long getTombamento() {
        return tombamento;
    }

    public void setTombamento(long tombamento) {
        this.tombamento = tombamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public TypeStatus getStatus() {
        return status;
    }

    public void setStatus(TypeStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Material{" + "tombamento=" + tombamento + ", nome=" + nome + ", quantidade=" + quantidade + ", status=" + status + '}';
    }

}
