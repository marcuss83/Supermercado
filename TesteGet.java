
package teste.get;


public class TesteGet {

   
    public static void main(String[] args) {
      
        //cliente
        cliente c1 = new cliente ("Marcus", " 222.111.111.33");
        cliente c2 = new cliente ("Gabriel", "222.333.666.69");
        
        //produto
        produto p1 = new produto ("Mouse", 37.57, 300);
        produto p2 = new produto ("Camisa Real OG", 57.99, 50);
        
        //Item
        Item i1 = new Item (p2);
        Item i2 = new Item (p1);
        
        
        
        
        
        // coisas na tela 
        System.out.println(p2.getNome());
        System.out.println(p2.getPreco());
        System.out.println (p2.getEstoque());
        
        
        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());
        System.out.println (p1.getEstoque());
                
        
        
        
        System.out.println(c2.getNome());
        System.out.println(c2.getCpf());
        
      System.out.println(c1.getNome());
        System.out.println(c1.getCpf());
        
        
    }
    
}
