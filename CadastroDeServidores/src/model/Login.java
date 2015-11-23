/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author Lord Devil Hunter
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Login.consultarPorServidor", query = "select l from Login l where siape = :siape")})
public class Login {
    @Id
    @GeneratedValue
    int id;
    long senha;
    String email;
    //declaração entre as entidades
    @OneToOne
    Servidor servidor;

    public Login() {
        super();
    }

    public Login(Servidor servidor, int id, long senha, String email) {
        this.id = id;
        this.senha = senha;
        this.email = email;
        this.servidor = servidor;
    }

    public Login(Servidor servidor, long senha, String email) {
        this.senha = senha;
        this.email = email;
        this.servidor = servidor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public long getSenha() {
        return senha;
    }

    public void setSenha(long senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Login{" + "id= " + id + ", servidor= " + servidor + ", senha= " + senha + ", email= " + email + '}';
    }   
}