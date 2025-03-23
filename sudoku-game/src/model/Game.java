package model;

public class Game {

    public void start() {
        Board board = new Board();
        board.generateBoard();
        board.displayBoard();
        Solver solver = new Solver();
        if (solver.solve(board)) {
            System.out.println("\nSolução encontrada:");
            board.displayBoard();
        } else
            System.out.println("\nSem solução possível para este tabuleiro.");
    }

}
