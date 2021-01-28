
package ex1;


class Produto {
    
    private String descricao;
    private int qtdEstoque;
    private float preco;


    public void valorEmEstoque() throws VerificadaException{
       if(qtdEstoque > 0){
            float valor = this.getQtdEstoque() * this.getPreco();   
            System.out.println("Valor em estoque: " + valor);
       }
       else {
           throw new VerificadaException("Estoque zerado...");
       }
       
    }
    
    public void margemDeLucro() throws NaoVerificadaException{
        if(preco != 0){
            float lucro = ((this.getPreco() * 1.10f) - this.getPreco());
            System.out.println("Margem de lucro por produto: " + lucro);
        }
        else{
            throw new NaoVerificadaException("Preço zerado");
        }
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
