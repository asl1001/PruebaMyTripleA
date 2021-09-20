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

	//String url = "https://api.coingecko.com/api/v3/coins/categories/list";
	String url="https://api.coingecko.com/api/v3/coins/markets?vs_currency=eur&order=market_cap_desc&per_page=100&page=1&sparkline=false";
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
		informaciones.setSymbol(funciona.get("symbol").getAsString());
		informaciones.setName(funciona.get("name").getAsString());
		informaciones.setImage(funciona.get("image").getAsString());
		informaciones.setCurrent_price(funciona.get("current_price").getAsLong());
		informaciones.setMarket_cap(funciona.get("market_cap").getAsLong());
		informaciones.setMarket_cap_rank(funciona.get("market_cap-rank").getAsLong());
		informaciones.setFully_diluted_valuation(funciona.get("fully_diluted_valuation").getAsLong());
		informaciones.setTotal_volume(funciona.get("total_volume").getAsLong());
		informaciones.setHigh_24h(funciona.get("high_24h").getAsLong());
		informaciones.setLow_high(funciona.get("low_24h").getAsLong());
		informaciones.setPrice_change_24h(funciona.get("price_change_24h").getAsLong());
		informaciones.setPrice_change_percentage_24h(funciona.get("price_change_percentage_24h").getAsLong());
		informaciones.setMarket_cap_change_24h(funciona.get("market_cap_change_24h").getAsLong());
		informaciones.setMarket_cap_change_percentage_24h(funciona.get("market_cap_change_percentage_24h").getAsLong());
		informaciones.setCurrent_price(funciona.get("circulating_supply").getAsLong());
		informaciones.setTotal_supply(funciona.get("total_supply").getAsLong());
		informaciones.setMax_supply(funciona.get("max_supply").getAsLong());
		informaciones.setAth(funciona.get("ath").getAsLong());
		informaciones.setAth_change_percentage(funciona.get("ath_change_percentage").getAsLong());
		informaciones.setAth_date(funciona.get("ath").getAsString());
		informaciones.setAt1(funciona.get("atl").getAsLong());
		informaciones.setAt1_change_percentage(funciona.get("atl_change_percentage").getAsLong());
		informaciones.setRoi(funciona.get("last_updated").getAsString());
		informaciones.setLast_updated(funciona.get("last_updated").getAsString());
		
		informacionService.save(informaciones);
	}

}
	private String[] toStrArray(JsonArray tmp) {
		String[] devolver;
		devolver=new String[tmp.size()];
		for(int i=0;i<tmp.size();i++) {
			devolver[i]=tmp.get(i).getAsString();
		}
		return devolver;
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
	

