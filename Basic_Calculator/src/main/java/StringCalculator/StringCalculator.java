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
}
