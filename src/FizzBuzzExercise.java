/**
 * Created by CNcgu on 8/11/15.
 */
public class FizzBuzzExercise {
    public static String getIndexString(int i){
        if(i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        }
        if(i % 3 == 0){
            return "Fizz";
        }
        if(i % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(i);
    }
    public static void main(String[] args){
        for(int i = 1; i < 16; ++ i){
            System.out.println(getIndexString(i));
        }
    }
}
