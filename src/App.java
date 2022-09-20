/**
 * @author: MARK ANDREW DUZA19
 * BSIT 103
 * ORTIGAS-CAINTA
 */

public class App {
    public static void main(String[] args) throws Exception {
        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        Sort myNumbers = new Sort(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            myNumbers.Insert(numbers[i]);
        }

        System.out.println("Before: ");
        myNumbers.DisplayElements();
        System.out.println("During: ");
        myNumbers.bSort();
        System.out.println("After: ");
        myNumbers.DisplayElements();
    }
}
