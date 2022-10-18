public class InsertedSort {
    public static void selectedSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int j = i+1;
            int key = array[j];

            while(j>0 && key<array[j-1]){
                array[j] = array[j-1];
                j--;

            }

            array[j] = key;
        }
    }
}
