import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;

public class HashSetImplementation {
    private Integer[] data = new Integer[10];
    private int size=-1;

    public boolean isEmpty() {
        if(size()==0) {
            return true;
        }
        else{
            return false;
        }
    }

    public int size() {
        return size + 1;
    }

    public void add(int element) {
        /*if(size()>data.length) {
            throw new IndexOutOfBoundsException();
        }*/
        if(!contains(element)) {
            data[++size] = element;
            //size++;
        }
    }

    public boolean contains(int element) {
        // TODO: 10/9/18  Can this implementation done through lambda function
        for(Integer i:data) {
            if(i!=null && i==element) {
                return true;
            }
        }
        return false;
        /*for(int i=0;i<data.length;i++) {
            if(data[i]==element) {
                return true;
            }
        }
        return false;*/
    }

    public void remove(int element) {
        int index=-1;
        Integer[] newArr=new Integer[data.length-1];
        for(int i=0;i<data.length;i++) {
            if(data[i]==element) {
                index=i;
                break;
            }
        }
        Integer[] firstArray= Arrays.copyOfRange(data,0,index);
        Integer[] secondArray=Arrays.copyOfRange(data,index+1,data.length);

        int count=-1;
        for(int i=0;i<firstArray.length;i++) {
            newArr[i]=firstArray[i];
            count++;
        }
        for(int j=0;j<secondArray.length;j++) {
            newArr[++count]=secondArray[j];
        }
        data=null;
        data=newArr;
        newArr=null;
        size--;

    }

}
