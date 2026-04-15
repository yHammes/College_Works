import model.Board;

void main() {
    inicializarTabuleiro();
}

public static void inicializarTabuleiro() {
    Scanner scanner = new Scanner(System.in);
    Board board = new Board();
    exibirTabuleiro(board);

    while (true) {
        System.out.println(board.sendMessage());

        String input = scanner.nextLine().trim();

        String response = board.receiveInput(input.toLowerCase());
        if (board.gameState == -1) break;
        exibirTabuleiro(board);
        System.out.println(response);
    }
}

public static void exibirTabuleiro(Board board) {
    System.out.println("===== BATTLE SEA =====\n");
    System.out.println(board.showBoard());
}
