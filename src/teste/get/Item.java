/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.get;

/**
 *
 * @author SESI_SENAI
 */
public class Item {
    
    private produto produto;

    public void setProduto(produto produto) {
        this.produto = produto;
    }

    public void setQtdcomprada(int qtdcomprada) {
        this.qtdcomprada = qtdcomprada;
    }

    public Item(produto produto) {
        this.produto = produto;
    }

    public produto getProduto() {
        return produto;
    }

    public int getQtdcomprada() {
        return qtdcomprada;
    }
    private int qtdcomprada;
    
    
}
