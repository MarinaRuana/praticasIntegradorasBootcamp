## Objetivo

O objetivo deste exercício prático é que possamos aprofundar o uso de Genéricos,
fazendo uso das diferentes coleções de dados e do Java Api Stream para lidar com
programação funcional junto com expressões lambda. Para isso vamos propor uma
série de exercícios simples e incrementais (já que vamos trabalhar e adicionar lógica
às classes que temos que construir), que nos permitirão rever os tópicos que
estudamos.



### Exercício 1:

Crie uma classe Veiculo com atributos:
- modelo;
- marca;
- preço;

Em seguida, crie uma classe de Garagem com os atributos:
- id;
- uma lista de veículos;

Crie também os construtores das classes e os métodos Setter e Getter.

### Exercício 2:

Crie uma classe Main com o método main para representar um cenário onde uma
instância da classe garagem é criada com uma lista de veículos baseada na tabela
abaixo.



|   Marca    |  Modelo   | Preço  |
|:----------:|:---------:|:------:|
|    Ford    |  Fiesta   |  1000  |
|    Ford    |   Focus   |  1200  |
|    Ford    | Explorer  |  2500  |
|    Fiat    |    Uno    |  500   |
|    Fiat    |  Cronos   |  1000  |     
|    Fiat    |  Torino   |  1250  |     
| Chevrolet  |   Aveo    |  1250  |
| Chevrolet  |   Spin    |  2500  |
|   Toyota   |  Corola   |  1200  |
|   Toyota   | Fortuner  |  3000  |
|  Renault   |   Logan   |  950   |


### Exercício 3:
Usando o método sort na lista de Veículos com expressões lambda, obtenha uma
lista de veículos ordenados por preço do menor para o maior, imprima o resultado na
tela.

### Exercício 4:

Da mesma forma que no exercício anterior, imprima uma lista ordenada por marca.

### Exercício 5:

Obtenha uma lista de veículos com preço não superior a 1000, depois outra com
preços maiores ou iguais a 1000 e, por fim, com o preço médio total de toda a lista de
veículos.