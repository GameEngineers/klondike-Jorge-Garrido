package klondike.controllers;

public interface OperationControllerVisitor {

    void visit(ResumeController resumeController);

    void visit(StartController startController);
}
