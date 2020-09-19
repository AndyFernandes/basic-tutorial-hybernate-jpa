package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    private int id_;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private String rg;

    public int getId() {
        return id_;
    }
    public void setId(int id) {
        this.id_ = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id_ +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}