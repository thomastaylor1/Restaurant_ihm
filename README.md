# Table interactive avec livestream des cuisines

## Fonctionnalités implémentées et interface
Le prototype se présente sous la forme d'une table dont les 4 coins sont indépendants. On peut consulter le menu en appuyant sur le bouton "Accéder au menu" qui permet de naviguer parmi les entrées, plats et desserts à l'aide des boutons "Voir". Chaque item du menu contient une photo, les ingrédients qu'il contient ainsi que le temps estimé de préparation. Des boutons de retour sont aussi présents pour faciliter la navigation.
Les 4 utilisateurs peuvent ouvrir la page du livestream des cuisines en appuyant sur le bouton "Accéder au livestream". Ce bouton transforme la table en une diffusion en plein écran d'un livestream YouTube.

## Organisation du code

La MainActivity contient 4 Fragments qui permettent d'avoir un affichage des menus en simultané. Le bouton Accéder au menu lance un FragmentMenu qui contient les boutons "Voir". Les boutons "Voir" lancent des FragmentPlat. La StreamActivity peut être lancée par les 4 boutons "Accéder au livestream" sur l'écran d'accueil.
