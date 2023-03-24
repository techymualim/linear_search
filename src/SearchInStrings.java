public class SearchInStrings {

    public static void main(String[] args) {
        String name="Hassam";
        char target='q';
        System.out.println(search(name,target));
    }

    static boolean search(String str,char chr){
        if(str.length()==0){
            return false;
        }

        //here we are doing for the for loop which is iterating over the each character in the string
//        for(int i=0; i < str.length();i++){
//            if(chr==str.charAt(i)){
//                return true;
//            }
//        }
        // here we are using for each loop.
        for(char ch :str.toCharArray()){
            if (ch == chr){
                return true;
            }
        }
        return false;
    }
}
