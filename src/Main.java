public class Main {
    public static void main(String[] args) {

        int[] arrayToSort = {7,2,9,1,5,-78,3,0,34};

        Task1 task1 = new Task1();
        task1.selectionSort(arrayToSort);

        for (int x : arrayToSort) {
            System.out.print(x + " ");
        }
    }
}