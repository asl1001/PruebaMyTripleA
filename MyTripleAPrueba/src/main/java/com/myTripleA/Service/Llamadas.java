package com.myTripleA.Service;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.myTripleA.entity.Informacion;

@Service
public class Llamadas implements LlamadasInterface {

	String url = "https://api.coingecko.com/api/v3/coins/categories/list";
	@Autowired
	private InformacionService informacionService;
	public void llamaditas() {
	
	// String url =
	// "https://api.coingecko.com/api/v3/coins/list?include_platform=true";
	//String url = "https://api.coingecko.com/api/v3/coins/categories/list";
	
	RestTemplate restTeamplate = new RestTemplate();
	Gson pruebita = new Gson();
	JsonObject funciona;
	JsonArray json = pruebita.fromJson(restTeamplate.getForObject(url, String.class), JsonArray.class);
	//Map<Long, String[]> informacion;
	//JsonArray respuestaObjetos;
	JsonArray respuesta;
	Informacion informaciones;
	int id=0;
	respuesta=json.getAsJsonArray();
	for(int i = 0;i<json.size();i++){
		funciona = respuesta.get(i).getAsJsonObject();
		informaciones = new Informacion();
		id++;
		informaciones.setId(Long.valueOf(id));
		informaciones.setCategory_id(funciona.get("category_id").getAsString());
		informaciones.setName(funciona.get("name").getAsString());
		informacionService.save(informaciones);
	}
}


//	private static String peticionHttpGet(String nueva) throws Exception {
//		// TODO Auto-generated method stub
//		// Esto es lo que vamos a devolver
//		StringBuilder resultado = new StringBuilder();
//		// Crear un objeto de tipo URL
//		URL url = new URL(nueva);
//
//		// Abrir la conexión e indicar que será de tipo GET
//		HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
//		conexion.setRequestMethod("GET");
//		// Búferes para leer
//		BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
//		String linea;
//		// Mientras el BufferedReader se pueda leer, agregar contenido a resultado
//		while ((linea = rd.readLine()) != null) {
//			resultado.append(linea);
//		}
//		// Cerrar el BufferedReader
//		rd.close();
//		// Regresar resultado, pero como cadena, no como StringBuilder
//		return resultado.toString();
//}
}
	

