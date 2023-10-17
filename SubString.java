public class SubString {
    public static String Substring(String str,int si,int ei){
         String substr ="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
            

        }
        return substr;
    }

    public static void main(String args[]){
        String str= "HELLO WORLD";
        System.out.println(Substring(str, 2, 5));
    }
    
}
