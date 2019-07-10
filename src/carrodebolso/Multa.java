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
public class Multa extends Despesa{
    private String descricao;
    private String categoria;
    
    
    public Multa(String nome, double valor, String data, String descricao, String categoria){
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    public Multa(){  
    }

    @Override
    protected void cadastraDespesa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
