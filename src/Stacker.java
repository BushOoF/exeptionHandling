import java.util.Scanner;

public class Stacker{
    private int maxSize;
    private int top;
    private int[] arr;
    public Stacker(){

    }
    public  Stacker(int size){
        Scanner scanner=new Scanner(System.in);
        while (size<=0){
            System.out.println("Size cannot be less than or equal to 0");
            size=scanner.nextInt();
        }
        maxSize=size;
        top=0;
        arr=new int[maxSize];
    }
    public boolean isFull(){
        return maxSize-1==top;
    }
    public boolean isEmpty(){
        return top==0;
    }
    public void addToTop(int elem){
        if(isFull()){
            System.out.println("Cannot add to full stack");
        }else{
            arr[top++]=elem;
        }
    }
    public void deleteFromTop(){
        if(isEmpty()){
            System.out.println("Cannot delete from empty stack");
        }else{
            arr[top--]=0;
        }
    }
    public int getTop() {
        return arr[top];
    }
    public void copyStack(Stacker otherStack){
        otherStack.maxSize=maxSize;
        otherStack.top=top;
        int copyTemp=top;
        while (copyTemp>=0){
            otherStack.addToTop(getTop());
            copyTemp--;
        }
    }
}
