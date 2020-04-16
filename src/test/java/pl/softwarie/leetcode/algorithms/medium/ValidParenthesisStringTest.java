package pl.softwarie.leetcode.algorithms.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidParenthesisStringTest {

    private final ValidParenthesisString solution = new ValidParenthesisString();

    @Test
    public void shouldValidateStrings() {
        assertThat(solution.checkValidString(")")).isFalse();
        assertThat(solution.checkValidString(")(")).isFalse();
        assertThat(solution.checkValidString("(*)))")).isFalse();
        assertThat(solution.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*")).isFalse();
        assertThat(solution.checkValidString("**((")).isFalse();

        assertThat(solution.checkValidString("()")).isTrue();
        assertThat(solution.checkValidString("(*)")).isTrue();
        assertThat(solution.checkValidString("(*))")).isTrue();
    }
}