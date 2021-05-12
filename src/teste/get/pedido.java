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
public class pedido {
    
    private cliente cliente;
    private Item itens[] = new Item [10];
   
    private  double valortotal;
    private int vc = 0;

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public Item[] getItens() {
        return itens;
    }

    public cliente getCliente() {
        return cliente;
    }

    
    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    
    public double getValortotal() {
        return valortotal;
    }

    public pedido(cliente cliente) {
        this.cliente = cliente;
    }
    
    public void adicionaitem (Item item)  {
        itens[vc] = item;
        this.valortotal += item.getQtdcomprada() * item.getProduto().getPreco();
        vc++;
        
    }
        
}
