import java.util.ArrayList;
import java.util.Collections;

public class FindTheMissingNumber {

    public static void main(String[] args){
        ArrayList<Long> numbers = new ArrayList<>();
        for (int i = 0; i < 100 ; i++){
            numbers.add(i+1L);
        }

        numbers.remove(38);
        Collections.sort(numbers);
        System.out.println(getMissingNumber(numbers, 100));


    }

    public static long getMissingNumber(ArrayList<Long> nums, int length){
        if (nums.size() == length){
            return -1;
        }

        int counter = nums.size()-2;
        if (nums.get(nums.size()-1) != length){
            return length;
        }
        for (int i = 0; i<length/2; i++) {
            long num = nums.get(i);
            long highNum = nums.get(counter);
            if (num + highNum != length){
                if (highNum+num > length){
                    return num-1;
                }
                else {
                    return highNum + 1;
                }
            }
            counter -=1;
        }
        return length/2;
    }
}
