/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrodebolso;
import excecoes.*;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author futem
 */
public class Carro extends Veiculo{
    
    public Carro(String marca, String modelo, int anoFabricacao, int anoModelo, float motorizacao, String combustivel, String cor, String placa, String renavam){
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.motorizacao = motorizacao;
        this.combustivel = combustivel;
        this.cor = cor;
        this.renavam = renavam;
    }

    public Carro() {
    }

    @Override
    public void cadastraVeiculo() {
        Scanner teclado = new Scanner(System.in);
                                        
        System.out.println("Insira a marca:");
        
       //teste da exceção para marca
        boolean run = true;
        do{
          
            String marca = teclado.nextLine();
            this.marca = marca;
          try { 
             if (this.marca.isEmpty()){
                throw new DescricaoEmBrancoException("Campo marca não pode estar em branco." + " Preencha o campo");
              }
             else {
                 run = false;
            }
         } catch (DescricaoEmBrancoException ex) {
             System.out.println(ex.getMessage());
         }  
        } while(run);
        
        
        //teste da eceção para modelo
        
        System.out.println("Insira a modelo:");
        
        boolean run1 = true;
        do{
          
            String modelo = teclado.nextLine();
            this.modelo = modelo;
          try { 
             if (this.modelo.isEmpty()){
                throw new DescricaoEmBrancoException("Campo modelo não pode estar em branco." + " Preencha o campo");
              }else if (this.modelo.length() > 3){
                throw new ValorInvalidoException("Valor invalido");
              }else {
                 run1 = false;
                 
         }
          }catch (DescricaoEmBrancoException | ValorInvalidoException ex) {
             System.out.println(ex.getMessage());
         }  
        } while(run1);
        
       //teste da exceção anoFab
                    
        System.out.println("Insira o ano de fabricação:");
            boolean run2 = true;
        do{
          
            Integer anoFabricacao = teclado.nextInt();
            this.anoFabricacao = anoFabricacao;
          try { 
             if( this.anoFabricacao <= 1800){
            	 throw new ValorInvalidoException("Ano não pode ser menor que 0");
             }else if(!(anoFabricacao instanceof Integer)) {
            	 throw new ValorInvalidoException("Ano não pode conter letras");
             }
             else {
                 run2 = false;
             }
         }catch (ValorInvalidoException ex) {
        	System.out.println(ex.getMessage());  
			ex.printStackTrace();
		}
        } while(run2);    
        
             
       
        System.out.println("Insira a motorização:");
        boolean run3 = true;
        do{
          
            int motorizacao = teclado.nextInt();
            this.motorizacao = motorizacao;
          try { 
             if (this.motorizacao <= 1800){
                throw new DescricaoEmBrancoException("Ano Invalido." + " Preencha com um ano válido");
             }else {
                 run3 = false;
             }
         } catch (DescricaoEmBrancoException ex) {
             System.out.println(ex.getMessage());
         }  
        } while(run3);         
                            
        System.out.println("Insira o ano de fabricação:");
        boolean run4 = true;
        do{
          
            int anoFabricacao = teclado.nextInt();
            this.anoFabricacao = anoFabricacao;
          try { 
             if (this.anoFabricacao <= 1800){
                throw new DescricaoEmBrancoException("Ano Invalido." + " Preencha com um ano válido");
             }else {
                 run4 = false;
             }
         } catch (DescricaoEmBrancoException ex) {
             System.out.println(ex.getMessage());
         }  
        } while(run4); 
        
        
        System.out.println("Insira o tipo de combustivel:");
        teclado = new Scanner(System.in);
        String combustivel = teclado.nextLine();
        this.combustivel = combustivel;
        
        System.out.println("Insira a cor:");
        String cor = teclado.nextLine();
        this.cor = cor;
        
        System.out.println("Insira a placa:");
        String placa = teclado.nextLine();
        this.placa = placa;
        
        System.out.println("Insira o renavam:");
        String renavam = teclado.nextLine();
        this.renavam = renavam;
        
        Carro c = new Carro(marca, modelo, anoFabricacao, anoModelo, motorizacao, combustivel, cor, placa, renavam);
    }
    
}

