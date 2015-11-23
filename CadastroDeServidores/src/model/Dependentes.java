/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Lord Devil Hunter
 */
@Entity
public class Dependentes {
    
    
    //criando o id no persistence
    @Id
    //colocando o id pra gerar automático
    @GeneratedValue
    private long id;
    //criando relaçções entres as tabelas 
    @ManyToMany(mappedBy = "dependentesServ")
    private List<Servidor> servidor;
    private String nomeDependente;
    private String dataNascimentoDependente;
    private String parentesco;

    public Dependentes() {
        super();
    }

    public Dependentes(long id, List<Servidor> servidor, String nomeDependente, String dataNascimentoDependente, String parentesco) {
        this.id = id;
        this.servidor = servidor;
        this.nomeDependente = nomeDependente;
        this.dataNascimentoDependente = dataNascimentoDependente;
        this.parentesco = parentesco;
    }

    public Dependentes(List<Servidor> servidor, String nomeDependente, String dataNascimentoDependente, String parentesco) {
        this.servidor = servidor;
        this.nomeDependente = nomeDependente;
        this.dataNascimentoDependente = dataNascimentoDependente;
        this.parentesco = parentesco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Servidor> getServidor() {
        return servidor;
    }

    public void setServidor(List<Servidor> servidor) {
        this.servidor = servidor;
    }

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public String getDataNascimentoDependente() {
        return dataNascimentoDependente;
    }

    public void setDataNascimentoDependente(String dataNascimentoDependente) {
        this.dataNascimentoDependente = dataNascimentoDependente;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dependentes other = (Dependentes) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dependentes{ " + "Id do Dependente= " + id + ", Servidores= " + servidor + ",\n" +
                " Nome do Dependente= " + nomeDependente + ", Data de Nascimento do Dependente= " + dataNascimentoDependente + ",\n" +
                " Parentesco= " + parentesco + "}"  + "\n";
    }
       
}
