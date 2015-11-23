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
import model.Endereco;

/**
 *
 * @author Lord Devil Hunter
 */
public class EnderecoDAO {
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
        
        public void salvar(Endereco e){
            em.persist(e);
        }
        public Endereco pesquisar(long id){
            return em.find(Endereco.class, id);
        }
        public void apagar(Endereco e){
            begin();
            em.persist(e);
            commit();
        }
        public void atualizar(Endereco e){
            begin();
            em.merge(e);
            commit();
        }
        
        public List<Endereco> listar(){
            List<Endereco> ls = new ArrayList<Endereco>();
            Query query = em.createQuery("select e from Endereco e");
            return ls = query.getResultList();
        }
}
