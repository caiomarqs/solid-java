# Observações

Esse principo diz a respeito a herança, fala que os filhos não podem aplicar regras mais restritivas que os pais, as classes que herdam não podem restringir os atributos/parametros da classe pai, pois isso afeta diretamente os clientes que consomem essas classe, pois podem parar de rodar quando chegar nessas restrições. EM RESUMO -> Não podem afroxar uma pos condição e não pode afroxar 

Esse tipo de ação é chamada de composição pois passamos a manipula os dados dessas classes em comum a partir de instancia, assim o que restringir ou afroxar n afeta a outra classe

Ter o bom senso de quando usar herança e quando usar composição, o filho altera o atributo do pai? se sim use composição 

S.O.L.I.D ->  L: Liskov Substitutive Principle

#### Problemas da Herança

**c**
Pois as classe que usam a herança, eventualmente podem alterar os atributos da classe herdada, assim podendo afetar outra classe que instanciam essa classe pai.

**a**
Porque para se fazer bom uso de herança, o desenvolvedor deve pensar em cada método que a classe filha herdou e sobrescreveu, e lembrar que as pré-condições não podem ser apertadas, e as pós-condições não podem serem afrouxadas.
Isso não é tão simples, e requer muito raciocínio do desenvolvedor, sempre que for reescrever um comportamento.

#### Alternativa para herança

**c**
A alternativa para isso seria o uso de composição, a composição permite o uso de outra classe a partir da instancia e não da herança assim protege a alteração dos atributo/parametros

**a**
Você pode fazer uso de composição para reaproveitar comportamentos. Diferente da herança, ao compor um objeto, você não precisa se preocupar com as pré e pós condições.
No entanto, ao fazer uso de herança, você ganha o uso de polimorfismo. Quando bem usada, a herança também é uma excelente opção.