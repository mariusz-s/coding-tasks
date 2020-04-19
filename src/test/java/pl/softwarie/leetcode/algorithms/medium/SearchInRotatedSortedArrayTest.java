package pl.softwarie.leetcode.algorithms.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    @Test
    public void shouldFindTarget() {
        // when
        int index = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);

        // then
        assertThat(index).isEqualTo(4);
    }

    @Test
    public void shouldFindTarget2() {
        // when
        int index = solution.search(new int[]{6, 7, 0, 1, 2, 4, 5}, 6);

        // then
        assertThat(index).isEqualTo(0);
    }

    @Test
    public void shouldNotFindTarget() {
        // when
        int index = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);

        // then
        assertThat(index).isEqualTo(-1);
    }
}