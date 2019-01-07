package lesson8;

public class Task7 {
    private String[] strArr;
    private int numberOfSymbols = 1;
    private final static String[] vowels = {"а", "о", "э", "ы", "и", "у", "е", "ё", "ю", "я"};//for task 7   final static correct here?
    private int vowelsSum;
    private int others;
    private int consonants;

    public void task7(String text) {
        System.out.println("Task 7");
        strArr = text.split(RegexSymbols.SENTENCE_SEPARATOR);

        consonants = 0;
        others = 0;
        vowelsSum = 0;
        System.out.println("In text " + strArr.length + " sentences");
        for (String s : strArr) {

            others = task7SymbolSearch(RegexSymbols.SYMBOL_SPACE, s)
                    + task7SymbolSearch(RegexSymbols.SYMBOL_STAR, s)
                    + task7SymbolSearch(RegexSymbols.SYMBOL_MINUS, s)
                    + task7SymbolSearch(RegexSymbols.SYMBOL_POINT, s)
                    + task7SymbolSearch(RegexSymbols.SYMBOL_COMMA, s);
            for (String f : vowels) {
                vowelsSum = vowelsSum + task7SymbolSearch(f, s);

            }
            consonants = s.length() - others - vowelsSum;
            if (consonants > vowelsSum) {
                System.out.println("In this sentence consonants more then vowels: " + consonants + " : " + vowelsSum);
            } else {
                System.out.println("In this sentence vowels more then consonants: " + vowelsSum + " : " + consonants);
            }
            consonants = 0;
            others = 0;
            vowelsSum = 0;


        }

    }

    private int task7SymbolSearch(String symbol, String searchFragment) {
        numberOfSymbols = 0;
        for (int i = 0; i < searchFragment.lastIndexOf(symbol); ) {
            i = searchFragment.indexOf(symbol, searchFragment.indexOf(symbol, i));
            i++;
            numberOfSymbols++;
        }
        return numberOfSymbols;
    }
}
