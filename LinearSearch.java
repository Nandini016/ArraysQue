public class LinearSearch {
    public static int linearsearch(int numbers[], int key){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int numbers[]={1,2,4,6,8,5,9};
        int key=10;
        int index=linearsearch(numbers,key);

        if(index==  -1){
            System.out.println("Element not found!!");
        }
        else{
            System.out.println("Key is found at index : "+index);
        }
    }
}
