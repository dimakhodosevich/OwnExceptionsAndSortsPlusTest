import org.junit.Assert;
import org.junit.Test;


public class SortMainTest {


    @Test
    public void selectionSort() {
        int[] array = {2, 5, 7, 2, 6};
        int[] result = {2, 2, 5, 6, 7};

        SortMain.selectionSort(array);
        Assert.assertArrayEquals(result, array);
    }

    @Test
    public void insertedSort() {
        int[] array = {2, 5, 7, 2, 6};
        int[] result = {2, 2, 5, 6, 7};

        InsertedSort.selectedSort(array);
        Assert.assertArrayEquals(result, array);
    }

}