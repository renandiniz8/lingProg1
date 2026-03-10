public class Farmacia {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        Remedio remedio = new Remedio();
        
        Funcionario funcionario = new Funcionario("Rodrigo", 26, "Estoquista");
        System.out.println(funcionario.getNome() + "\n" + funcionario.getFuncao() + "\n" +funcionario.getIdade());

        caixa.setPreco(150.02);
        caixa.setCodigo(12);
        caixa.setFuncionario("Renan");

        remedio.setFabricante("Laboratório Farma");
        remedio.setCodigo(8);
        remedio.setAtuacao("Intestino");
        
        System.out.println(caixa.getCodigo() + "\n");
    }


}
