# Observações

O primeiro conceito diz respeito ao fato que as classe devem ser abertas e fechadas, abertas a extenções, sendo possivel mudar o comportamento(execução) da classe de forma facil, e deve ser fechada a alterações, sendo uma classe coesa não dando abertura para novas implementações(responsabilidades).

O segundo conceito é sobre a inverção da dependencia de classes deixando elas dependetes a abstrações sempre, pois elas não tem implementações e as classes sim assim sendo possivel atribuir novas implentaçẽos a essas abstrações.

S.O.L.I.D -> Open Closed & Dependency Inversion 


#### OCP

**c**
O OCP, ajuda pois deixa as classe abertas para novos tipos de execuções e fechadas a alterações constantes em suas implmentações.

**a**
O OCP diz para escrevermos classes que sejam facilmente extensíveis (ou seja, abertas pra extensão). Dessa forma, mudar o comportamento da classe atual é fácil: basta passar outras implementações concretas das abstrações que ela depende.
Classes abertas para extensão, mas fechadas para modificação, também são mais coesas.

#### DIP

**c**
A vantagem é que a suas abstrações tentem a não serem alteradas e as implementações serem independentizes uma das outras assim dando flexibilidade para quem executa essa implementações caso queira muda de implementação rapidamente. 

**a**
O DIP nos diz para sempre dependermos de módulos que sejam mais estáveis que o módulo corrente. Abstrações devem depender de abstrações, e implementação deve depender de abstração.
Com isso, diminuímos o risco do acoplamento, afinal abstrações são estáveis, e tendem a não mudar frequentemente, diminuindo a propagação de problemas.

#### OCP e DIP

**c**
Se relacionam quando há abstrações estáveis para as implementações assim garantido o DIP(com as abstrações de implementações), e deixando as classes abertas a novos tipos de comportamentos.

**a**
Ao pensar em classes abertas, o programador precisa pensar em abstrações. Afinal, é por meio delas que ele vai conseguir estender o comportamento.
Ao pensar em abstrações, idealmente o programador também pensa na estabilidade de cada uma dessas abstrações. Afinal, ele precisa gerenciar o problema do acoplamento.