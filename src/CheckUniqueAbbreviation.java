import java.util.*;

public class CheckUniqueAbbreviation {
    public static void main(String[] args) {
        boolean isUnique;
        Set<String> shortForm = new HashSet<>();
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("Automatically");
        dictionary.add("Internationalization");
        dictionary.add("Localization");
        dictionary.add("Accessibility");
        dictionary.add("Accessibility");

        for (String s : dictionary) {
            isUnique = shortForm.add(Abbreviation.getAbbreviation(s));
            System.out.println(s + " -> " + isUnique);
        }
    }

}



