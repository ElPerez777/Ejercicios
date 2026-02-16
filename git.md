## 1 Repositorio en Git y diferencia con un proyecto normal
Un repositorio es una carpeta del proyecto, mas un registro de cambios, ese registro permite ver versiones, volver atras, y trabajar en equipo  
Un proyecto normal es solo la carpeta con archivos, sin ese registro  
Dentro del repositorio existe una carpeta llamada .git, ahi Git guarda el historial

## 2 Tres areas principales de Git y para que sirve cada una
Working directory, es lo que ves y editas en tu computador  
Staging area o index, es una lista de cambios que si quieres guardar en el proximo commit  
Repository, es el historial local donde quedan guardados los commits

## 3 Como guarda Git los cambios por dentro, blob, tree, commit, tag
Blob, es el contenido de un archivo, solo el contenido, no el nombre  
Tree, es la estructura de carpetas y nombres, y a que contenido apuntan  
Commit, es una foto del proyecto en un momento, apunta al tree, y a commits anteriores  
Tag, es un nombre fijo que apunta a un commit, sirve para marcar versiones importantes

## 4 Como crear un commit y que guarda
Pasos comunes  
- miras el estado con git status  
- eliges que guardar con git add archivo, o git add .  
- guardas con git commit -m "mensaje"

Un commit guarda  
- el estado del proyecto, por medio de un tree  
- el commit anterior, o anteriores si es un merge  
- quien lo hizo y cuando  
- el mensaje  
- un identificador unico

## 5 Diferencia entre git pull y git fetch
git fetch, trae cambios del remoto, pero no mezcla nada en tu rama, tus archivos quedan igual, sirve para revisar primero  
git pull, trae y mezcla en tu rama actual, es mas rapido, pero puede generar conflictos si chocan cambios

## 6 Que es un branch, y como se mueven los punteros
Un branch es un nombre que apunta a un commit, no es una copia del proyecto  
Cuando haces un commit en esa rama, el puntero avanza al commit nuevo  
HEAD indica donde estas, normalmente apunta a la rama en la que trabajas

## 7 Como hacer un merge, y que conflictos aparecen, como resolverlos
Para mezclar cambios, te pones en la rama que recibe, luego haces merge  
- git switch main  
- git merge feature

Hay conflicto cuando Git no sabe unir cambios, por ejemplo  
- dos ramas tocaron la misma parte del mismo archivo  
- una rama borro un archivo y la otra lo cambio

Para resolver  
- abres el archivo marcado como conflicto  
- eliges que queda, o combinas a mano  
- guardas el archivo  
- marcas resuelto con git add archivo  
- terminas con git commit si hace falta

## 8 Como funciona staging con git add, y que pasa si lo omito
git add prepara cambios para el proximo commit  
git commit solo guarda lo que esta preparado  
Si no haces git add, el commit no tendra cambios, y Git te dira que no hay nada para guardar, tus cambios siguen en tu carpeta, no se borran

## 9 Que es .gitignore y como afecta el seguimiento
.gitignore le dice a Git que no siga ciertos archivos o carpetas  
Sirve para cosas locales, temporales, o que no deben subirse  
Si un archivo ya estaba siendo seguido, ponerlo en .gitignore no lo saca solo, para dejar de seguirlo se usa  
- git rm --cached archivo

Ejemplos comunes para ignorar  
- node-modules/  
- archivos .log  
- .env

## 10 Diferencia entre git commit --amend y un commit nuevo
git commit --amend cambia el ultimo commit, para agregar algo que faltaba, o corregir el mensaje  
En realidad crea un commit nuevo y reemplaza el anterior  
Un commit nuevo agrega otro paso en el historial, sin reemplazar nada  
Regla simple, usa amend si aun no lo compartiste con otras personas, si ya lo subiste, mejor un commit nuevo

## 11 Como usar git stash y cuando sirve
git stash guarda tus cambios sin commit, y deja tu carpeta limpia por un rato  
Sirve cuando necesitas cambiar de rama, actualizar, o atender otra tarea, sin perder lo que llevas

Comandos utiles  
- guardar, git stash  
- ver lista, git stash list  
- recuperar y borrar de la lista, git stash pop  
- recuperar sin borrar, git stash apply  
- borrar uno, git stash drop

## 12 Formas de deshacer cambios, reset, revert, restore, checkout
Para deshacer cambios no guardados en un archivo  
- git restore archivo

Para sacar algo del staging, sin perder el cambio  
- git restore --staged archivo

git reset mueve la rama a otro commit, y segun la opcion cambia staging y archivos  
- git reset --soft COMMIT, mueve la rama, deja staging y archivos  
- git r:eset --mixed COMMIT, mueve la rama, limpia staging, deja archivos  
- git reset --hard COMMIT, mueve la rama, borra staging y archivos, cuidado

git revert no reescribe historia, crea un commit que revierte otro  
- git revert ID-DEL-COMMIT  
Es lo mas seguro cuando ya compartiste cambios

Nota, git checkout antes se usaba para varias cosas, hoy se prefiere git switch para cambiar de rama, y git restore para restaurar archivos

## 13 Remotos, origin y upstream, y manejo de forks
Un remoto es otra copia del repositorio, en un servidor  
origin suele ser tu repositorio, el que clonas  
upstream suele ser el repositorio original, cuando trabajas con un fork

Ver remotos  
- git remote -v

Agregar upstream  
- git remote add upstream URL

Traer cambios del original  
- git fetch upstream

Actualizar tu main con upstream  
- git switch main  
- git merge upstream/main

Enviar tu rama a tu fork  
- git push origin tu-rama

## 14 Como ver historial, git log, git diff, git show
Ver historial  
- git log  
- vista corta, git log --oneline --graph --decorate --all

Ver diferencias  
- cambios aun no preparados, git diff  
- cambios ya preparados, git diff --staged  
- entre commits, git diff COMMIT1 COMMIT2

Ver un commit en detalle  
- git show ID-DEL-COMMIT

Ver quien toco lineas  
- git blame archivo
