# projet12Batch

![forthebadge](https://forthebadge.com/images/badges/gluten-free.svg)

Avec comme objectif de creer un envoie de mail centralisé et normalisé l'idée d'une application est née.

## Pour commencer

Batch de relance automatique de la méthode neccessaire a l'envoie de mail

### Pré-requis

Ce qu'il est requis pour commencer avec votre projet...

- Java
- Spring Boot
- Base de donnée PostgresSql



### Installation
Pour installer PostGres vous pouvez vous referer au guide : https://www.veremes.com/installation-postgresql-windows.
Une fois installé vous devrais ouvrir cmd.exe sous Windows et entrer ces informations.

1 - Creation d'une bdd et d'un utilisateur propriétaire de la bdd psql -U postgres -a -f données.sql.

Renseigner le mot de passe de l'utilisateur postgres (dans mon cas, c'est admin).

Ensuite Installer le serveur TomCat, un tutoriel est disponible : http://objis.com/tutoriel-tomcat-n1-installation-tomcat-8/

Déployer le fichier war

Il suffit de spécifier l’emplacement de votre fichier war de manière à l’uploader sur votre serveur tomcat qui le déploiera automatiquement. Depuis le manager tomcat, dans la zone de déploiement « WAR file to deploy » comme ci-dessous :

tomcat-manager2

– dans la zone «Select WAR file to upload» cliquer sur le bouton «Parcourir»;
– une fenêtre de sélection de fichier s’ouvre;
– sélectionner le fichier war à déployer;
– valider;
– enfin cliquer sur le bouton « Deploy» dans la page du manager.

Dans la zone « Message» du manager, il est indiqué la réussite ou l’échec du déploiement. Ceci est la manière la plus simple pour déployer un war sous tomcat.

Une autre manière de faire est de déposer le fichier war directement dans le dossier webapps du dossier d’installation de Tomcat. Tomcat déploiera automatiquement l’application issue du fichier war.

## Démarrage
 
 Une fois lancé le demarrage se fera automatiquement

## Fabriqué avec

- Java
- Spring Boot
- Base de donnée PostgresSql
- IntelliJ

## Auteurs

* **Yann CABERAS** _alias_ [yanncb](https://github.com/yanncb)




