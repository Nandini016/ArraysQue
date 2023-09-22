public class Bubblesort{

    public static void Sorting(int nums[]){
        for(int turn=0; turn<nums.length-1;turn++){
            for(int j=0;j<nums.length-1-turn;j++){
                if(nums[j]>nums[j+1]){
                    int temp =nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void PrintNums(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int nums[]={5,3,4,1,2};
        Sorting(nums);
        PrintNums(nums);

    }
}