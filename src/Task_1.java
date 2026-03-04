public class Task_1 {

    int[] array;
    int curMin, curMinIndex, compareTemp;

    public Task_1(int[] arrayToSort) {
        array = arrayToSort;
        selectionSort();
    }

    public void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            curMin = array[i];
            curMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                compareTemp = array[j];
                if (curMin > compareTemp) {
                    curMin = compareTemp;
                    curMinIndex = j;
                }
            }
            array[curMinIndex] = array[i];
            array[i] = curMin;
        }
    }
}
