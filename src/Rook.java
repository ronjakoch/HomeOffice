import java.awt.*;
import java.util.ArrayList;

public class Rook extends Figure {

    public Rook(Colour colour) {
        super(colour);
    }

    @Override
    public boolean canMove(Point currentLocation, Point targetLocation) {
        if(currentLocation.getX() == targetLocation.getX() || currentLocation.getY() == targetLocation.getY()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public ArrayList<Point> movingPath(Point currentLocation, Point targetLocation) {
        ArrayList<Point> movingPath = new ArrayList<Point>();
        int counter;
        if (currentLocation.x == targetLocation.x) {
            counter = Math.abs(targetLocation.y - currentLocation.y);
            for (int i = 1; i <= counter; i++) {
                movingPath.add(new Point(currentLocation.x, currentLocation.y +i));
            }
        } else if (currentLocation.y == targetLocation.y) {
            counter = Math.abs(targetLocation.x - currentLocation.x);
            for (int i = 1; i <= counter; i++) {
                movingPath.add(new Point(currentLocation.x, currentLocation.y +i));
            }
        }
        if (movingPath.size() != 0){
            movingPath.remove(movingPath.size()-1);
        }

        return movingPath;
    }
}
