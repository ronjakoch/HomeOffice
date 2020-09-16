import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ChessBoard {

    private Map<Point, Figure> mapOfactivePlayers;

    private boolean isAnyPointTaken(ArrayList<Point> movingPath){

        return false;
    }

    private boolean move(Point currentLocation, Point targetLocation){
        return false;
    }


    //Constructor
    public ChessBoard() {
        fillMap();
    }


    //Methods
    public void fillMap(){
        //Rook white
        mapOfactivePlayers.put(new Point(1,1), new Rook(Colour.WHITE));
        mapOfactivePlayers.put(new Point(8,1), new Rook(Colour.WHITE));
        //Rook black
        mapOfactivePlayers.put(new Point(8,8), new Rook(Colour.BLACK));
        mapOfactivePlayers.put(new Point(1,8), new Rook(Colour.BLACK));
        //Knight white
        mapOfactivePlayers.put(new Point(2,1), new Knight(Colour.WHITE));
        mapOfactivePlayers.put(new Point(7,1), new Knight(Colour.WHITE));
        //Knight black
        mapOfactivePlayers.put(new Point(2,8), new Knight(Colour.BLACK));
        mapOfactivePlayers.put(new Point(7,8), new Knight(Colour.BLACK));
        //Bishop white
        mapOfactivePlayers.put(new Point(3,1), new Bishop(Colour.WHITE));
        mapOfactivePlayers.put(new Point(6,1), new Bishop(Colour.WHITE));
        //Bishop Black
        mapOfactivePlayers.put(new Point(3,8), new Bishop(Colour.BLACK));
        mapOfactivePlayers.put(new Point(6,8), new Bishop(Colour.BLACK));
        //Queen white
        mapOfactivePlayers.put(new Point(4,1), new Queen(Colour.WHITE));
        //Queen black
        mapOfactivePlayers.put(new Point(4,8), new Queen(Colour.BLACK));
        //King white
        mapOfactivePlayers.put(new Point(5,1), new King(Colour.WHITE));
        //King black
        mapOfactivePlayers.put(new Point(5,8), new King(Colour.BLACK));
        //Pawn white
        mapOfactivePlayers.put(new Point(1,2), new Pawn(Colour.WHITE));
        mapOfactivePlayers.put(new Point(2,2), new Pawn(Colour.WHITE));
        mapOfactivePlayers.put(new Point(3,2), new Pawn(Colour.WHITE));
        mapOfactivePlayers.put(new Point(4,2), new Pawn(Colour.WHITE));
        mapOfactivePlayers.put(new Point(5,2), new Pawn(Colour.WHITE));
        mapOfactivePlayers.put(new Point(6,2), new Pawn(Colour.WHITE));
        mapOfactivePlayers.put(new Point(7,2), new Pawn(Colour.WHITE));
        mapOfactivePlayers.put(new Point(8,2), new Pawn(Colour.WHITE));
        //Pawn black
        mapOfactivePlayers.put(new Point(1,7), new Pawn(Colour.BLACK));
        mapOfactivePlayers.put(new Point(2,7), new Pawn(Colour.BLACK));
        mapOfactivePlayers.put(new Point(3,7), new Pawn(Colour.BLACK));
        mapOfactivePlayers.put(new Point(4,7), new Pawn(Colour.BLACK));
        mapOfactivePlayers.put(new Point(5,7), new Pawn(Colour.BLACK));
        mapOfactivePlayers.put(new Point(6,7), new Pawn(Colour.BLACK));
        mapOfactivePlayers.put(new Point(7,7), new Pawn(Colour.BLACK));
        mapOfactivePlayers.put(new Point(8,7), new Pawn(Colour.BLACK));
    }


    //Getters & Setters
    public Map<Point, Figure> getMapOfactivePlayers() {
        return mapOfactivePlayers;
    }

    public void setMapOfactivePlayers(Map<Point, Figure> mapOfactivePlayers) {
        this.mapOfactivePlayers = mapOfactivePlayers;
    }
}
