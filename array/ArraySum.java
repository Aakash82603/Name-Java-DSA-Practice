public class ArraySum {
    public static void main(String[] args) 
    {
        int num[]={10,20,30,40,50};
        int sum=0;
        double average;
        for(int num1 : num){
            sum=sum+num1;
        }
        average=(double)sum/num.length;
       
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
    }
}
