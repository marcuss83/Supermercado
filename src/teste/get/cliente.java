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
public class cliente {
    
    private String nome;
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public cliente(String nome) {
        this.nome = nome;
    }
    
}
