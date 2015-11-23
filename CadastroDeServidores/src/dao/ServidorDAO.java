package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Servidor;

/**
 *
 * @author Lord Devil Hunter
 */
public class ServidorDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Servidor");

    EntityManager em = emf.createEntityManager();

    public void begin() {
        em.getTransaction().begin();
    }

    public void commit() {
        em.getTransaction().commit();
    }

    public void rollback() {
        em.getTransaction().rollback();
    }

    public void close() {
        em.close();
        emf.close();
    }

    public void salvar(Servidor s) {
        begin();
        em.persist(s);
        commit();
    }

    public Servidor pesquisar(String SIAPE) {
        Servidor serv;
        serv = (Servidor) em.createNamedQuery("Servidor.consultarPorSiape").setParameter("SIAPE", SIAPE).getSingleResult();
        return serv;
    }

    public void apagar(Servidor s) {
        begin();
        em.remove(s);
        commit();
    }

    public void atualizar(Servidor s) {
        begin();
        em.merge(s);
        commit();
    }

    public List<Servidor> listar() {
        List<Servidor> ls = new ArrayList<Servidor>();
        Query query = em.createQuery("select s from Servidor s");
        return ls = query.getResultList();
    }

}
