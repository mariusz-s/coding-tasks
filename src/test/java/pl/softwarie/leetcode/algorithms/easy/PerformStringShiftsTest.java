package pl.softwarie.leetcode.algorithms.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PerformStringShiftsTest {

    private final PerformStringShifts solution = new PerformStringShifts();

    @Test
    public void shouldShiftString() {
        // given
        String s = "abc";
        int[][] shift = new int[][]{{0, 1}, {1, 2}};

        // when
        String result = solution.stringShift(s, shift);

        // then
        assertThat(result).isEqualTo("cab");
    }

    @Test
    public void shouldShiftString2() {
        // given
        String s = "abcdefg";
        int[][] shift = new int[][]{{1, 1}, {1, 1}, {0, 2}, {1, 3}};

        // when
        String result = solution.stringShift(s, shift);

        // then
        assertThat(result).isEqualTo("efgabcd");
    }

    @Test
    public void shouldShiftString3() {
        // given
        String s = "yisxjwry";
        int[][] shift = new int[][]{{1, 8}, {1, 4}, {1, 3}, {1, 6}, {0, 6}, {1, 4}, {0, 2}, {0, 1}};

        // when
        String result = solution.stringShift(s, shift);

        // then
        assertThat(result).isEqualTo("yisxjwry");
    }
}