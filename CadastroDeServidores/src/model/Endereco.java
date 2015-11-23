/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Patrick Rodrigues
 */
@Entity
public class Endereco {

    private static final Logger LOG = Logger.getLogger(Endereco.class.getName());

    //criando relações entre as tabelas
    @OneToMany(mappedBy = "enderecoServ")
    private List<Servidor> servidor;
    //criando o atributo id no banco e colocando pra ser gerado automático
    @Id @GeneratedValue
    private long id;
    private String UF;
    private String cidade;
    private String bairro;
    private int numero;
    private String rua;
    private String email;
    private String telefone;

    public Endereco() {
        super();
    }

    public Endereco(List<Servidor> servidor, long id, String UF, String cidade, String bairro, int numero, String rua, String email, String telefone) {
        this.servidor = servidor;
        this.id = id;
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.rua = rua;
        this.email = email;
        this.telefone = telefone;
    }

    public Endereco(List<Servidor> servidor, String UF, String cidade, String bairro, int numero, String rua, String email, String telefone) {
        this.servidor = servidor;
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.rua = rua;
        this.email = email;
        this.telefone = telefone;
    }

    public List<Servidor> getServidor() {
        return servidor;
    }

    public void setServidor(List<Servidor> servidor) {
        this.servidor = servidor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Endereco other = (Endereco) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereço{ " + "Id do Endereço= " + id + ", Servidor Neste Endereço= " + servidor + ", UF= " + UF + ",\n" +
                " Cidade=" + cidade + ", Bairro=" + bairro + ", Número= " + numero + ",\n" +
                " Rua= " + rua + ", E-mail= " + email + ", Telefone= " + telefone + " }" + ",\n";
    }

}
