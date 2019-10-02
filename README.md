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
- Metodo plantilla en OptionCommand, aplicado con readFromPile(..) y readSuit()