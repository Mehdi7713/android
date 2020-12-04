Station Application

Codé par :

INNOURI Ayoub ; LOUAHEM Mehdi
📝 Description

URL des données : [https://www.data.gouv.fr/fr/datasets/stations-et-gares-de-metro-rer-et-tramway-de-la-region-ile-de-france/]

Ces données sont issues du crowdsourcing effectué par les contributeurs au projet OpenStreetMap et sont sous licence ODbL et la mention d'attribution doit être "© les contributeurs d'OpenStreetMap sous licence ODbL" conformément à http://osm.org/copyright

Lien vers le sujet : https://docs.google.com/presentation/d/1wyWzQSyv0dB8Eqy2a58zaqOFhtswLRDTXtxfKQXno8Y/edit#slide=id.g537e84c31e_0_69
But de projet :

Le but du projet est de réaliser une application permettant de visualiser une série de données OpenData. Les données devront être récupérées sur un serveur distant et affichées dans une liste et sur une carte Un clique sur un élément de la liste ou sur un marker de la carte permet d’accéder à un écran présentant le détail de l’élément Un écran présentera des informations générales sur les données récupérées.
Exigences :

Format des données OpenData : Format Json Avec un champ correspondant à une position Application composée au minimum de 2 Fragment et 2 Activity Une Actionbar sera présente et permettra de rafraîchir les données récupérées et affichées.

Présentation du rendu
L'API est déployé sur Clever Cloud et disponible à l'adresse suivante : applicationstationidf-louaheminnouri.cleverapps.io
L'API est disponible dans la branche master du dossier Android/projet-nest.
Le fichier json est stocké dans le code de l'API.
Les Requêtes suivantes sont établies: 
Renvoyer la liste des noms et status favoris de chaque station.
Avoir des données supplémentaire d'après le nom d'une station.
Mise à jour du status favoris d'une gare désignée par son nom.
Envoie des données générales sur la source des données sur l'application.
L'application android est disponible dans le dossier AppLOUAHEMINNOURI.
Du coté de l'application nous avons réussi à afficher la liste des stations ainsi que la fonctionnalité d'affichage des données complémentaires lorsque l'on clique sur une station.
