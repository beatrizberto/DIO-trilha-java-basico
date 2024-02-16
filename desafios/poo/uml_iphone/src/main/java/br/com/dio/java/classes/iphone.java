package br.com.dio.java.classes;

import br.com.dio.java.interfaces.aparelhoTelefonico;
import br.com.dio.java.interfaces.navegadorInternet;
import br.com.dio.java.interfaces.reprodutorMusical;

public class iphone implements aparelhoTelefonico, reprodutorMusical, navegadorInternet{

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        
    }

    @Override
    public void ligar() {
        System.out.println("Realizando uma chamada...");
        
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
        
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando...");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    
    
}
