/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Evento implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @Column(length = 50)
    private String nome;
    @Column(columnDefinition = "TEXT")
    private String descricao;
    private long participantes;
    @OneToOne
    private Usuario responsavel;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate inicio;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate termino;
    @OneToOne
    private Sala local;
    
    public Evento() {
    }

    public Evento(String nome, String descricao, long participantes, Usuario responsavel, LocalDate inicio, LocalDate termino, Sala local) {
        this.nome = nome;
        this.descricao = descricao;
        this.participantes = participantes;
        this.responsavel = responsavel;
        this.inicio = inicio;
        this.termino = termino;
        this.local = local;
    }

    public Evento(long id, String nome, String descricao, long participantes, Usuario responsavel, LocalDate inicio, LocalDate termino, Sala local) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.participantes = participantes;
        this.responsavel = responsavel;
        this.inicio = inicio;
        this.termino = termino;
        this.local = local;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getParticipantes() {
        return participantes;
    }

    public void setParticipantes(long participantes) {
        this.participantes = participantes;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public Sala getLocal() {
        return local;
    }

    public void setLocal(Sala local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", participantes=" + participantes + ", responsavel=" + responsavel + ", inicio=" + inicio + ", termino=" + termino + '}';
    }

}
