/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrodebolso;

import java.util.Scanner;

/**
 *
 * @author futem
 */
public class Moto extends Veiculo{
    private float cilindrada;

    public Moto(String marca, String modelo, int anoFabricacao, int anoModelo, float motorizacao, String combustivel, String cor, String placa, String renavam, float cilindrada){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.motorizacao = motorizacao;
        this.combustivel = combustivel;
        this.cor = cor;
        this.placa = placa;
        this.renavam = renavam;
        this.cilindrada = cilindrada;
    }

    public Moto() {
    }

    @Override
    protected void cadastraVeiculo() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira a marca:");
        String m = teclado.nextLine();
        this.marca = m;
        
        System.out.println("Insira a modelo:");
        String model = teclado.nextLine();
        this.modelo = model;
        
        System.out.println("Insira o ano de fabricação:");
        int anoFab = teclado.nextInt();
        this.anoFabricacao = anoFab;
        
        System.out.println("Insira o ano do modelo:");
        int anoModel = teclado.nextInt();
        this.anoModelo = anoModel;
        
        System.out.println("Insira a motorização:");
        float motor = teclado.nextFloat();
        this.motorizacao = motor;
        
        System.out.println("Insira o tipo de combustivel:");
        teclado = new Scanner(System.in);
        String Fuel = teclado.nextLine();
        this.combustivel = Fuel;
        
        System.out.println("Insira a cor:");
        String color = teclado.nextLine();
        this.cor = color;
        
        System.out.println("Insira a placa:");
        String Placa = teclado.nextLine();
        this.placa = Placa;
        
        System.out.println("Insira o renavam:");
        String Renavam = teclado.nextLine();
        this.renavam = Renavam;
        
        System.out.println("Insira a cilindrada:");
        int cilind = teclado.nextInt();
        this.cilindrada = cilind;
    }
}
