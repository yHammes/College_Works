package model;

import services.AttackerService;
import services.CreatorService;

import java.util.*;

public class Board {

    public Cell[][] grid;
    public String[] columns = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    public int gameState = 0;
    public int remaining_attempts = 30;

    public Ship currentShip;
    public Map<String, List<Ship>> shipMap = new HashMap<>();

    public Board() {
        grid = new Cell[10][10];

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                grid[row][col] = new Cell();
            }
        }

        createShips();
    }

    public String sendMessage() {
        if (gameState == -1) return "";
        return switch (gameState) {
            case 0 -> "Select a ship (" + getShipsLeft() + "): ";
            case 1 -> "Enter a position (A0 to J9): ";
            case 2 -> "Enter a position to attack (A0 to J9) (" + remaining_attempts + " chances).";
            default -> "Error";
        };
    }

    public String receiveInput(String input) {
        if (gameState == -1) return "";
        CreatorService creatorService = new CreatorService(this);
        AttackerService attackerService = new AttackerService(this);
        return switch (gameState) {
            case 0 -> creatorService.selectShip(input);
            case 1 -> creatorService.posicionarNavio(input);
            case 2 -> attackerService.realizarAtaque(input);
            default -> "ERROR";
        };
    }

    public Cell getCell(int row, int col) {
        if (col >= grid[0].length || row >= grid.length) return null;
        return grid[row][col];
    }

    private String getShipsLeft() {
        StringBuilder sb = new StringBuilder();

        for (var entry : shipMap.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                sb.append(entry.getKey()).append(" - ").append(entry.getValue().size()).append("x, ");
            }
        }

        if (sb.length() > 2) sb.setLength(sb.length() - 2);
        return sb.toString();
    }

    public void createShips() {
        shipMap.put("carrier", new ArrayList<>(List.of(new Ship(4))));
        shipMap.put("destroyer", new ArrayList<>(List.of(new Ship(3))));
        shipMap.put("sub", new ArrayList<>(Arrays.asList(new Ship(2), new Ship(2), new Ship(2))));
        shipMap.put("boat", new ArrayList<>(Arrays.asList(new Ship(1), new Ship(1), new Ship(1))));
    }

    public String showBoard() {
        StringBuilder sb = new StringBuilder("   ");

        for (int col = 0; col < 10; col++) sb.append(columns[col]).append("  ");

        sb.append("\n");

        for (int row = 0; row < 10; row++) {
            sb.append(row).append("  ");
            for (int col = 0; col < 10; col++) {
                String cell = grid[row][col].toString();
                if (gameState == 2 && cell.equals("S")) {
                    cell = "~";
                }
                sb.append(cell).append("  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void endGame(String message) {
        gameState = -1;
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println(message);
    }
}
