package codewars;


//Examples:
//        spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//        spinWords( "This is a test") => returns "This is a test"
//        spinWords( "This is another test" )=> returns "This is rehtona test"
public class SpinWords {
    public String spinWords(String sentence) {
        String[] s = sentence.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i=0; i<s.length; i++){
            if (s[i].length() >=5){

                char[] chars = s[i].toCharArray();
                for (int j=chars.length-1; j>=0; j--){
                    sb.append(chars[j]);
                }

            }else{
                sb.append(s[i]);
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
