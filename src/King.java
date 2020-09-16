import java.awt.*;

public class King extends Figure {
    public King(Colour colour) {
        super(colour);
    }

    @Override
    public boolean canMove(Point currentLocation, Point targetLocation) {
        if(currentLocation.distance(targetLocation) == 1){
            return true;
        }else {
            return false;
        }
    }
}
