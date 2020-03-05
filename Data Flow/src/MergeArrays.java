public class MergeArrays {
    private int[] arr1;
    private int[] arr2;

    public MergeArrays(int[] arr1, int [] arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public int[] mergeArr(){
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j= 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergedArr[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                mergedArr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            mergedArr[k] = arr1[i];
            k++;
            i++;
        }

        while(j<arr2.length){
            mergedArr[k] = arr2[j];
            k++;
            j++;
        }
        return mergedArr;


    }
}
