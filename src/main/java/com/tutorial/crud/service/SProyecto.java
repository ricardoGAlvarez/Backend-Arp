
package com.tutorial.crud.service;


import com.tutorial.crud.entity.Proyecto;
import com.tutorial.crud.repository.RProyecto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SProyecto {
    @Autowired
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
         return rProyecto.findAll();
     }
     
     public Optional<Proyecto> getOne(int id){
         return rProyecto.findById(id);
     }
     
     public Optional<Proyecto> getByNombre(String nombre){
         return rProyecto.findByNombre(nombre);
     }
     
     public void save(Proyecto proy){
         rProyecto.save(proy);
     }
     
     public void delete(int id){
         rProyecto.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rProyecto.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return rProyecto.existsByNombre(nombre);
     }
}
