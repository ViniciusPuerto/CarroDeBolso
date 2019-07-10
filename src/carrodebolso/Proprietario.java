/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrodebolso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author futem
 */
public class Proprietario {
    
    private final String nome;
    private final int idade;
    private final int registro;
    private int contador;
    public ArrayList<Veiculo> veiculos;
    
    
    public Proprietario(String nome, int idade, int registro){
        this.veiculos = new ArrayList();
        this.nome = nome;
        this.idade = idade;
        this.registro = registro;
    }

    
    public void adicionarVeiculo(String veiculo){
        switch(veiculo){
            case "carro":
                Carro c = new Carro();
                c.cadastraVeiculo();
                veiculos.add(c);
                break;
                
            case "moto":
                Moto m = new Moto();
                m.cadastraVeiculo();
                veiculos.add(m);
                break;
        }
    }
}