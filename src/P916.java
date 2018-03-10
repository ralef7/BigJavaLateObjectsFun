import java.util.ArrayList;

public class P916{

    public static void main(String[] args){
        ArrayList<Object> strings = new ArrayList<>();
        ShortWordFilter shortWordFilter = new ShortWordFilter();
        for(String arg : args){
            strings.add(arg);
        }
        ArrayList filteredWords = collectAll(strings, shortWordFilter);
        for(Object filteredWord : filteredWords){
            System.out.println(filteredWord);
        }
    }

    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f){
        ArrayList<Object> myFilteredObjects = new ArrayList<Object>();
        for(Object obj: objects){
            if (f.accept(obj)){
                myFilteredObjects.add(obj);
            }
        }
        return myFilteredObjects;
    }
}
