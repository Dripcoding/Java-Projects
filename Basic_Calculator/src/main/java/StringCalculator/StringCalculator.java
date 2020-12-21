package StringCalculator;

import java.util.List;
import java.util.StringJoiner;

public class StringCalculator {

    // build a new string from a list of chars
    // build a new string from a list of strings
    // check if a string is a palindrome
    // reverse a string
    // check if a substring is present in a given string
    // splice a substring in a given string
    // print all chars in a string

    public String buildNewStringFromStringList(List<String> stringList) {
        StringJoiner stringJoiner = new StringJoiner("");

        for (String s: stringList) {
            stringJoiner.add(s);
        }
        System.out.println("result: " + stringJoiner.toString());
        return stringJoiner.toString();
    }

    public String buildNewStringFromCharList(List<Character> charList) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : charList) {
            stringBuilder.append(c);
        }

        System.out.println("result: " + stringBuilder.toString());
        return stringBuilder.toString();
    }

    public String reverseGivenString(String targetString) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(targetString);
        result = stringBuilder.reverse().toString();
        System.out.println("result: " + result);
        return result;
    }

    public void printAllChars(String targetString) {
        for (Character c : targetString.toCharArray()) {
            System.out.println(c);
        }
    }
}
