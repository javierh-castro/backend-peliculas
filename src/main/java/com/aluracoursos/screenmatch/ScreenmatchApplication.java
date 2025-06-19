package com.aluracoursos.screenmatch;

import com.aluracoursos.screenmatch.Principal.Principal;
import com.aluracoursos.screenmatch.model.DatosSeries;
import com.aluracoursos.screenmatch.service.ConsumoAPI;
import com.aluracoursos.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Primer proyecto Spring sin Web");
//		var consumoApi = new ConsumoAPI();
//		//var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&apikey=4fc7c187");
//		var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&&apikey=4fc7c187");
//
//
//		System.out.println(json);
////		json = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
////		System.out.println(json);
//		ConvierteDatos conversor = new ConvierteDatos();
//		DatosSeries datos = conversor.obtenerDatos(json, DatosSeries.class);
//		System.out.println(datos);
//	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();

	}
}
