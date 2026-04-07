
public class MoveVowelToFirst {

    static StringBuilder shiftVowels(String s){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        String s3 = s.toLowerCase();
        for(int i=0; i<s3.length(); i++){
            char c = s3.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                s1.append(s.charAt(i));
            }
            else{
                s2.append(s.charAt(i));
            }
        }
        s1.append(s2);
        return s1;
    }



    public static void main(String[] args) {
        String s = "International";
        System.out.println(shiftVowels(s));
        
    }
}
