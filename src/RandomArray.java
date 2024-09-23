import java.util.InputMismatchException;
import java.util.Random;

public class RandomArray {
    private Random random = new Random();
    private final int[] array;
    public RandomArray(){
        array=new int[100];
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(0,100);
        }
    }
    public int display(int index) throws ArrayIndexOutOfBoundsException{
        try{
            return array[index];
        }catch(ArrayIndexOutOfBoundsException indexMissMatch){
            System.out.println(indexMissMatch);
            return 0;
        }
    }
}
