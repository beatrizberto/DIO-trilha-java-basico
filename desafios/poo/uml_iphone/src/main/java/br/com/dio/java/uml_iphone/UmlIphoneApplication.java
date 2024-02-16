package br.com.dio.java.uml_iphone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.dio.java.classes.iphone;

@SpringBootApplication
public class UmlIphoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmlIphoneApplication.class, args);

		iphone iphoneDaBia = new iphone();

		iphoneDaBia.ligar();
		iphoneDaBia.atender();
		iphoneDaBia.iniciarCorreioVoz();

		iphoneDaBia.selecionarMusica();
		iphoneDaBia.tocar();
		iphoneDaBia.pausar();

		iphoneDaBia.exibirPagina();
		iphoneDaBia.atualizarPagina();
		iphoneDaBia.adicionarNovaAba();
	}

}
