import java.util.ArrayList;
import java.util.List;

/**
 * Created by CNcgu on 8/11/15.
 */
public class FactorsExercise {

    public List<Integer> generate(int n){
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        int sqrtNum = (int) Math.sqrt(n);
        for(int i = 2; i <= sqrtNum; ++ i){
            if(n % i == 0){
                resultList.add(i);
            }
        }
        return resultList;
    }
}

