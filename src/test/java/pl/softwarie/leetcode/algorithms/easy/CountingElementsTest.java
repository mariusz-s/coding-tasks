package pl.softwarie.leetcode.algorithms.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountingElementsTest {

    private final CountingElements solution = new CountingElements();

    @Test
    public void shouldCalculateElements() {
        // having
        int[] input = new int[]{1, 1, 2, 2};

        // when
        int result = solution.countElements(input);

        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldCalculateElements2() {
        // having
        int[] input = new int[]{1, 3, 2, 3, 5, 0};

        // when
        int result = solution.countElements(input);

        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldCalculateElements3() {
        // having
        int[] input = new int[]{1, 1, 3, 3, 5, 5, 7, 7};

        // when
        int result = solution.countElements(input);

        // then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldCalculateElements4() {
        // having
        int[] input = new int[]{1, 1, 2};

        // when
        int result = solution.countElements(input);

        // then
        assertThat(result).isEqualTo(2);
    }
}