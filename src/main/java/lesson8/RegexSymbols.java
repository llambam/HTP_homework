package lesson8;

public interface RegexSymbols {
    String SPACE_SYMBOL = " ";
    String ALL_NUMBERS = "[0-9]+";
    String SYMBOL_STAR ="*";
    String SYMBOL_MINUS ="-";
    String SYMBOL_POINT =".";
    String SYMBOL_COMMA =",";
    String SENTENCE_SEPARATOR ="[\\.\\!\\?]";
    String INTERROGATIVE_SENTENCE="([A-ZА-Я][^.!?]*)\\?";


}
