import java.awt.*;

public class Knight extends Figure{
    public Knight(Colour colour) {
        super(colour);
    }

    @Override
    public boolean canMove(Point currentLocation, Point targetLocation) {
        if (currentLocation.getY() == targetLocation.getY() + 1 && currentLocation.getX() == targetLocation.getX() + 2){
            return true;
        }else if(currentLocation.getY() == targetLocation.getY() + 1 && currentLocation.getX() == targetLocation.getX() - 2){
            return true;
        }else if(currentLocation.getY() == targetLocation.getY() - 1 && currentLocation.getX() == targetLocation.getX() + 2){
            return true;
        }else if(currentLocation.getY() == targetLocation.getY() - 1 && currentLocation.getX() == targetLocation.getX() - 2){
            return true;
        }else {
            return false;
        }
    }


}
