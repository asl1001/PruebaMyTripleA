package com.myTripleA.Service;

import java.util.Optional;
import com.myTripleA.DAO.InformacionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myTripleA.entity.Informacion;

@Service
public class InformacionServiceImp implements InformacionService {
	
	@Autowired
	private InformacionDAO InformacionDAO;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Informacion> findAll() {
		// TODO Auto-generated method stub
		return InformacionDAO.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Informacion> findAll(Pageable pagebale) {
		// TODO Auto-generated method stub
		return InformacionDAO.findAll(pagebale);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Informacion> findById(Long id) {
		// TODO Auto-generated method stub
		return InformacionDAO.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public Informacion save(Informacion informacion) {
		// TODO Auto-generated method stub
		return InformacionDAO.save(informacion);
	}

	@Override
	@Transactional(readOnly=true)
	public void deletelyById(Long id) {
		// TODO Auto-generated method stub
		InformacionDAO.deleteById(id);
		
	}

}
