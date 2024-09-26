import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws MalformedURLException {
//            SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList();
//            singleLinkedList.add(10);
//            singleLinkedList.add(20);
//            singleLinkedList.add(230);
//            singleLinkedList.add(13);
//            System.out.println(singleLinkedList);
//        RandomArray randomArray=new RandomArray();
//        Scanner scanner=new Scanner(System.in);
//        int index=10;
//        while(index!=0){
//            System.out.println(randomArray.display(index));
//            index= scanner.nextInt();
//        }
//        try{
//            URL url=new URL("https://www.instagram.com/");
//            Scanner input= new Scanner(url.openStream());
//            while(input.hasNext()){
//                System.out.println(input.next());
//            }
//        }catch (MalformedURLException m){
//            System.out.println("Invalid URL");
//        }catch (IOException e){
//            System.out.println("Ni such file exists");
//        }
//        }
//        public void searchForInteger(int elem, SingleLinkedList<Integer> singleLinkedList) {
//            if (singleLinkedList.getHead() == null) {
//                System.out.println("Error");
//            }
//        Stacker stacker=new Stacker(10);
//        Stacker stacker1=new Stacker();
//        stacker.addToTop(10);
//        stacker.addToTop(20);
//        stacker.deleteFromTop();
//        System.out.println(stacker.getTop());
//        stacker.copyStack(stacker1);
//        System.out.println(stacker1.getTop());
        System.out.println(tribonacci(10));
        System.out.println(tribonacciFast(1));
    }
    public static int tribonacci(int n) {
        ArrayList<Integer> cache = new ArrayList<>(n+1);
        for(int i=0;i<=n+1;i++){
            cache.add(i,null);
        }
        return solvingProcess(n,cache);
    }
    private static int solvingProcess(int n,ArrayList<Integer> cache){
        if(n==0||n==1){
            return n;
        }else if(n==2){
            return 1;
        }else{
            if(cache.get(n)!=null){
                return cache.get(n);
            }else{
                int remember=solvingProcess(n-1,cache)+solvingProcess(n-2,cache)+solvingProcess(n-3,cache);
                cache.set(n,remember);
                return remember;
            }
        }
    }
    public static int tribonacciFast(int num){
        int[] arr=new int[num+1];
        int calculate=0;
        arr[0]=0;
        arr[1]=arr[2]=1;
        if(num==0||num==1||num==2){
            return arr[num];
        }
        for(int i=3;i<=num;i++){
            calculate=arr[i-1]+arr[i-2]+arr[i-3];
            arr[i]=calculate;
        }
        return calculate;
    }
}
