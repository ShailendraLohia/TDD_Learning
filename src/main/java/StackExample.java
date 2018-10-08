import java.util.Arrays;

/**
 * Created by shailendralohia on 10/2/18.
 */
public class StackExample {
    private Integer[] data = new Integer[10];
    private int top=-1;


    public int size() {

        return top + 1;
    }

    public void push(int element) {
        data[size()] = element;
        top++;
    }
    public int top() {

        return data[top];
    }

    public boolean isEmpty() {
        if(size()==0)
            return true;
        return false;
    }

    /*public void pop(int element) {
        int index=-1;
        int count=0;
        for(int i=0;i<data.length;i++) {
            if(data[i]==element) {
                index=i;
                break;
            }
        }
        Integer[] firstArr= Arrays.copyOfRange(data,0,index);
        
        Integer[] secondArr=Arrays.copyOfRange(data,index+1,data.length);

        //data=null; //Empty the original array
        Arrays.fill(data,null);
        System.out.println(data.length);
        for(int i=0;i<firstArr.length;i++) {
            data[i]=firstArr[i];
            count++;
        }
        for(int i=0;i<secondArr.length;i++) {
            data[count++]=secondArr[i];
        }
    }*/

    public int pop() {
        int x=data[top--];
        return x;
    }



}
