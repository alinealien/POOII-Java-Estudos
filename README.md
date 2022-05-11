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

o resultado da chamada da “função”
(vamos, por enquanto, chamar showInputDialog de função) será atribuído a uma
cadeia de caracteres cujo nome é x.

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

Para converter o valor lido por JOptionPane.showInputDialog em float é pre-
ciso chamar a “função”. de
conversão de tipo para converter de String para float. O valor convertido é ar-
mazenado em nota

**Em Java, para se declarar um vetor de inteiros chamado dias_do_mes, precisamos fazer as seguintes declarações:**

```
int dias_do_mes[ ];//VETOR
dias_do_mes = new int[12];
```

A primeira linha apenas indica ao compilador que haverá um vetor. A variável é automaticamente ajustada para null quando o primeiro comando termina. Somente após a alocação (por meio do comando new int seguido do tamanho do vetor) é que o vetor passa a existir. Em Java, não é preciso preocupar-se com a devolução da memória alocada para o sistema operacional. Isso é automaticamente feito pelo sistema interno de coleta de lixo. Uma vantagem da linguagem Java é, portanto, o controle efetivo da memória utilizada.