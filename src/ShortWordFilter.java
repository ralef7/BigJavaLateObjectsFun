public class ShortWordFilter implements Filter {

    public boolean accept(Object candidate){
        String word = (String)candidate;
        if (word.length() >= 5){
            return false;
        }
        return true;
    }
}
