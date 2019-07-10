/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrodebolso;

/**
 *
 * @author futem
 */
public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected Integer anoFabricacao;
    protected int anoModelo;
    protected float motorizacao;
    protected String combustivel;
    protected String cor;
    protected String placa;
    protected String renavam;
    
    protected abstract void cadastraVeiculo();
    
}