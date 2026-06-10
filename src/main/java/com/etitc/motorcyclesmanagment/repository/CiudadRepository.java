package com.etitc.motorcyclesmanagment.repository;

import com.etitc.motorcyclesmanagment.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {


}
