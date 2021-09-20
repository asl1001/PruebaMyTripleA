package com.myTripleA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.myTripleA.entity.Precios;

@Service
public class PreciosServiceImp implements PreciosService{

	@Override
	public void precios() {
		// TODO Auto-generated method stub
		
	}
//	String url = "https://api.coingecko.com/api/v3/coins/categories/list";
//	@Autowired
//	private PreciosService precios;
//	public void precios() {
//	
//	// String url =
//	// "https://api.coingecko.com/api/v3/coins/list?include_platform=true";
//	//String url = "https://api.coingecko.com/api/v3/coins/categories/list";
//	
//	RestTemplate restTeamplate = new RestTemplate();
//	Gson pruebita = new Gson();
//	JsonObject funciona;
//	JsonArray json = pruebita.fromJson(restTeamplate.getForObject(url, String.class), JsonArray.class);
//	//Map<Long, String[]> informacion;
//	//JsonArray respuestaObjetos;
//	JsonArray respuesta;
//	Precios precio;
//	int id=0;
//	respuesta=json.getAsJsonArray();
//	for(int i = 0;i<json.size();i++){
//		funciona = respuesta.get(i).getAsJsonObject();
//		precio = new Precios();
//		id++;
//		precio.setId(Long.valueOf(id));
//		precio.setPrecio(i);
//		precio.setVolumen(i);
//		precios.save(precio);
//	}
//}
}