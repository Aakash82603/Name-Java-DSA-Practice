public class Twod {
    public static void main(String[] args){
        int num[][]= new int [3][];
           num[0]=new int[4];
           num[1]=new int[3];
           num[2]=new int[2];
        for(int i=0; i< num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
                 int r= (int)(Math.random()*100);//random number generator
                // num[i][j] = r;
                 System.out.print(r + " ");
            }
            System.out.println();
        }
        
    }
    
}
