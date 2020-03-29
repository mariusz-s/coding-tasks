package pl.softwarie.leetcode.algorithms.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddStringsTest {

    private AddStrings solution = new AddStrings();

    @Test
    public void shouldAddNumbers1() {
        // having
        String num1 = "9";
        String num2 = "99";

        // when
        String result = solution.addStrings(num1, num2);

        // then
        assertThat(result).isEqualTo("108");
    }

    @Test
    public void shouldAddNumbers2() {
        // having
        String num1 = "408";
        String num2 = "5";

        // when
        String result = solution.addStrings(num1, num2);

        // then
        assertThat(result).isEqualTo("413");
    }

    @Test
    public void shouldAddNumbers3() {
        // having
        String num1 = "4332323";
        String num2 = "12132";

        // when
        String result = solution.addStrings(num1, num2);

        // then
        assertThat(result).isEqualTo("4344455");
    }
}
