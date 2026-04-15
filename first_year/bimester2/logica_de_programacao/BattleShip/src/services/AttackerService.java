package services;

import model.Board;
import model.Cell;
import model.Ship;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AttackerService {
    private Board board;

    public AttackerService(Board board) {
        this.board = board;
    }

    public String realizarAtaque(String input) {
        if (!input.matches("^[a-j][0-9]$")) return "[ERROR] Invalid position. Use A0, B5, J9...";
        int col = Arrays.asList(board.columns).indexOf(input.substring(0, 1));
        int row = Integer.parseInt(input.substring(1, 2));

        Cell cell = board.getCell(row, col);

        return switch (cell.state) {
            case 0 -> {
                cell.setState(3);
                board.remaining_attempts -= 1;
                this.verificarFimDeJogo();
                yield "Miss!";
            }
            case 1 -> "You already fired here!";
            case 2 -> {
                cell.setState(1);
                board.remaining_attempts -= 1;
                this.verificarFimDeJogo();
                yield "Hit!";
            }
            case 3 -> "You already fired here!!";
            default -> "";
        };
    }

    public void verificarFimDeJogo() {
        if (board.remaining_attempts == 0) {
            board.endGame("The defending player wins!!");
        } else if (!this.hasShipsOnBoard()) {
            board.endGame("The attacking player wins!!");
        }
    }

    public boolean hasShipsOnBoard() {
        for (int row = 0; row < board.grid.length; row++) {
            for (int col = 0; col < board.grid[row].length; col++) {
                if (board.grid[row][col].state == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
