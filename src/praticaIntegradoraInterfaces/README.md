###  Exercicio 1:

Um banco possui diferentes tipos de trasações que podem realizar, dentre elas estão:
Depósito, Transferência, Saque em dinheiro, Consulta de Saldo, Pagamento de Serviços.

Todas as transações tem dois métodos em comum, que são transacaoOk() e transaçãoNãoOk().

Com base nisso, existem diferentes tipos de clientes que podem interagir com o banco:

- **Executivos:** Fazem *Depósitos* e *Transferências*.


- **Básico:** Realizam *Consultas de Saldo*, *Pagamentos de Serviços* e *Saques em Dinheiro*.


- **Colaboradores:** Eles fazem *Saques em Dinheiro* e *Consultam Saldo*.

Implemente o cenário acima permitindo aos clientes mencionados acima, o acesso aos diferentes métodos dependendo da operação
que desejam realizar.

**Nota:**

- **Não é necessário implementar** cálculos ou funções matemáticas. Os métodos podem ser implementações e mensagens
  usando System.out.println(). por exemplo, ao fazer um déposito, a mensagem *"Fazendo um depósito"* aparece.


- Básico, Colaboradores e Executivos podem ser tratados como Classes.


- A Transação pode ser tratada como uma interface. Observe que existem diferentes tipos de transações que implementarão
  uma interface principal.

### Exercicio 2:

Propõem-se se desenvolver um programa que limita, através de uma interface, imprimir diferentes tipos de documentos.
Os tipos de documento são:

- **Currículos:** Inclui um pessoa com todos os seus atributos, mais uma lista de habilidades.


- **Livros em PDF:** Incluem atributos como número de paginas, nome do autor, titulo e gênero.


- **Relatórios:** Incluem um texto de comprimento n, número de páginas, autor e revisor.

Implemente esse cenário onde cada um desses objetos é criado e que, por meio de um método estático de uma interface ,
qualquer tipo de documento é passado e o conteudo é impresso.


### Exercicio 3:

Solicita-se a criação de uma classe abstrata chamada Animal, da qual derivam 3 animais: **Cachorro**, **Gato** e **Vaca**.
Os três animais são capazes de *"emitir sons"*, para isso será necessário implementar um método que permita visualizar
no console o som que cada animal emite. por exemplo, no caso do cachorro "Auau", do gto "Miau" e da vaca "Mu".

A partir dissom levando em consideração os gostos alimentares de cada animal (gato e cachorro são considerados carnívoros
e a vaca herbívora), incluir interfaces necessárias para contemplar os métodos *comerCarne* e *comerPasto*.

Feito isso, realize a criação de diferents animais e a invocação de suas respectivas implementações de métodos no Main.

Como proposta extra, sugere-se criar um método para comerAnimal onde, a partir da passagem de um objeto de qualquer tipo
de animal como parâmetro, chama o método comer de acordo com o referido animal.