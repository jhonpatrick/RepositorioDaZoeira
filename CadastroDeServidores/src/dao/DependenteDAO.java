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
import model.Dependentes;

/**
 *
 * @author Lord Devil Hunter
 */
public class DependenteDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Servidor");
        
        EntityManager em = emf.createEntityManager();
        
        public void begin(){
            em.getTransaction().begin();
        }
        
        public void commit(){
            em.getTransaction().commit();
        }
        public void rollback(){
            em.getTransaction().rollback();
        }
        
        public void close(){
            em.close();
            emf.close();
        }
        
        public void salvar(Dependentes d){
            em.persist(d);
        }
        public Dependentes pesquisar(long id){
            return em.find(Dependentes.class, id);
        }
        public void apagar(Dependentes d){
            begin();
            em.persist(d);
            commit();
        }
        public void atualizar(Dependentes d){
            begin();
            em.merge(d);
            commit();
        }
        
        public List<Dependentes> listar(){
            List<Dependentes> ls = new ArrayList<Dependentes>();
            Query query = em.createQuery("select d from Dependentes d");
            return ls = query.getResultList();
        }
}
