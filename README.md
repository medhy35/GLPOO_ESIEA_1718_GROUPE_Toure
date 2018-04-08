# Projet de Java - Eurodroo

[![N|Solid](http://www.tirage-euromillions.net/wp-content/uploads/2014/12/EuroMillions-Tarn-Gagnant.jpg)](http://www.icauda.com/files/genielogiciel/glpoo_esiea_2017-2018.pdf)

Description du sujet

L’idée est d’utiliser les historiques des tirages, disponibles gratuitement sur le site de la fdj, pour faire des dessins. On peut par exemple dire que le boules correspondent à des formes (carrés, ronds, icones, etc.) et les étoiles à des rotations. On peut aussi dire que la première boule correspond à une forme et que les autres boules correspondent à des coordonnées ou des couleurs. Les possibilités ne manquent pas. On peut même combiner plusieurs tirages pour faire des dessins plus complexes.
Il faudra aussi afficher les tirages sous forme de tableau dans votre logiciel. Cela vous permettra de choisir un ou plusieurs tirages pour faire vos dessins. Et bien entendu, vous pouvez fabriquer ou générer vos propres tirages, ne serait-ce que pour les tests.

### Liste des membres du projet

* [Toure Mahamadoun Ibrahima] - (Scrum Master)
* [Thierry Leriche Dessirier] -  (Product Owner)
* [Falcou Julie] - (Proxy Product Owner)
* [VARATHARAJAH Iynthurisha] - (équipe de développement)
* [TCHUENBOU KOMGUEP Gabrielle Renée] - (équipe de développement)
* [CHAMOINRI Ifuja] - (équipe de développement)
* [DESRIVIERES Arnaud] - (équipe de développement)
* [FIRMIN Jacques-Olivier] -  (équipe de développement)


Lancement
--------

Télécharger le projet et l'ouvrir avec Eclipse veuillez l'executer avec maven pré installer sur eclipse 
ensuite suivre le guide present dans le Rapport de Projet 


Compiler
--------

Pour compiler, vous avez besoin de Maven.

`mvn package`

dans un terminal dans le répertoire source du projet.
Vous pouvez convertir le projet en projet eclipse avec

`mvn eclipse:eclipse`

Importez alors dans eclipse (Projet existant dans l'espace de travail)
Vous avez besoin de paramétrer une variable M2_REPO de build pour les dépendances (JUnit)

Allez dans la barre de menu, Window > Preferences
Dans la barre de coté. Java > Build Path > Classpath Variables.
Faite New.
Creer une variable qui s'appelle M2_REPO.
Donnez lui pour valeur le chemin des repo de maven.
Sous linux, il y a un dossier caché .m2 dans votre home et dedans il y a un dossier repository.
Donc un exemple de valeur correcte serai `/home/[user]/.m2/repository`
Aucune idée de la valeur correcte sous windows, je sais juste que le nom du repertoire est aussi repository.

Enfin, comme dirait Nedjar : `Un développeur n'ayant pas un Unix sur sa machine ne peut pas être raisonnablement considéré comme un vrai développeur.`
Vous pouvez alors ouvrir la classe qui contient le main et lancer le programme.

### Dependance maven

Ceci est la liste des dépendances utilisé pour le projet.

| Plugin | README |
| ------ | ------ |
| Maven | [https://maven.apache.org][maven] |
| Junit | [https://mvnrepository.com/artifact/junit/junit][junit] |
| Log4j | [https://mvnrepository.com/artifact/log4j/log4j][log4j] |


License
----

ESIEA 2017-2018 

   [Toure Mahamadoun Ibrahima]: <https://www.linkedin.com/in/mahamadoun-ibrahima-toure-98081b114/>
   [Thierry Leriche Dessirier]: <https://www.linkedin.com/in/thierryler/>
   [Falcou Julie]: <https://www.linkedin.com/in/julie-falcou-29b4b4140/>
   [VARATHARAJAH Iynthurisha]: <#>
   [TCHUENBOU KOMGUEP Gabrielle Renée]: <https://www.linkedin.com/in/gabrielle-renée-tchuenbou-komguep-423a6a89/>
   [CHAMOINRI Ifuja]: <https://www.linkedin.com/in/ifuja-chamoinri-771447154/>
   [DESRIVIERES Arnaud]: <#>
   [FIRMIN Jacques-Olivier]: <#>
   [FOGNO BOPDA'A Ulrich Ivanick]: <#>
   
   
   
   [maven]: <https://maven.apache.org>
   [junit]: <https://mvnrepository.com/artifact/junit/junit>
   [log4j]: <https://mvnrepository.com/artifact/log4j/log4j>
