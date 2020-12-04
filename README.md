
# Station Application

Codé par :

INNOURI Ayoub ;
LOUAHEM Mehdi 


## 📝 Description

URL des données : [https://www.data.gouv.fr/fr/datasets/stations-et-gares-de-metro-rer-et-tramway-de-la-region-ile-de-france/]

Ces données sont issues du crowdsourcing effectué par les contributeurs au projet OpenStreetMap et sont sous licence ODbL et la mention d'attribution doit être "© les contributeurs d'OpenStreetMap sous licence ODbL" conformément à http://osm.org/copyright

Lien vers le sujet : https://docs.google.com/presentation/d/1wyWzQSyv0dB8Eqy2a58zaqOFhtswLRDTXtxfKQXno8Y/edit#slide=id.g537e84c31e_0_69

## But de projet :
Le but du projet est de réaliser une application permettant de visualiser une série de données OpenData
Les données devront être récupérées sur un serveur distant et affichées dans une liste et sur une carte
Un clique sur un élément de la liste ou sur un marker de la carte permet d’accéder à un écran présentant le détail de l’élément
Un écran présentera des informations générales sur les données récupérées.7

## Exigences :
Format des données OpenData :
    Format Json
    Avec un champ correspondant à l’url d’une image
    Avec un champ correspondant à une position
Application composée au minimum de 2 Fragment et 2 Activity
Une Actionbar sera présente et permettra de rafraîchir les données récupérées et affichées

## Bonus:
Amélioration de l’expérience utilisateur :
    Mise en place d’un système de recherche/filtre sur la liste affichée

Enrichissements techniques :
    Mise en place d’une base de données locale pour afficher la liste d’élément en mode hors connexion
    Utilisation de LiveData ou d’Observable pour la récupération de données dans la BDD




