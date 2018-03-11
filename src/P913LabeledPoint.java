import java.awt.*;

public class P913LabeledPoint {
    private Point point;

    public P913LabeledPoint (Point point){
        this.point = point;
    }

    @Override
    public String toString(){
        return point.toString();
    }
}
