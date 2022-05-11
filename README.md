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

______________________________

#### SOBRECARGA

Em Java não há sobrecarga de operadores. Existem apenas sobrecargas
de métodos e de construtores. a sobrecarga de métodos
e de construtores acontece pela diferenciação da assinatura. No exemplo a se-
guir, será apresentada a classe caixote, com largura, altura e profundidade. Serão
criados 3 construtores para inicializar um objeto da classe: um sem parâmetros,
outro com um parâmetro e outro com três parâmetros.

```
class caixote {
// atributos
private double largura, altura, profundidade;
// construtor sem parâmetros
// cria um caixote padrão de tamanho 1
caixote( ) { largura = 1; altura = 1; profundidade = 1;}
// cria um caixote com tamanho L (se L for positivo)
caixote( double L) {
if (L > 0) largura = altura = profundidade = L;
else largura = altura = profundidade = 1;
}
// cria um caixote com dimensões L x A x P desde que
// cada uma das dimensões seja positiva
caixote(double L, double A, double P) {
if (L > 0) largura = L;
else largura = 1;
if (A > 0) altura = A;
else altura = 1;
if (P > 0)
profundidade = P;
else
profundidade = 1;
}
// método de cálculo do volume do caixote
double volume( ) {
return largura * altura * profundidade;
}
}
```

66
// método de cálculo do volume do caixote
double volume( ) {
return largura * altura * profundidade;
}
}
O programa principal deve acionar cada construtor por meio do operador
new. Para se criar um objeto chamado c1 utilizando o construtor com 3 parâme-
tros, o comando seria:

```
caixote c1 = new caixote(5,6,7);
```

o objeto c1 seria declarado assim:

```
caixote c1(5,6,7);
```

Um código exemplo do programa principal em Java que utiliza caixote seria
o apresentado a seguir.

```
class caixoteDemo {
public static void main(String args[]) {
caixote c1 = new caixote(5,10,15);
caixote c2 = new caixote( );
caixote c3 = new caixote(15);
double vol1, vol2, vol3;
vol1 = c1.volume();
...
System.out.println(“ vol 1 = “ + vol1);
}
}
```

___________________________

#### Alocação dinâmica de memória

Sempre que você optar pela escolha de um tamanho fixo antes da execução
do programa, o compilador providenciará a alocação prévia da memória a ser
utilizada e isso não poderá ser modificado durante a execução de seu programa.
Isso se chama alocação estática de memória e se contrapõe ao conceito de
alocação dinâmica de memória.

A alocação dinâmica, por outro lado, permite que seu programa aguarde até
o momento da execução e consulte o usuário para saber qual a quantidade de me-
mória que deverá ser alocada para executar a tarefa. Como cada usuário fornecerá
uma resposta e como a decisão da quantidade de memória utilizada ficará adiada
para quando o usuário executar o programa, isso se chama alocação dinâmica de
memória. Percebe-se que com a alocação dinâmica de memória, o programa se
adequará à necessidade do usuário.

Ponteiros trabalham em sintonia com a alocação dinâmica de memória (afi-
nal de contas, apontam para uma área de memória), mas não só isso. Ponteiros podem apontar para uma área de dados já alocada (quer dinâmica, quer estatica-
mente) ou mesmo para uma área de código. Sim, ponteiros podem apontar para
uma função, por exemplo! Dessa forma, tornam-se coringas em programação e,
se bem empregados, são muito úteis.
Um dos empregos de ponteiros é na passagem de parâmetros para funções
e procedimentos.

Os dados de um programa estão armazenados na memória primária (me-
mória RAM) do computador. Cada dado é referenciado por um endereço, por
exemplo, 0 x 3EFF34, 0 x 4AFE52 e assim por diante. Não é conveniente progra-
mar utilizando endereços. Além de dificultar a tarefa de criação do programa, este
se torna ilegível quando houver a necessidade de se fazer alguma alteração no
código. Assim, convencionou-se atribuir um nome significativo (por isso você não
deve utilizar xy34 como um nome de variável) para uma posição de memória que
armazenará um determinado valor. 

No ambiente de programação
utilizamos os nomes de variáveis para referenciar uma posição de memória. Ou
seja, utilizamos nomes no lugar de endereços.
Existem situações em que um objeto pode estar com uma pessoa em um
determinado momento e com outra em outro momento. Nesses casos é con-
veniente ter alguém responsável por nos indicar quem está com o objeto.

Assim, um ponteiro é uma posição de memória que também tem um endereço
e que armazena um endereço de outra variável. Pelo fato de armazenar um ende-
reço, dizemos que ele “aponta” para um lugar.

Se existem as áreas de dados reservadas para os inteiros, para os floats,
etc., existem as áreas reservadas para os ponteiros para inteiros, ponteiros para
floats, entre outros.

Como a cadeia de caracteres é formada por posições consecutivas de me-
mória, o endereço inicial é menor que o endereço final. Seria equivalente a dizer
que em uma rua com casas numeradas em ordem crescente, alguém estivesse
apontando para a primeira casa da rua e outra pessoa estivesse apontando para
a última casa da rua. Como a numeração é crescente, sabe-se que a pessoa no
começo da rua apontará para um número (endereço) menor que o apontado pelo
colega no final da rua. Daí o significado da primeira parte da expressão lógica
(inicio < fim && *inicio == *fim). 

Em alocação dinâmica, o que se deseja é solicitar ao sistema que forneça
um endereço a partir do qual se possam armazenar informações. Vamos começar
com algo simples: uma variável.
A alocação é solicitada a partir do comando malloc (ou calloc). Se a solici-
tação for satisfeita, um endereço é retornado. Caso contrário, NULL é retornado.

```
p = (int *) malloc(sizeof(int));
```

Como a função malloc retorna um ponteiro genérico, é preciso realizar a
conversão do ponteiro para o tipo desejado. No exemplo, a conversão é feita para
inteiro. Como é ponteiro, é preciso ter o símbolo *. Malloc aloca uma quantidade
de posições de memória de um determinado tamanho. Assim, a função malloc
precisa ser informada do tamanho desejado de memória a ser alocada. No caso,
a intenção era utilizar uma posição para inteiro.
Se a solicitação não for atendida, então NULL será retornado. Assim, é
preciso verificar se obtivemos o que solicitamos:

```
//EX EM C
if (p == NULL) {
printf(“Solicitação não atendida! \n“);
exit(1);
}
```

É importante observar que quando uma alocação de memória é feita, um espaço da área de dados é reservada para seu uso. Depois de utilizá-lo, você deve devolvê-lo ao dono para que, caso alguém deseje, possa utilizá-lo. Se você só realizar solicitações de alocação e não fizer nenhuma devolução será equivalente a um aluno que vai à biblioteca e só faz empréstimos sem devolver. Os livros emprestados não estarão disponíveis para que outros possam utilizá-los. Em C a devolução é feita com o comando free. Lembre-se de utilizá-lo!



####Composição e herança

COMPOSIÇÃO: o mundo real contém objetos que são obtidos por meio da com-
binação com outros objetos. Quando dizemos que um carro tem uma direção,
estamos indicando que “direção” faz parte de “carro”; quando um empregado tem
uma data de admissão, estamos indicando que a data de admissão faz parte da
classe “empregado”.

A relação tem-um é uma relação importante em orientação a objetos, pois
permite que o processo de criação de uma classe mais complexa seja feito de
forma similar a um jogo Lego.

HERANÇA: Do ponto de vista biológico, herança é a transmissão de características co-
dificadas nos genes para outros indivíduos da mesma espécie, por meio de um
mecanismo chamado reprodução. Assim, a criação de um novo indivíduo é feita
segundo um modelo existente. O que ocorre é um reaproveitamento de um có-
digo genético já existente.
O paradigma de orientação a objetos inspirou-se também no conceito de
herança. Se há um código que define uma classe X e há outra classe Y que utiliza
a classe X como exemplo, então, segundo o conceito de herança, o código da
classe X pode ser reaproveitado. No exemplo, a classe X serve como base para
a criação da classe Y. A classe Y é derivada da classe X, assim como queijo,
requeijão e iogurte seriam derivados de leite. Alguns outros exemplos podem dei-
xar o conceito de herança mais claro. O primeiro exemplo seria a classe veículo.
A definição de veículo é “um meio de transporte qualquer”. Ou seja, tudo aquilo
capaz de mover algo de um lugar para outro é considerado veículo. 

Uma relação muito clara que emerge dessa relação é a relação é-um. Um carro
é um veículo. Portanto, veículo é uma classe mais geral, que permite diferenciar
objetos que transportam algo de outros objetos que servem para enfeitar ambien-
tes, por exemplo. Estamos falando de categorias. Na verdade, podemos criar uma hierarquia de classes.

O fato é que a relação é-um se mantém. Um carro de 4 rodas é um veículo.
Um carro de 4 rodas é um veículo terrestre de rodas. É importante observar que
a relação é-um pode ser direta (como no caso filho-pai) ou indireta (como no caso
neto-avô ou bisneto-bisavô). Na herança direta não existe uma classe intermediá-
ria. Na indireta há pelo menos uma classe entre as duas relacionadas.
A herança pode ser simples ou múltipla. Na herança simples apenas uma
classe é considerada para efeitos de transmissão de características. Na herança
múltipla mais de uma classe é considerada.

Outro conceito importante associado com herança é o de sobreposição de
método. Sobreposição (ou anulação) é diferente de sobrecarga. Quando dois mé-
todos têm o mesmo nome, mas assinaturas diferentes, dizemos que há sobrecar-
ga de método. Quando um método com mesmo nome e mesma assinatura está
presente, tanto na classe base como na classe derivada, o método da classe
derivada esconde o método da classe base, ou seja, sobrepõe-se ao método da
classe base. A chamada do método por um objeto da classe derivada sempre
acionará o método presente na classe derivada.

Herança está associada à relação é-um,
enquanto composição está associada à relação tem-um.

#####Exemplo em Java

Java trabalha apenas com herança simples.  a classe PONTO, que deve ter como atributos as coordenadas x
e y. Também é importante que existam as funções de acesso aos atributos, chamadas de funções set e get. As funções set servem para alterar os valores,
enquanto as funções get servem para recuperar os valores armazenados.

```
public class PONTO {
private int x, y;
public PONTO(int a, int b) { x = a; y = b;}
public void setx(int a) { x = a;}
public void sety(int a) { y = a;}
public int getx(){return x;}
public int gety(){return y;}
public void imprimir(){
System.out.println(“ x = “+ x+ “ y = “+ y);
}
}
```

A criação da classe circulo pode ser feita levando-se em conta a existência
da classe ponto.

```
public class circulo extends PONTO {
private double raio;
public circulo (int a, int b, double c) {
super(a,b);
raio = c;
}
public double getRaio() {
return raio;
}
@Override public void imprimir(){
super.imprimir();
System.out.println(“raio = “+getRaio());
}
public double getArea() {
return 3.141592*getRaio()*getRaio();
}
public double getPerimetro() {
return 2*3.141592*getRaio();
}
}

```

Podemos dizer que circulo é um ponto com um raio. A classe circulo indica
que está herdando características da classe ponto por meio da declaração extends.
Dessa forma, os atributos x e y também fazem parte da classe circulo, assim
como os métodos set e get daquela classe.
Os membros private da classe PONTO não podem ser acessados direta-
mente pela classe circulo. Dessa forma, x e y são obtidos ou alterados apenas
por meio das funções de acesso get e set, respectivamente.

O construtor da classe circulo recebe 3 parâmetros, sendo dois deles refe-
rentes a PONTO. Assim, o construtor da classe circulo deve acionar – por intermé-
dio da chamada de super – o construtor da classe PONTO. A classe PONTO é a
classe base, também chamada superclasse. Por isso o nome super. A classe base
deve ser acionada e finalizada antes da classe derivada. Em uma analogia com
a construção civil, a classe base seria equivalente ao alicerce de uma obra e a
classe derivada, as paredes. Não se pode construir as paredes sem o alicerce. A
chamada da classe base acontece, como informado, por meio do comando super.
Os parâmetros a e b recebidos pelo construtor de circulo são passados para o
construtor PONTO a partir da chamada super(a,b). Uma das funções de super
está, então, decifrada. Outra função de super é acessar um método da classe
base, o que é demonstrado no método imprimir. Lá, o método imprimir de PONTO
é acionado e em seguida o raio é impresso. Isso evita que tenhamos que reescrever
o código da impressão de ponto. Isso é especialmente importante se a impressão
de ponto obedecer a um formato preestabelecido.

Deve-se observar que em uma classe derivada o comando super deve ser
sempre o primeiro a ser executado. Se isso não acontecer, o construtor default da
classe base será acionado automaticamente. É importante que ele exista.

Em Java existe uma anotação (@Override) que permite que programadores
assinalem a intenção de sobrescrever em uma classe derivada um método da
classe base. Alguns compiladores utilizam tal anotação para alertar o programa-
dor quando uma alteração na assinatura de um método é efetuada e não repli-
cada nos métodos das classes relacionadas (base ou derivada). No código em
questão, o método imprimir da classe circulo está escondendo o método imprimir
da classe PONTO. Anotar no código que essa é a verdadeira intenção pode evi-
tar problemas futuros, no caso de uma mudança de nome, de tipo de retorno ou
mesmo de número de parâmetros em um dos métodos.

```
circulo c = new circulo(10,10,2);
c.imprimir();
```

Como mencionado, o método imprimir acionado é o da classe circulo. O mé-
todo imprimir da classe base está escondido. Na verdade, ele é acionado dentro
do método imprimir da classe circulo por meio da chamada super.imprimir().

Outra palavra-chave em Java que tem relação com herança é a palavra
FINAL. Ela pode ser usada tanto antes de nomes de métodos como antes de
nomes de classes. Se um método chamado X da classe base é precedido da pa-
lavra final, então tal método não poderá ser sobreposto na classe derivada.
Se uma classe é definida como final, então tal classe não poderá ser derivada.

#### Polimorfismo

O termo “polimorfismo” tem suas origens no idioma grego e significa várias
(poli) formas (morfos). O polimorfismo universal pode ser considerado o polimorfismo verdadeiro,
enquanto o polimorfismo ad-hoc normalmente é considerado polimorfismo apa-
rente ou de aparência. O polimorfismo ad-hoc pode, ainda, ser subdividido em 2
outros tipos: de sobrecarga e de coerção. Faz sentido entender sobrecarga como uma forma de poli-
morfismo, visto que um mesmo método pode assumir várias formas dependendo
da quantidade e do tipo de parâmetros passados. Coerção permite que um argu-
mento seja convertido para o tipo esperado por uma função, evitando assim um
erro de tipo. Um exemplo bem simples seria o do operador de adição, definido
para realizar a soma de 2 números reais. Se um dos operandos for inteiro, então
ele será forçado a se tornar real.

O polimorfismo universal, como já mencionado, é considerado o verdadeiro
polimorfismo. Ele é subdividido em 2 outras categorias: paramétrico e de inclusão.
O polimorfismo paramétrico é aquele que a partir de uma única definição de um
método ou de atributo pode trabalhar de forma genérica com qualquer tipo. O
polimorfismo de inclusão está associado com herança. Toda classe derivada (ou
subclasse) pode ser usada no contexto da classe base (ou superclasse). 

##### Polimorfismo paramétrico

