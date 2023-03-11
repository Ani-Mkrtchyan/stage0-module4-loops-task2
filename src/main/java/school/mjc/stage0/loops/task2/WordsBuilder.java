package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String phrase = "";
        int i = 0;
        while (i < chars.length) {
            String temp = Character.toString(chars[i]);
            System.out.print(phrase.concat(temp));
            i++;
        }

    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('h', 'e', 'l', 'l', 'o');
    }
}
