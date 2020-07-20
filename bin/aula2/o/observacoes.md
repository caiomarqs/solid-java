# Observações

O solid vem para desacoplar as funcinalidade de um ponto central, essa estrategia tende a ter acoplamentos estaveis, pois quando fizermos um acoplamento estavel aquele acoplamento tende a mudar o menos possivel.

A implementação de um observer notifica cada classe que executa uma ação no meu sistema, assim é possivel ter um acoplamento a uma interface que gerencia as classe a baixo.

S.O.L.I.D -> O: Observer

#### Periculosidade de acoplamentos

**c**
Pois uma única alteração de uma ponto onde há muitos acoplamentos pode afetar os outros acoplamentos. 

**a**
O problema do acoplamento é que, a partir do momento que uma classe A depende de uma classe B, qualquer mudança em B pode impactar A. Ou seja, quanto mais dependermos de outras classes, mais chances temos de uma mudança na dependência afetar a classe dependente. E, como sabemos, na prática, temos classes que mudam com muita frequência.


#### classe estável

**c**
Classes estáveis, são as classe que reúnem a características comum acima dos acoplamentos, se tornando uma forma fixa e quando alterada afeta os seus acoplamentos, fazendo que sua existência seja pensada

**a**
Classes estáveis são aquelas que tendem a mudar muito pouco. A vantagem de classes como essas é que são ótimas classes para se depender, já que elas não propagarão mudança para as classes dependentes.
Classes estáveis são aquelas que geralmente já são dependidas por muitas outras classes do sistema. Um bom exemplo disso são interfaces, pois elas geralmente possuem muitas implementações, e aí isso faz com que o desenvolvedor pense melhor antes de sair mudando a interface.

#### estrátegia para resover o problemas de acoplamentos

**c**
Programar orientado a interface é um bom exemplo para diminuirmos os problemas de acoplamentos, tendo em vista que interfaces são classes que tendem a mudar pouco.

**a**
A ideia é refatorar as classes para elas, quando necessitem de uma dependência, dependam de classes estáveis. Assim, a classe estará segura em relação a propagação de mudanças. É por isso que falamos muito sobre a ideia de "programar para interfaces", afinal, interfaces, além de nos possibilitar o uso de polimorfismo, ainda são estáveis.