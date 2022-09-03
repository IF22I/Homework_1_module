public class Level_1 {

    public Level_1() {
    }
    public static int factorial(int number) {

        int result = 1;
        for (int i=1; i<=number; i++) {
            result = result * i;
        }

        return result;
    }
    public static String capitalize(String word){

        String [] sentence = word.split(" ");
        for (int i = 0; i<sentence.length; i++){
            sentence[i] = sentence[i].substring(0,1).toUpperCase()+sentence[i].substring(1);
        }

        String result = "";
        for (int i = 0; i<sentence.length; i++) {
            result = result + " " + String.join(" ", sentence[i]);
        }

        return result;

    }
    public static String reverseWord(String word){

        char[] wordArray = new char[word.length()];
        for (int i = 0; i < wordArray.length; i++){
            wordArray[i] = word.charAt(i);
        }

        for(int i = 0; i < word.length() / 2; i++)
        {
            char temp = wordArray[i];
            wordArray[i] = wordArray[wordArray.length - i - 1];
            wordArray[word.length() - i - 1] = temp;
        }

        String result = new String(wordArray);

        return result;
    }
    public static String longestWord(String word){

        String [] sentence = word.split(" ");
        String first = sentence[0];

        for (int i=0; i<sentence.length; i++){
            if (sentence[i].length()>first.length()){
                first = sentence[i];
            }
        }

        return first;
    }

}