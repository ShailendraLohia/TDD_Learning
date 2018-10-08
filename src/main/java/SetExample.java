import java.util.Arrays;

/**
 * Created by shailendralohia on 10/1/18.
 */
public class SetExample {
    private int[] data= new int[10];
    private int size=-1;

    public boolean isEmpty() {
        /*if(data[0]==0 || data[0]==Integer.MIN_VALUE)
        return true;
        else {
            return false;
        }*/
        if(size()==0) {
            return true;
        }
            else {
                return false;
        }
    }

    public void add(int element){
        for(int i=0;i<data.length;i++) {
            if(data[i]==0) {
                data[i]=element;
                size=size+1;
                break;
            }
        }
    }

    public int size() {
        return size + 1;
    }
    public boolean contains(int element) {
        for(int i=0;i<data.length;i++) {
            if(data[i]==element) {
                return true;
            }
        }
        return false;
    }

    /*public void remove(int element) {
        for(int i=0;i<data.length;i++) {
            if(data[i]==element) {
               data[i]= Integer.MIN_VALUE;
               size--;
            }
        }
    }*/

    public void remove(int element) {
        int index = -1;
        int count = 0;
        int[] newArr=new int[data.length-1];
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                index = i;
                break;
            }
        }
        int[] firstArr = Arrays.copyOfRange(data, 0, index);

        int[] secondArr = Arrays.copyOfRange(data, index + 1, data.length);

        data=null; //Empty the original array

        //System.out.println(data.length);
        for (int i = 0; i < firstArr.length; i++) {
            newArr[i] = firstArr[i];
            count++;
        }
        for (int i = 0; i < secondArr.length; i++) {
            newArr[count++] = secondArr[i];
        }
        data=newArr;
        size--;
        newArr=null;
    }

}
