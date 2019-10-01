# klondike-jorge-garrido 

Mejoras realizadas a partir de la versión del Klondike: 
https://github.com/iraticasi/klondike/tree/mvp.pm+doubleDispatching

- Clase perezosa: Waste - Se elimina
- Clase abstracta sin metodos abstractos, se elimina. Se elimina clase ```CardStack```. ```Fundation```, ```Stock``` y ```Pile``` heredan directamente de ```Stack<Card>``` 
- Mal nombrado de metodos: Renombrados metodo ```writeln()``` por ```write()``` en las clases ```CardStackView```, ```GameView``` y ```PileView```  
- Nombrado: Constantes enteras en llamadas a ```ClosedInterval```
- YAGNI: Eliminamos clases PileReader y SuitReader...