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
public abstract class Despesa {
    
    protected String nome;
    protected double valor;
    protected String data;
    
    protected abstract void cadastraDespesa();
    
}
