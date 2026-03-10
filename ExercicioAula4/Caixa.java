public class Caixa {
    private Double preco;
    private int codigo;
    private String funcionario;
    

    public void setPreco(Double preco) {
        this.preco = preco;
        //System.out.println(preco);
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
        //System.out.println(codigo);
    }

    public void setFuncionario(String funcionario){
        this.funcionario = funcionario;
        //System.out.println(funcionario);
    }

    public Double getPreco(){
        return preco;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getFuncionario(){
        return funcionario;
    }
}
