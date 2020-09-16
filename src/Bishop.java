import java.awt.*;

public class Bishop extends Figure {

    public Bishop(Colour colour) {
        super(colour);
    }

    @Override
    public boolean canMove(Point currentLocation, Point targetLocation) {

    if(Math.abs(currentLocation.getX() - targetLocation.getX()) == Math.abs(currentLocation.getY() - targetLocation.getY())){
        return true;
    }else {
        return false;
    }
    }
}
