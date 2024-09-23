import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

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
        try{
            URL url=new URL("https://www.instagram.com/");
            Scanner input= new Scanner(url.openStream());
            while(input.hasNext()){
                System.out.println(input.next());
            }
        }catch (MalformedURLException m){
            System.out.println("Invalid URL");
        }catch (IOException e){
            System.out.println("Ni such file exists");
        }
        }
        public void searchForInteger(int elem, SingleLinkedList<Integer> singleLinkedList) {
            if (singleLinkedList.getHead() == null) {
                System.out.println("Error");
            }
    }
}
