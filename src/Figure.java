import java.awt.*;
import java.util.ArrayList;

public abstract class Figure {

    protected Colour colour;

    public boolean canMove(Point currentLocation, Point targetLocation){
        return false;
    }

    public abstract ArrayList<Point> movingPath(Point currentLocation, Point targetLocation);





    //Constructor

    public Figure(Colour colour) {
        this.colour = colour;
    }
}
