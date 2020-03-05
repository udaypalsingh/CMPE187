public class Main {

    public static void main(String[] args){
        int [] arr = {11,20,25,63,96,136,158,197,209};
        int [] arr2 = {1,2,12,15,25,63,89,108,158,269,587};
        MergeArrays m = new MergeArrays(arr,arr2);
        int [] result = m.mergeArr();

        for(int val: result){
            System.out.println(val);
        }
    }
}
