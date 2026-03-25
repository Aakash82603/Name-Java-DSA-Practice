public class Array {
    // to check sorted or not
    public static void main(String[] args) {
        int num[] = {10, 20, 30, 40, 50};
        boolean isSorted = true;

        for(int i = 0; i < num.length - 1; i++) {
            if(num[i] > num[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}
