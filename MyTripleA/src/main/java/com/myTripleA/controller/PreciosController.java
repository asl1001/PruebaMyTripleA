package com.myTripleA.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myTripleA.Service.InformacionService;
import com.myTripleA.Service.Llamadas;
import com.myTripleA.Service.PreciosService;
import com.myTripleA.entity.Informacion;
import com.myTripleA.entity.Precios;


@RestController
@RequestMapping("/api/precios")
public class PreciosController {
	@Autowired
	private InformacionService  informacionService;
	@Autowired
	private PreciosService precio;
	
	//creamos una nueva informasion
//	@PostMapping
//	public ResponseEntity<?> create(@RequestBody Precios precio){
//		return ResponseEntity.status(HttpStatus.CREATED).body(informacionService.save(precio));
//		
//	}
	@GetMapping("/cargarPrecios")
	@ResponseStatus(HttpStatus.OK)
	public void preciosService(){
		precio.precios();
		
	}
	//Lleer in insert
//	@GetMapping("/{id}/")
//	public ResponseEntity<?> read(@PathVariable(value="id") Long informacionId){
//		Optional<Informacion> oInformacion=informacionService.findById(informacionId);
//		if(oInformacion.isPresent()) {
//			return ResponseEntity.notFound().build();
//		}
//		return ResponseEntity.ok(oInformacion);
//	}
	

}
