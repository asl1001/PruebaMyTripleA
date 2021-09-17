package com.myTripleA.controller;

import java.util.Optional;
import com.myTripleA.Service.InformacionService;
import com.myTripleA.entity.Informacion;
import com.myTripleA.entity.pruebaCategoria;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/informacion")
public class InformacionController {
	@Autowired
	private InformacionService  informacionService;
	
	//creamos una nueva informasion
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Informacion informacion){
		return ResponseEntity.status(HttpStatus.CREATED).body(informacionService.save(informacion));
		
	}
	//@PostMapping
	//public ResponseEntity<?> createCategoria(@RequestBody pruebaCategoria categoria){
	//	return ResponseEntity.status(HttpStatus.CREATED).body(informacionService.save(categoria));
		
	//}
	//Lleer in insert
	@GetMapping("/{id}/")
	public ResponseEntity<?> read(@PathVariable(value="id") Long informacionId){
		Optional<Informacion> oInformacion=informacionService.findById(informacionId);
		if(oInformacion.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oInformacion);
	}
	
}
