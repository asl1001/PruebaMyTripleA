package com.myTripleA.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myTripleA.entity.Informacion;

@Repository
public interface InformacionDAO extends JpaRepository<Informacion,Long>{

}
