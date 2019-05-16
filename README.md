# Projet-5-DP-AbstractFatory

Dans ce projet nous avons utilisé le patron Frabrique qui permet de rassembler des méthodes communes à des familles d’objets différents dans une classe commune : la fabrique abstraite, afin d’éviter au client d’appeler des méthodes différentes (concrètes) par famille d’objets.
## Descrption
Dans notre cas pour impléter ce pattern, on fait intervenir  la règle générale:
 #### l'abstact factory: 
 representé par la classe AbstractFactory qui contient les interfaces pour les opérations communes de construction d’objets que sont : Oriental, Reine et TroisFromage
 #### La Concrete Factory :
 les concrètes factory de ce projet sont les classes : OrientalFactory, ReineFactory, TroisFromageFactory
 qui contiennent l'implémentation concrète de construction des objets donnés.
 #### Les Abstracts Products : 
qui sont lesz classes Oriental, Reine et TroisFromage déclarent les interfaces des produits 
#### Les concretes Products : 
qui sont OrieantalSN,OrieantalFR,OrieantalUS, ReineSN,ReineFR,ReineUS,TroisFromageSN,TroisFromageFR et TroisFromageUS, déclarent les produits à implémenter,
#### Un client : 
le client representé par la classe AbstractFactoryTest utilise uniquement les interfaces de l’abstract Factory pour implémenter les objets concrets.
