public class Larg {
    public static void main(String[] args) {

        int num[] = {60, 20, 40, 30, 50};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < num.length; i++) {

            if(num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            }
            else if(num[i] > secondLargest && num[i] != largest) {
                secondLargest = num[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}