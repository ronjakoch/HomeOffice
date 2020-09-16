import java.awt.*;
import java.util.Scanner;

public class Game  {

    private ChessBoard chessBoard = new ChessBoard();

    private Player playerWhite = new Player("player1");

    private Player playerBlack = new Player("player2");

    public Point currentLocation;
    public Point targetLocation;

    //Constructor
    public Game(ChessBoard chessBoard, Player playerWhite, Player playerBlack) {
        this.chessBoard = chessBoard;
        this.playerWhite = playerWhite;
        this.playerBlack = playerBlack;
    }


    //Methods
    public void askForMove(){
        //Ask for current position
        Scanner scanCl = new Scanner(System.in);
        System.out.println("What's the current X-position of the figure you want to move?");
        int xCl = scanCl.nextInt();
        System.out.println("What's the current Y-position of the figure you want to move?");
        int yCl = scanCl.nextInt();

        currentLocation.setLocation(xCl, yCl);

        //Ask for target position
        Scanner scanTl = new Scanner(System.in);
        System.out.println("What's the target X-position of the figure you want to move?");
        int xTl = scanTl.nextInt();
        System.out.println("What's the target Y-position of the figure you want to move?");
        int yTl = scanTl.nextInt();

        targetLocation.setLocation(xTl, yTl);
    }

    public void updatePosition(){
        ChessBoard cb = new ChessBoard();




    }




    //Getters
    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public Player getPlayerWhite() {
        return playerWhite;
    }

    public Player getPlayerBlack() {
        return playerBlack;
    }
}
