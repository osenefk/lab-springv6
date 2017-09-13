# lab-springv6
Ce projet est géré par Maven. 
Il mette en oeuvre d'une part l'injection de dependances via la specification CDI avec l'annotation @Inject.
Et d'autre part, l'utilisation de Spring JDBC pour créer rapidement votre couche d’accès aux données JDBC (DAO).
Et donc la mise en oeuvre de la source de données (DataSource) JDBC comme un bean Spring et l’injecter à l’exécution.

Les atouts de spring JDBC sont :

— Diminution de la taille du code, grâce à classes fournies par Spring. 
— Gestion des exceptions réalisée par Spring pour vou
Les annotations utilisés tels que @Name et @Inject sont dits standards.
L'application est repartie en trois couches à savoir :
- La couche persistence : contient les classes POJO
- La couche dao : contient les classes accés aux données (Interface + classe Implementant l'interface)
- La couche service : contient les classes implémentant la logique métier de l'application. 
La dependance entre la couche dao et la couche service est gérée CDI : Injection de l'interface dao via l'annotation @Inject
- Et la couche presentation : contient la classe principale pour l'execution du projet

