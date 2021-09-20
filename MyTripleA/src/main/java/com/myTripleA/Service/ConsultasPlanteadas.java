package com.myTripleA.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myTripleA.entity.Informacion;
import com.myTripleA.entity.pruebaCategoria;
@Service
public class ConsultasPlanteadas implements ConsultasPlanteadasInterface {

	 @Autowired
	 private InformacionService informacion;
	 
	 //ordenar el volumen
	 //@Transactional
	 //(select id,nombre from informacion order by volumen)
	 //select id,nombre from informacion order by precio)
	 public List<Informacion> consulta(){
		 List<Informacion> precios=(List<Informacion>) informacion.findAll();
		
		 return null;
		 
	 }
}
