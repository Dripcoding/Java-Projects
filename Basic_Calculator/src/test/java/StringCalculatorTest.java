import StringCalculator.StringCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("It should create a new string from a list of strings")
    public void shouldBuildANewStringFromStringList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        String result = stringCalculator.buildNewStringFromStringList(stringList);
        assertNotNull(result);
        assertThat(result, instanceOf(String.class));
        assertEquals("abc", result);
    }

    @Test
    @DisplayName("It should create a new string from a list of chars")
    public void shouldBuildANewStringFromCharList() {
        List<Character> charList = new ArrayList();
        charList.add('a');
        charList.add('b');
        charList.add('c');

        String result = stringCalculator.buildNewStringFromCharList(charList);
        assertNotNull(result);
        assertThat(result, instanceOf(String.class));
        assertEquals("abc", result);
    }

    @Test
    @DisplayName("It should reverse the given string")
    public void shouldReverseGivenString() {
        String givenString = "abc";

        String result = stringCalculator.reverseGivenString(givenString);
        assertNotNull(result);
        assertThat(result, instanceOf(String.class));
        assertEquals("cba", result);
    }

    @Test
    @DisplayName("It should check if given string is a palindrome")
    public void shouldCheckIfIsPalindrome() {
        String notPalindrome = "abc";

        Boolean result = stringCalculator.isPalindrome(notPalindrome);

        assertNotNull(result);
        assertThat(result, instanceOf(Boolean.class));
        assertEquals(false, result);

        String isPalindrome = "abba";

        Boolean resultTwo = stringCalculator.isPalindrome(isPalindrome);

        assertNotNull(resultTwo);
        assertThat(resultTwo, instanceOf(Boolean.class));
        assertEquals(true, resultTwo);
    }
}

