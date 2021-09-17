package com.myTripleA.Service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.myTripleA.entity.Informacion;
import com.myTripleA.Service.InformacionService;

@Service
public interface InformacionService {

	public Iterable<Informacion>findAll();
	public Page<Informacion> findAll(Pageable pagebale);
	public Optional<Informacion>findById(Long id);
	public Informacion save(Informacion informacion);
	public void deletelyById(Long id);

}
