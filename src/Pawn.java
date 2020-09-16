import java.awt.*;
import java.util.ArrayList;

public class Pawn extends Figure{
    public Pawn(Colour colour) {
        super(colour);
    }

    private boolean canWalkTwoSteps = true;

    @Override
    public boolean canMove(Point currentLocation, Point targetLocation) {

        if(currentLocation.distance(targetLocation) == 2){
            if(canWalkTwoSteps == true){
                canWalkTwoSteps = false;
                return true;
            }else {
                return false;
            }
        }else if(currentLocation.distance(targetLocation) == 1){
            canWalkTwoSteps = false;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ArrayList<Point> movingPath(Point currentLocation, Point targetLocation) {
        return null;
    }

}
