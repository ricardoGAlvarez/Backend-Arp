
package com.tutorial.crud.repository;

import com.tutorial.crud.entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Rhys extends JpaRepository<hys, Integer>{
    
    Optional<hys> findByNombreS(String nombreS);
    public boolean existsByNombreS(String nombreS);
    
    
}
