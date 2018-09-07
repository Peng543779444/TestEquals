import java.util.ArrayList;

public class TestCompareAndSwap {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }


        String [] arr = new String[]{"lilei","Gini","hanmeimei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(456);
        list.add(2130);

        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //ifn
        if (list == null) {

        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }

    }
}

class CompareAndSwap {
/**
 * 客户
 */
 private String id;
 
    public void test(){
        
    }
    int value;
    //获取内存值

    public synchronized int get() {
        return value;
    }

    //比较
    public synchronized int compareAndSwap(int expecteValue, int newValue) {
        int oldValue = value;
        if (oldValue == expecteValue) {
            this.value = newValue;

        }
        return oldValue;
    }

    public synchronized boolean compareAndSet(int expecteValue, int newValue) {
        return expecteValue == compareAndSwap(expecteValue, newValue);
    }
}