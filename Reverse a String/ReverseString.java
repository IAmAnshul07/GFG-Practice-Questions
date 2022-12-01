class Reverse

{
    // Complete the function
    // str: input string
    public static String reverseWord(String str){
        String reversedWord="";
        
        for(int i=str.length()-1 ; i>=0 ; i--){
            
            reversedWord+=str.charAt(i);
        }
    return reversedWord;
    }
}