import java.awt.*;

public class Queen extends Figure {
    public Queen(Colour colour) {
        super(colour);
    }

    @Override
    public boolean canMove(Point currentLocation, Point targetLocation) {

        if(currentLocation.getX() - targetLocation.getX() == currentLocation.getY() - targetLocation.getY()){
            return true;
        }else if(currentLocation.distance(targetLocation) == 1){
            return true;
        }else if (currentLocation.getY() == targetLocation.getY() + 1 && currentLocation.getX() == targetLocation.getX() + 2){
            return true;
        }else if(currentLocation.getY() == targetLocation.getY() + 1 && currentLocation.getX() == targetLocation.getX() - 2){
            return true;
        }else if(currentLocation.getY() == targetLocation.getY() - 1 && currentLocation.getX() == targetLocation.getX() + 2){
            return true;
        }else if(currentLocation.getY() == targetLocation.getY() - 1 && currentLocation.getX() == targetLocation.getX() - 2){
            return true;
        }else if(currentLocation.getX() == targetLocation.getX() || currentLocation.getY() == targetLocation.getY()){
            return true;
        }else {
            return false;
        }
    }
}
