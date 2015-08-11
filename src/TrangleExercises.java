/**
 * Created by CNcgu on 8/11/15.
 */
public class TrangleExercises {

    public String drawOneAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(int n) {
        return drawAserisks(n,true,false);
    }

    public String drawVerticalLine(int n) {
        return drawAserisks(n,false,false);
    }

    public String drawRightTriangle(int n) {
        return drawAserisks(n,false,true);
    }

    private String drawAserisks(int n,boolean isHorizontal,boolean isRightTriangle) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 1; i <= n; ++ i){
            if(isRightTriangle){
                stringBuffer.append(drawHorizontalLine(i));
            }else{
                stringBuffer.append(drawOneAsterisk());
            }
            if(!isHorizontal){
                stringBuffer.append("\n");
            }
        }

        return stringBuffer.toString();

    }
}

