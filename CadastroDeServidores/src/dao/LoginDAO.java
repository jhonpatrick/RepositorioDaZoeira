/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Login;

/**
 *
 * @author Patrick Rodrigues
 */
public class LoginDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Servidor");
    EntityManager em = emf.createEntityManager();

    public void begin() {
        em.getTransaction().begin();
    }

    public void commit() {
        em.getTransaction().commit();
    }

    public void close() {
        em.close();
        emf.close();
    }

    public void rollback() {
        em.getTransaction().rollback();
    }

    //criando metodos de inserir(), deletar(), atualizar(), listar().
    public void inserir(Login l) {
        begin();
        em.persist(l);
        commit();
    }

    public Object pesquisar(String SIAPE) {
        ServidorDAO sdao = new ServidorDAO();
        sdao.pesquisar(SIAPE);
        return SIAPE;
    }

    public void apagar(Login l) {
        begin();
        em.remove(l);
        commit();
    }

    public void atualizar(Login l) {
        begin();
        em.merge(l);
        commit();
    }

    public List<Login> listar() {
        List<Login> lstL = new ArrayList<Login>();
        Query query = em.createQuery("select l from Login l");
        return lstL = query.getResultList();
    }
}
