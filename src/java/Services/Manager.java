/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class Manager {
    private EntityManager en;
    private static Manager instance = null;
    
    public static Manager getInstance(){
        if(instance == null){
            instance = new Manager();
    }
        return instance;
}
 private Manager(){
     EntityManagerFactory enf = Persistence.createEntityManagerFactory("HibernatePU");
     en = enf.createEntityManager();
}
public EntityManager getEn(){
    return en;
}
public void setEn(EntityManager en){
    this.en = en;
}
}
    