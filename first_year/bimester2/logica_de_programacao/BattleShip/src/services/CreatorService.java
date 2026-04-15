package services;

import model.Board;
import model.Cell;
import model.Ship;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreatorService {
    private Board board;

    public CreatorService(Board board) {
        this.board = board;
    }

    public String selectShip(String input) {
        List<Ship> selected = board.shipMap.get(input);

        if (selected == null) return "[ERROR] Invalid ship!";
        if (selected.isEmpty()) return "[ERROR] This ship is not available!";

        board.currentShip = selected.getFirst();
        selected.removeFirst();

        board.gameState = 1;
        return "Boat selected! (Size: " + board.currentShip.getSize() + ")";
    }

    public String posicionarNavio(String input) {
        input = input.toLowerCase();
        if (!input.matches("^[a-j][0-9]$")) return "[ERROR] Invalid position. Use A0, B5, J9...";

        String direction = this.getDirection();
        int col = Arrays.asList(board.columns).indexOf(input.substring(0, 1));
        int row = Integer.parseInt(input.substring(1, 2));

        if (validatePosition(col, row, direction, board.currentShip.getSize())) {
            putShip(col, row, direction, board.currentShip.getSize());

            if (noShipsRemaining()) {
                board.gameState = 2;
                return "Ship successfully positioned!";

            }
            board.gameState = 0;
            return "Ship successfully positioned!";
        } else {
            return "[ERROR] Position is not valid!";
        }
    }

    private void putShip(int col, int row, String dir, int size) {
        for (int i = 0; i < size; i++) {
            int r = row + (dir.equals("v") || dir.equals("d") ? i : 0);
            int c = col + (dir.equals("h") || dir.equals("d") ? i : 0);
            board.getCell(r, c).setState(2);
        }
    }

    private boolean validatePosition(int col, int row, String dir, int size) {
        for (int i = 0; i < size; i++) {
            int r = row + (dir.equals("v") || dir.equals("d") ? i : 0);
            int c = col + (dir.equals("h") || dir.equals("d") ? i : 0);
            Cell cell = board.getCell(r, c);
            if (cell == null || cell.state != 0) return false;
        }
        return true;
    }

    public String getDirection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Choose direction (H, V, D): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (!input.equals("h") && !input.equals("v") && !input.equals("d")) {
                System.out.println("[ERROR] Invalid direction. Use H, V, or D.");
            } else {
                return input;
            }
        }
    }

    public boolean noShipsRemaining() {
        for (List<Ship> ships : board.shipMap.values()) {
            if (!ships.isEmpty()) return false;
        }
        return true;
    }
}
