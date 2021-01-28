
package ex1;

public class EX1 {

    public static void main(String[] args){
       Produto p = new Produto();
       p.setDescricao("Caneta");
       p.setPreco(0);
       p.setQtdEstoque(0);
       
       try{
           p.valorEmEstoque();
          
       }
       catch(VerificadaException e){
           System.out.println("Erro: " + e.getMessage());
       }
       
       try{
           p.margemDeLucro();
       }
       catch(NaoVerificadaException e){
           System.out.println("Erro: " + e.getMessage());
       }
      
       System.out.println("Fim do programa...");
       
       
       
       
       
      
       
       
       
           
       
    }
    
}
