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
public class produto {
    private String nome;
    

    public void setPreço(double preco) {
        this.preco = preco;
    }
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preço) {
        this.preco = preço;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public produto(String nome, Double preço, int estoque) {
        this.nome = nome;
        this.preco = preço;
        this.estoque = estoque;
    }
}
