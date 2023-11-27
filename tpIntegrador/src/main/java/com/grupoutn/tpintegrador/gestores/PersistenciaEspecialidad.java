package com.grupoutn.tpintegrador.gestores;

import com.grupoutn.tpintegrador.Especialidad;
import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Data
public class PersistenciaEspecialidad {
    @PersistenceContext
    private EntityManager em;

    public Especialidad buscarUna(long numero) {
        return em.find(Especialidad.class, numero);
    }
    public List<Especialidad> buscarEspecialidades(){
        return em.createQuery("select e from Especialidad e", Especialidad.class).getResultList();
    }
    public void insertar(Especialidad especialidad) {
        em.persist(especialidad);
    }
    public void actualizar(Especialidad especialidad) {
        em.merge(especialidad);
    }

}
