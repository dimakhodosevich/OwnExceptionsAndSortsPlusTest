public class SortMain {
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int index = i;
            for (int j = i+1; j < array.length ; j++) {
                if(array[j]<array[index]){
                    index = j;
                }
            }

            if(i!=index){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }
}
