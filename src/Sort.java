public class Sort {

    private int[] arr;

    private int upper;

    private int numElement;

    public Sort(int size) {
        arr = new int[size];
        upper = size - 1;
        numElement = 0;
    }

    public void Insert(int item) {
        arr[numElement] = item;
        numElement++;
    }

    public void DisplayElements() {
        for (int i = 0; i <= upper; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
    }

    public void bSort() {
        int temp;
        for (int outter = upper; outter >= 1; outter--) {
            for (int inner = 0; inner <= outter - 1; inner++) {
                if ((int) arr[inner] > arr[inner + 1]) {
                    temp = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = temp;
                }
            }
            this.DisplayElements();
        }
    }
}
