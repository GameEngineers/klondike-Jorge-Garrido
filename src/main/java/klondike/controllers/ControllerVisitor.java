package klondike.controllers;

public interface ControllerVisitor {

    void visit(StartController startController);

    void visit(ResumeController resumeController);

    void visit(MoveFromFoundationToPileController moveFromFoundationToPileController);

    void visit(MoveFromPileToFoundationController moveFromPileToFoundationController);

    void visit(MoveFromPileToPileController moveFromPileToPileController);

    void visit(MoveFromStockToWasteController moveFromStockToWasteController);

    void visit(MoveFromWasteToFoundationController moveFromWasteToFoundationController);

    void visit(MoveFromWasteToPileController moveFromWasteToPileController);

    void visit(MoveFromWasteToStockController moveFromWasteToStockController);

}

