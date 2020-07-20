# Observações

A lei de demiter fala sobre a responsabilidades das classes e o encapsulamento da implementações, a perguntar principal diz: "Você sabe como certo comportamento funciona?", se sim, está mal encapsulado, pois o unico responsavel por saber de como a acão funciona é o dono da ação.

#### Encapsulamento

**c**
Encapsulamento, é quando se isola um comportamento, objeto ou variavel, dando acesso externo ao mesmos somente o que se deseja ou que é controlado.

**a**
Encapsular é esconder os detalhes da implementação dentro da classe. Dessa forma, as classes que farão uso dela, não saberão como ela funciona internamente. A vantagem disso é que conseguimos depois facilmente alterar a implementação, sem que ela impacte nas classes dependentes.

#### Indentificando o mal encapsulamento

**c**
Quando em um objeto que não é o dono da ação "sabe" de mais sobre a ação do outro objeto.

**a**
Uma alternativa para isso é criar um trecho de código (seja uma nova classe, ou mesmo um teste automatizado) e fazer uso da classe. Nesse código, você deverá o tempo todo se fazer a pergunta: "Consigo saber COMO a classe está implementando essa regra de negócio?". Se a resposta for sim, então aquele comportamento não está bem encapsulado.


#### Lei de Demeter

**c**
A lei de demter diz a respeito de ao encapsulamento dos métodos,  ele limita o conhecimento muito intimo de outras classe a determinados comportamentos.

**a**
A Lei de Demeter, de maneira simples, diz para que você evite ao máximo fazer expressões como a.getB().getC().getD().acao(). O problema dessa cadeia, é que a classe que contém essa expressão, conhece muito sobre o comportamento da classe A, depois da classe B, até D. Se alguma delas mudar, a mudança será propagada para muitos lugares.
Diminuir a quantidade de invocações como essas ajuda você a encapsular melhor o comportamento e o funcionamento interno das classes.