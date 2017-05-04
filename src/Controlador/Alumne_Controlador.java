/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Alumne;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Query;

/**
 *
 * @author ALUMNEDAM
 */
public class Alumne_Controlador extends Generic_Controlador<Object, Serializable>{

    @Override
    public ArrayList<Object> listarTodos(String s) {
        return super.listarTodos(s); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Serializable id) {
        super.eliminar(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Serializable id) {
        return super.get(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Object entity) {
        super.actualizar(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(Object entity) {
        super.insertar(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object crear() {
        return super.crear(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Alumne buscarCognom(String cognom) {
        // Recupera el entity manager       
        Query query = em.createNamedQuery("alumneCognom", Alumne.class);
        query.setParameter("cognom", cognom);
        Alumne p = (Alumne) query.getSingleResult();
        System.out.println("close");
        em.close();
        return p;
}
    
}
