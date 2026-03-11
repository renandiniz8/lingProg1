Diagrama UML da Farmacia (main)
---
Caixa
---
ATRIBUTOS <br>
#### preco: Double <br>
#### codigo: int <br>
#### funcionario: String <br>
---
MÉTODOS <br>
#### receberPagamento() <br>
#### gerarTroco() <br>
#### pagarFuncionario() <br>
---
---
Funcionario
---
ATRIBUTOS <br>
#### nome: String <br>
#### idade: int <br>
#### funcao: String <br>
---
MÉTODOS <br>
#### cadastrarFuncionario() <br>
#### atribuirFuncao() <br>
#### aposentar() <br>
---
---
Remedio
---
ATRIBUTOS <br>
#### fabricante: String <br>
#### exigeReceita: boolean <br>
#### atuacaoCorpo: List <br>
---
MÉTODOS <br>
#### cadastrarRemedio() <br>
#### conferirReceita() <br>
#### oferecerCliente() <br>
---
