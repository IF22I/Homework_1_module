import java.util.Locale;

public class Level_3 {

    public static boolean palindrome(String word) {

        word = word.toLowerCase(Locale.ROOT);
        word = word.replaceAll("[-+.^; :,']", "");

        char[] wordArray = new char[word.length()];
        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = word.charAt(i);
        }

        for (int i = 0; i < word.length() / 2; i++) {
            char temp = wordArray[i];
            wordArray[i] = wordArray[wordArray.length - i - 1];
            wordArray[word.length() - i - 1] = temp;
        }

        String result = new String(wordArray);

        if (word.equals(result)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean[] prisonGuardProblem(int guard, int gate) {

        Boolean[] prison = new Boolean[gate];

        for (int i = 0; i < gate; i++) {
            prison[i] = false;
        }

        for (int j = 1; j <=gate; j++) {
            for (int i = 1; i <=guard; i++) {
                prison[i - 1] = ((i % j) == 0) != prison[i - 1];
            }
        }

        return prison;
    }
}

//    Prison guard problem
//        You have N prison guards and M cell gates. The status of the gates can be open (1) or closed (0).
//        At the beginning, all the cell gates are closed.
//        Every prison guard go through the cell gates opens the closed gates and closes the opened gates
//        the following way:
//        first prison guard goes through all the gates and opens all of them
//        second prison guard goes through every second cell gate and closes the open ones
//        third prison guard goes through every third cell gate and opens the closed ones, and closes the opened ones etc.
//        Your task is to write an application which gets the N (guard number) and M (gate number) as a parameter and
//        returns an int[] with the status of the cell gates after all the guards went through the gates.
//        Sample input:
//        N = 5, M = 5
//        Sample output:
//        1, 0, 0, 1, 0