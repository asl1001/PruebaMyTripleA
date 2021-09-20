package com.myTripleA.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myTripleA.entity.Informacion;
import com.myTripleA.entity.pruebaCategoria;

public interface PreciosDAO  extends JpaRepository<pruebaCategoria,Long>{

}
