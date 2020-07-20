# Observações

Existe uma classe para cada função (para cada regra de negócio).

Passa a regra de nogocio ao enum, assim cada enum obriga receber um instancia de uma regra que implenta o contrato entre as regras de nogcio.

S.O.L.I.D -> S: single of responsability

#### Classe Coesa

**c**
Uma classe coesa é aquela que tem poucas ou uma única responsabilidade, de forma que ela seja editada menos possível depois de ser implementada.
**a**
Uma classe coesa é aquela que contém apenas uma única responsabilidade. Ou seja, ela toma conta de apenas um conceito dentro do sistema.
Classes coesas tendem a ser menores, e por consequência, mais fáceis de serem lidas e mantidas. Elas também tendem a ser mais reutilizáveis, afinal são mais fáceis.

#### Classe não coesa

**c**
A classe que tende sempre crescer com a implementação de uma nova função do sistema aumentando a complexidade de desenvolvimento abrindo chances de erros relacionados a implementações.

**a**
Classes que não são coesas geralmente possuem muitos comportamentos (métodos). Além disso, elas também tem a tendência de crescer pra sempre, ou seja, o tempo inteiro o desenvolvedor tem que por a mão para escrever mais código.

#### Refatorar class não coesa

**c**
Aumentando a granularidade da classe, desacoplando as responsabilidades de e migrando isso para classe coesas. Definindo uma "interface"/"contrato" que garante que certa estrategia de implementação seja feita ao desenvolvimento das classe coesas.

**a**
Uma classe não coesa contém muitas diferentes responsabilidades. A ideia é então separar essas responsabilidades em classes diferentes. Como no caso do vídeo, onde separamos cada regra de cálculo em um lugar separado. Repare também que a classe Funcionario também é coesa, já que ela cuida apenas das responsabilidades e comportamentos de um funcionário.

#### SRP

**c**
É quando se dá uma única responsabilidade para um classe, e ela passa ter um único motivo para ser alterada.

**a**
É um dos princípios SOLID, que o nome já diz, a ideia é ter uma única responsabilidade por classe. Ou seja, coesão.


#### ISP -> Princípio de Segregação de Interfaces

**c**
A vantagem seria a mesma em relação as classe com uma única responsabilidade, pois não precisaríamos aumentar a interface toda vez que aumentarmos as funções nela e sair replicando nas classe que a implementarão.

**a**
Novamente, é propagação de mudanças. Se a interface mudar, a mudança tende a ser propagada em menos pontos. Lembre-se que a nossa ideia ao longo desse curso, é diminuir ao máximo a quantidade de pontos de mudança.
Por curiosidade, esse princípio faz mais sentido ainda em linguagens mais antigas como C++. Ao mudar uma interface, você é obrigado a recompilar e redeployar todo o código. Em sistemas grandes, isso pode ser bastante problemático. Esse princípio nasceu nessa época. Hoje, esse problema de deploy é menor, mas ainda assim o problema de propagação de mudanças é importante, e deve ser resolvido.