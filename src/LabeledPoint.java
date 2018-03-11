public class LabeledPoint {

    private int x;
    private int y;

    public LabeledPoint(int xCoord, int yCoord){
        this.x = xCoord;
        this.y = yCoord;
    }

    @Override
    public String toString(){
        return "X coord = " + x + " Y coord = " + y;
    }
}
