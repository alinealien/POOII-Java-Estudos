#### PROGRAMAÇÃO ORIENTADA A OBJETOS II

Referência:

Introdução à programação orientada a objetos com C++ e Java / Ednaldo Brigante Pizzolato.

______________________________________________________________________________________________________

- Linguagens imperativas: era composta de comandos sim ples, tais como atribuição, comandos condicionais e comandos de desvio de fluxo. De acordo com Tucker & Noonan (2007), uma linguagem imperativa é uma linguagem “Touring Complete”  (os paradigmas de programação orientada a objetos, programação funcional e programação lógica também contemplam o conceito de “Touring Complete”)) e também apresenta as seguintes características:
  - Estruturas de controle (seleção e repetição);
  - Entrada e saída de dados;
  - Tratamento de erro e de exceções;
  - Abstração procedural;
  - Expressões e comandos de atribuição;
  - Bibliotecas de apoio.



- Encapsulamento: De uma forma bem simples podemos verificar que uma cápsula tem a função
  de reunir um conjunto de elementos em um único dispositivo e também de prote-
  ger o material interno de ações indevidas do ambiente externo. A proteção está
  associada à visibilidade, abordada a seguir.

  ​

- Visibilidade: A visibilidade está relacionada à propriedade de ser visto ou não. Algo é visível
  quando está exposto. Aumentar a visibilidade implica em aumentar a exposição. Diminuir a visibilidade também está relacionado com a diminuição de exposição. Um objeto pode tanto estar ao alcance da visão (e, portanto, ser visível) como pode estar escondido.

  ​

- Encapsulamento e visibilidade: Outra vantagem do encapsulamento pode ser compreendida por meio dosmesmos exemplos: a composição. Construímos chips eletrônicos a partir da combinação de circuitos em um componente, chamado circuito integrado. Combinamos as funcionalidades de vários circuitos integrados em uma placa. Criamos um dispositivo eletrônico a partir da combinação de várias placas. Se você abrir seu computador, verá várias placas (placa mãe, placa de vídeo, placa de som,
  etc.). Se você abrir seu aparelho de DVD, também verá várias placas, e assim por diante. Com a composição é possível construir dispositivos de forma mais rápida, como exige a indústria eletroeletrônica.

  _______

  #### Sobre JAVA:

  Ela foi desenvolvida nos laboratórios da Sun Microsystems no início dos anos 1990, com
  o objetivo de ser uma linguagem-base de projetos de software para produtos eletrônicos. No início dos anos de 1990, Patrick Naughton, James Gosling e Mike Sheridan, três cientistas da Sun, começaram a definir as bases para o projeto de uma nova linguagem de programação que não contivesse os conhecidos problemas das linguagens tradicionais, como C e C++. a linguagem e a denominaram OAK. Entretanto, por problemas de Copyright, tiveram que a renomear para Java, em homenagem ao café que consumiam na Sun.  linguagem criada é mais simples que C++, pois não tem sobrecarga de operadores, structs, unions, aritmética de ponteiros e herança múltipla. Além disso, existe o gerenciamento de memória (garbage collection), que evita o vazamento de memória. Conquistou atenção devido a sua aplicação na World Wide Web, em que programas Java possibilitam a criação de animações (por meio de applets). Java é independete de plataformas. 

  Seu compilador não gera instruções específicas de uma plataforma, mas sim código intermediário, denominado 29 bytecode. Bytecode pode ser descrito como uma linguagem de máquina destinada a um processador virtual que não existe fisicamente. Para que o código possa ser executado é preciso que exista uma máquina virtual Java (ou JVM), que interpretará o código intermediário e executará as instruções conforme o planejado. Assim, máquinas virtuais devem ser instaladas nas máquinas alvo e serão responsáveis pela “conversa” com o processador. Um código Java compilado gerará um código intermediário, que poderá ser submetido a qualquer máquina virtual e será executado sem a necessidade de recompilação.

##### FORMA DE UTILIZAÇÃO - DETALHADA

- O programa deverá ser criado em um arquivo chamado teste.java, pois estamos criando uma
  classe em Java chamada teste. Os programas em Java devem ser armazenados em arquivos cujos nomes sejam iguais ao da classe com a extensão .java.

  ```
  class teste

  {

  // classe teste sem nada

  // declaração de main()

  public static void main(String args[])

  {

  System.out.println(“Olá pessoal“);

  }

  }

  ```

  ​

- Para executá-lo, basta digitar o comando java teste no prompt de comando. Não se esqueça de que a pasta corrente deve ser a pasta em que o programa foi gravado. Esse exemplo simples mostra que não precisamos incluir arquivo algum. Há uma função principal chamada main (em C++ também há!) que não retorna valor algum. A saída de dados é realizada pelo comando println (escrita com mudança
  de linha), acionado pela linha de código:

  ​

  ```
  System.out.println(“...“);

  import javax.swing.JOptionPane;

  class teste {

  public static void main(String args[]) {

  String x;

  x = JOptionPane.showInputDialog(null, “Digite uma msg: “);

  System.out.println(x);

  }

  }

  ```

  ​

As chaves servem para delimitar o início e o fim de uma estrutura ou bloco de código. Como Java é puramente orientado a objetos, tudo nele refere-se a classes. O reuso de classes já escritas é simples. Basta informar apenas onde estão. Assim, o comando import da primeira linha indica que utilizaremos a classe JOptionPane, do pacote swing, que está dentro do pacote javax. Podemos importar classes das seguintes formas:

a) import javax.swing.*;
b) import javax.swing.nome_da_classe;

No primeiro caso (a), todas as classes do pacote swing são visíveis. No segundo caso (b), apenas a classe especificada está visível. Alternativamente, poderíamos ter omitido o comando import e ter escrito o comando de leitura assim:

```
x = javax.swing.JOptionPane.showInputDialog (...);
```

Ou seja, informaríamos o nome completo da classe. Ah, os imports mais
utilizados são:

```
import java.awt.*; // GUI.
import java.awt.event.*; // GUI event listeners.
import javax.swing.*; // Mais GUI.
import java.util.*; // estruturas de dados
import java.io.*; // entrada e saída
import java.text.*; // Classes de formatação.
import java.util.regex.*; // Expressões regulares
```

**String, na verdade, é um tipo de dados utilizado para armazenar uma cadeia de caracteres.**

o resultado da chamada da “função” (vamos, por enquanto, chamar showInputDialog de função) será atribuído a uma cadeia de caracteres cujo nome é x.

EXEMPLO CODIGO CALCULO DE MÉDIA

```
import javax.swing.JOptionPane;
import java.lang.*;
class teste
{
public static void main(String args[])
{
float nota, media, soma = 0;
int i;
for (i=0;i<3;i++)
{
nota = Float.parseFloat(JOptionPane.showInputDialog(
null, “Digite uma nota: “));
soma = soma + nota;
}
media = soma/3;
System.out.println(media);
}
}
```

Para converter o valor lido por JOptionPane.showInputDialog em float é preciso chamar a “função”. De conversão de tipo para converter de String para float. O valor convertido é armazenado em nota

**Em Java, para se declarar um vetor de inteiros chamado dias_do_mes, precisamos fazer as seguintes declarações:**

```
int dias_do_mes[ ];//VETOR
dias_do_mes = new int[12];
```

A primeira linha apenas indica ao compilador que haverá um vetor. A variável é automaticamente ajustada para null quando o primeiro comando termina. Somente após a alocação (por meio do comando new int seguido do tamanho do vetor) é que o vetor passa a existir. Em Java, não é preciso preocupar-se com a devolução da memória alocada para o sistema operacional. Isso é automaticamente feito pelo sistema interno de coleta de lixo. Uma vantagem da linguagem Java é, portanto, o controle efetivo da memória utilizada.



#### INTRODUÇÃO A ORIENTAÇÃO A OBJETOS

o paradigma de orientação a objetos utiliza os mesmos princípios utilizados na construção de hardwares (com o uso de componentes básicos como transistores, resistores, fusíveis, diodos, chips, etc.). Os “objetos” já existentes são utilizados para produzir novos “objetos”.

O paradigma de orientação a objetos objetiva mimetizar o que ocorre com o hardware, utilizando um conceito bem comum de nosso mundo: objetos. Formalmente, para uma linguagem ser considerada orientada a objetos ela precisa implementar quatro conceitos básicos:

1. **Abstração:** habilidade de modelar características do mundo real.
2. **Encapsulamento:** habilidade da unidade de proteger os dados e permitir que apenas suas operações internas tenham acesso a eles. Em linguagens orientadas a objeto o encapsulamento acontece quando escondemos os atributos e métodos do programador (usando private). Assim, ele não pode acessar diretamente tais membros da classe.
3. **Herança:** mecanismo que permite a) a criação de novos objetos por meio da modificação de algo já existente e b) o vínculo do objeto criado com o objeto antigo. É um conceito muito conhecido na natureza.
4. **Polimorfismo:** capacidade de uma unidade ter várias formas.



**CLASSES E OBJETOS:**

Uma classe seria um modelo (carimbo) de um objeto. Objeto seria sua concretização (quando o carimbo é usado em conjunto com a tinta), ou seja, uma instância da classe. Uma classe deve prever um conjunto de características para o objeto a ser criado a partir do molde, bem como um conjunto de ações que o objeto poderá executar. Ações são chamadas de métodos, enquanto as características são chamadas de atributos.

**Para deixar bem claro o conceito de classe e objeto, podemos imaginar a classe cachorro. Um molde ou carimbo genérico seria aquele que permitisse “guardar” informações, tais como nome, altura, peso, idade, raça, cor dos olhos, tamanho do rabo, etc. Um exemplo de um cachorro poderia ser o meu. O Rex tem uma raça específica, uma altura, peso, etc. Ele é uma “instância” da classe ca-chorro. Não consigo tocar na classe cachorro, mas consigo tocar em um exemplo da classe cachorro, que é o Rex. Meu cachorro é um objeto da classe cachorro. Ah, um objeto pode interagir com outro e mudar suas características! Poderíamos utilizar um objeto “spray” para pintar (uma ação de “spray”) a empilhadeira e, assim, mudar um valor de seus atributos (o atributo cor).**



#### **ELEMENTOS DE UMA CLASSE**:

exemplo já citado seria o da lâmpada. O tipo de lâmpada, a cor, a voltagem, a potência e o estado da lâmpada (acesa, apagada ou queimada) seriam exemplos de atributos. Acender, apagar e queimar a lâmpada seriam exemplos de métodos.

```
typedef struct data
{
int dia, mes, ano;
} data;
```

Em termos de linguagem de programação, classes diferem de estruturas (structs) no quesito proteção de dados. No exemplo da data, podemos ver um conjunto de dados (dia, mês e ano) sendo empacotado em um mesmo “volume”. Entretanto, não há nenhum mecanismo que impeça o programador de criar uma variável do tipo data (por exemplo, data_nascimento) e de atribuir o valor 45 para mês. Sim, não faz sentido colocar o valor 45 em mês, visto que existem apenas 12 meses e é por isso que devemos criar “estruturas” que impeçam tal situação. Assim, é interessante que possamos controlar os valores assumidos pelos elementos da estrutura de forma que dia, mês e ano tenham sempre valores válidos.

A classe esconderá seus dados (visibilidade) e permitirá que apenas alguns métodos sejam disponibilizados para alteração deles. Se criássemos a classe data, precisaríamos de métodos (não chamamos mais de funções) que mantivessem a consistência destes. Um método poderia ser atribuir_dia(int x). 



#### DIAGRAMA DE CLASSES

Uma forma muito comum de se representar classes é por meio do diagrama
de classes da UML (Unified Modeling Language). Com ele, é possível representar
visualmente uma classe. Também é possível representar a relação entre elas (o
que será visto mais adiante).
Uma classe, em UML, é representada por um retângulo com 3 partes. Na par-
te superior encontra-se o nome da classe, na intermediária os atributos e na inferior
os métodos. O nome da classe deve ser em negrito e, geralmente, é um substan-
tivo em que a primeira letra é maiúscula. Na parte intermediária do diagrama são
apresentados os atributos ou características da classe. Além do nome do atributo,
devemos especificar sua visibilidade, que pode ser:

```
~: as classes de um pacote podem ser usadas;
+: público;
#: protegido;
-: privado.
```

Normalmente você verá os atributos tendo visibilidade privada (-). Isso sig-
nifica que somente os métodos da classe podem acessá-los. Visibilidade privada
impede que os valores sejam acessados diretamente. Para se alterar um atributo
privado é preciso que exista um método que todos possam acionar (acesso pú-
blico) relacionado a ele. Tal método controlará os valores que o atributo poderá
assumir. Assim, acesso público é um acesso irrestrito e acesso privado é um
acesso restrito. O modo de acesso protegido está relacionado com herança.

os atributos, estes têm tipo de dado e podem ainda apre-
sentar um valor padrão. Note que na classe a seguir, o atributo Nome é do tipo
String e o valor padrão, representado pelo símbolo de igual, é Ednaldo:

```
	Pessoa
+Nome : String = “Ednaldo“
+Idade : int = 43
...
...
+fazer_aniversario()
```

Agora temos os méto-
dos. Note que ambos estão com acesso público. É importante que a classe tenha
métodos públicos para que os dados possam ser modificados. A classe em questão
é incompleta e apresenta apenas alguns métodos. O método fazer_aniversário(),
quando acionado, altera o valor de idade. Se o método fazer_aniversário fosse pri-
vado, então não poderia ser acionado diretamente. Um método será privado ape-
nas em casos especiais.



#### RELACIONAMENTO ENTRE CLASSES

A relação de herança é aquela em que uma
classe herda características de uma classe mais genérica. Normalmente é re-
conhecida por meio da relação é-um. “Um cachorro é um mamífero” indica que
cachorro herda características de uma classe mais genérica, que é a classe ma-
mífero. Na verdade, a classe mamífero é mais genérica, pois permite que vários
animais herdem características dela (tigre, gato, cavalo, etc.).
Outro relacionamento importante é o de composição. Ele é reconhecido
pela relação tem. Um carro tem uma direção, tem 4 rodas, etc. Um funcionário
tem data de nascimento, departamento, etc. Ou seja, data de nascimento é um
atributo do tipo data.

Tanto com herança quanto com composição é possível fazer reuso de clas-
ses já criadas. Esse é um dos grandes atrativos da orientação a objetos, que faz
com que seja fortemente adotada nas fábricas de software

#### EXEMPLOS

A especificação do código dos métodos pode vir logo após a declaração
da classe. Alternativamente, um método pode ser definido dentro da decla-
ração da classe. No exemplo a seguir, o construtor sem parâmetros tem sua
implementação dentro da declaração da classe. Tal implementação pode ser feita,
portanto, tanto dentro como fora da declaração da classe!

```
class horario {
private:
int hora;
int minuto;
int segundo;
public:
horario() { hora = 10; minuto = 5; Segundo = 2;}
horario(int,int,int);
acerta_hora(int);
acerta_minuto(int);
acerta_segundo(int);
~horario();
};
horario::horario(int a, int b, int c) {
hora = minuto = segundo = 0;
if (a >=0 && a < 24)
hora = a;
...
}
```

O outro construtor, os métodos e o destruidor (ou destrutor) deverão ser
implementados fora da classe.

Assim, o construtor
com parâmetros deverá ter nome e sobrenome, como no exemplo de código
apresentado.
Provavelmente você já sabe completar o código escondido do construtor
horário. Note que no protótipo não havia necessidade de especificar os nomes
dos parâmetros. Aqui há.
O destruidor (ou destrutor) tem um código muito simples. 

```
horario::~horario() { }
```

o código é vazio. Para casos em que não exista alocação dinâmica de
memória, os destruidores são simples e não precisam nem de declaração. Para
os casos de alocação dinâmica de memória, o destrutor é necessário, pois é ele
que devolve a memória emprestada pelo construtor no momento da alocação
dinâmica.
Vale relembrar que tanto o construtor como o destrutor não são acionados
pelo programador. O construtor é acionado no momento da declaração do objeto
e o destruidor é acionado quando termina o escopo do objeto.
Todos os outros métodos devem ter o especificador da classe seguido do
operador de escopo (::) seguido do nome do método. Lembre-se que, dentro
do método, é importante verificar se os parâmetros passados satisfazem os
critérios da classe. Os métodos são o meio de acesso aos atributos. Se não
verificarem os dados passados deixarão que os atributos assumam valores inde-
vidos. E isso é contrário ao “espírito” de orientação a objetos.

utilizaremos o exemplo
da classe Horário, que deve armazenar hora, minuto e segundo. Vamos criar dois
arquivos com extensão .java. O primeiro – referente à classe Horário – deverá se
chamar Horário.java. O segundo – referente ao programa principal responsável
pelo teste do uso da classe Horário – se chamará testeHorario.java.

```
public class Horario {
private int hora, minuto, segundo;
public Horario() { hora = 0; minuto = 0; segundo = 0;}
public Horario(int a, int b, int c) {
hora = minuto = segundo = 0;
if (a < 24 && a >= 0) hora = a;
if (b < 60 && b >= 0) minuto = b;
if (c < 60 && b >= 0) segundo = c;
}
public void setHora(int a) {
if (a < 24 && a >= 0) hora = a;
}
public void setMinuto(int a) {
if (a < 60 && a >= 0) minuto = a;
}
public void setSegundo(int a) {
if (a < 60 && a >= 0) segundo = a;
}
public int getHora() { return hora; }
public int getMinuto() { return minuto; }
public int getSegundo() { return segundo; }
}
```

A classe Horário deverá restringir o acesso aos 3 atributos já mencionados, a
partir do especificador de acesso private. A classe Horário deverá ser delimitada pelo abre chaves ({) e o fecha chaves
(}). Outra questão importante a ser observada no código é a verificação dos va-
lores que serão atribuídos aos atributos. Note que todos os valores, quer no cons-
trutor quer nos métodos set, devem ser verificados. Hora deve sempre ficar entre 0 e 24; minuto e segundo sempre entre 0 e 60.

Bom, a classe Horário está pronta e pode ser compilada. Na linha de co-
mando, digite:

```
javac Horário.java
```

 comando javac aciona o compilador java e se o código estiver correto
gerará o arquivo Horário.class.
Precisamos de um programa principal para utilizar a classe Horário. Sim, em
Java também é necessário um programa principal (main).

```
public class testeHorario {
public static void main(String[] args) {
Horario almoco = new Horario(12,0,0);
System.out.println(almoco.getHora());
}
}
```

O objeto almoço é criado por meio do comando new Horario. No exemplo, o
objeto foi criado com os parâmetros 12, 0 e 0. Isso significa que o horário arma-
zenado em almoço será 12h00.
Para imprimir o valor hora armazenado no objeto, busca-se o valor a partir
do método getHora( ) e promove-se a saída por intermédio do println.

Outro exemplo interessante de classe é o jogo da velha. Consiste em um
tabuleiro com peças O e X que devem ser colocadas alternadamente pelo jogador
1 e pelo jogador 2. A classe deve controlar as jogadas, saber a vez do jogador, sa-
ber se um jogador fez uma jogada incorreta ou não, detectar se o jogo já terminou
e se houve um ganhador ou não. Sempre que uma jogada correta for realizada e
o jogo não houver terminado, então a classe solicitará que o outro jogador efetue
sua jogada. O jogo deve iniciar com as posições vazias. Uma jogada válida é uma
jogada dentro do tabuleiro em uma posição ainda não ocupada por nenhuma peça.
Vejamos o protótipo da classe.

```
class jogo {
private:
char tab[3][3]; // armazena jogadas
int jogadas; // controla total de jogadas
char jogador; // controla de quem é a vez
public:
jogo( ); // inicializa o jogo
bool terminou( ); // jogo terminou?
char verifica_vencedor( ); // quem venceu?
bool posicionar_peca(int, int); // posicionar peça
void jogar( ); // inicia o jogo
void limpa_tela( ); // limpa a tela
void troca_jogador( ); // troca jogador
void desenhar_tabuleiro( ); // desenha tabuleiro
};
```

Deve-se escolher um símbolo – por exemplo * – para indicar que o local
ainda não foi preenchido. O atributo jogadas será responsável por controlar o
total de jogadas já realizadas. Deve iniciar-se com o valor zero e ter seu valor
incrementado em uma unidade a cada nova jogada. Dessa forma, servirá para
controlar o final do jogo (pois um jogo da velha tem, no máximo, nove jogadas).
Assim, se o tabuleiro houver sido preenchido e não houver vencedor, então o jogo
terminou e houve empate. O código do método de controle de fim de jogo será
apresentado em breve. Por fim, o atributo jogador. Ele armazenará o símbolo do
jogador da vez.

```
jogo::jogo( ) {
int i, j;
for (i=0;i<3;i++)
for (j=0;j<3;j++)
tab[i][j] = ’*’;
jogadas = 0;
srand(time(NULL)); // inicializa semente para sorteio
if (rand( ) % 2 == 0) jogador = ’X’;
else jogador = ’O’;
}
```

Voltando ao construtor, deve-se observar que há a chamada de srand. Para
que isso ocorra é preciso incluir time.h no código. Srand permite inicializar a se-
mente do gerador de números aleatórios. Isso permitirá que sempre que um “sorteio” for realizado, ele possa ser diferente do sorteio anterior. O parâmetro
time(NULL) garante que isso aconteça. Se o parâmetro for um valor constante,
então os sorteios serão viciados (sempre a mesma coisa, não importa quantas
vezes você rode o programa). Ou seja, se o jogador a iniciar a partida for X quando
o parâmetro for 3, então sempre o jogador X iniciará a partida! Com time(NULL)
isso não é verdade. Uma vez pode ser o X e outra pode ser o O. O sorteio é feito
por meio da chamada da função rand( ). Seu resultado é um número inteiro que
será dividido, nesse caso, por 2. Se o resto for 0, então será o jogador X a iniciar
a partida, caso contrário será o jogador O.

Bom, vamos agora ao código do método de verificação se o jogo terminou
ou não. Se já ocorreram 9 jogadas, então não há mais espaço disponível para
novas jogadas. Caso o número de jogadas seja menor que 9, então é preciso
verificar se já houve um vencedor. Se houve, então o jogo terminou.

```
bool jogo::terminou( ) {
if (jogadas < 9 && verifica_vencedor( ) == ’*’)
return false;
else
return true;
}
```

