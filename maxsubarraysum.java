public class maxsubarraysum {
    public static void  Subarraysum(int numbers[]){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=0;j<numbers.length;j++){
                int end=j;
               currSum=0;
               for(int k= start;k<end;k++){
                currSum+=numbers[k];

               }
               System.out.print(currSum);
               if(maxsum<currSum){
                maxsum= currSum;
               }
               

            }
        }
        System.out.println("max sum ="+maxsum);

    }
    public static void main(String args[]){
        int numbers[]={1,-2,3,4};
        Subarraysum(numbers);

    }
    
}
