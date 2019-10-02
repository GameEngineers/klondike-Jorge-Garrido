# klondike-jorge-garrido 

Mejoras realizadas a partir de la versión del Klondike: 
https://github.com/iraticasi/klondike/tree/mvp.pm+doubleDispatching

- Clase perezosa: Waste - Se elimina
- Clase abstracta sin metodos abstractos, se elimina. Se elimina clase ```CardStack```. ```Fundation```, ```Stock``` y ```Pile``` heredan directamente de ```Stack<Card>``` 
- Mal nombrado de métodos: Renombrados método ```writeln()``` por ```write()``` en las clases ```CardStackView```, ```GameView``` y ```PileView```  
- Nombrado: Constantes enteras en llamadas a ```ClosedInterval```
- YAGNI: Eliminamos clases PileReader y SuitReader...
- Clase abstracta View pasa a ser una Interface, Mejoramos la extension de la aplicación
- Se cambia PlayMenu por MenuBuilder, se incluye interface, y se construyen las opciones de menú con este.
SIN HACER:
- Principio de única responsabilidad: Los contraladores no controlan el estado del juego lo hace Game, cambiamos State a Game.
- Separación de asuntos, prinicipo de única responsabilidad: Creamos un controller para cada acción del menu, MenuController ahora es abstracta.
