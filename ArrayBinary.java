public class ArrayBinary {

    public static int BinarySearch(int numbers[],int key){
        int start=0;
        int end = numbers.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                start = mid-1;
            }

        }
        return -1;
    }

    public static void main(String args[]){
       int numbers[]={2,3,4,5,6,7,8,9};
       int key = 7;
       System.out.println("the index of the key is "+BinarySearch(numbers,key));
    }
    
}
