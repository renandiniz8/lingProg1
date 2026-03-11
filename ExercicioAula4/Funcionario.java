public class Funcionario {
    private String nome;
    private int idade;
    private String funcao;


    public Funcionario(String nome, int idade, String funcao){
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getFuncao(){
        return funcao;
    }
}
