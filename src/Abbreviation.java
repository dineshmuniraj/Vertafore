public class Abbreviation {
    public static void main(String[] args) {

        System.out.println(getAbbreviation("automatically"));
        System.out.println(getAbbreviation("accessibility"));
        System.out.println(getAbbreviation("internationalization"));

    }

    public static String getAbbreviation(String word) {

        if(word.length()<2){
            return word;
        }

        char[] ch = word.toCharArray();
        int endOfLine = word.length() - 1;
        int characterCount = 0;

        for (int i = 1; i < ch.length; i++) {
            if (Character.isLetter(ch[i]) && i != endOfLine) {
                characterCount++;
            }
        }
        return ch[0] + "" + characterCount + "" + ch[endOfLine];


    }
}
