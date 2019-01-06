/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Usuarios;
import Services.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public class UsuariosDAO {
private EntityManager en;
public UsuariosDAO(){
  en = Manager.getInstance().getEn();
}    
    
 public void Salvar(Usuarios u){
     en.getTransaction().begin();
     if(u.getId() > 0){
         u = en.merge(u);
     }
     en.persist(u);
     en.getTransaction().commit();
 }    
 public List<Usuarios> getAll(){
  Query query =  en.createQuery("SELECT u FROM Entity.Usuarios u");
  List resultList = query.getResultList();
  return resultList;
 }
 public void Remover(Usuarios u){
     en = Manager.getInstance().getEn();
     en.getTransaction().begin();
     en.remove(u);
     en.getTransaction().commit();
 }
 public Usuarios UsuId(int id){
    en = Manager.getInstance().getEn();
    en.getTransaction().begin();
    Usuarios u = en.find(Usuarios.class, id);
    en.getTransaction().commit();
    return u;
 }
}
