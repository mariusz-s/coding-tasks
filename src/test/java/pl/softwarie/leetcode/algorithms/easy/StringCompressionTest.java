package pl.softwarie.leetcode.algorithms.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompressionTest {

    private final StringCompression solution = new StringCompression();

    @Test
    public void shouldCompress() {
        // having
        char[] input = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        // when
        int compress = solution.compress(input);

        // then
        assertThat(compress).isEqualTo(6);
        assertThat(input).containsSequence('a', '2', 'b', '2', 'c', '3');
    }

    @Test
    public void shouldCompress2() {
        // having
        char[] input = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};

        // when
        int compress = solution.compress(input);

        // then
        assertThat(compress).isEqualTo(4);
        assertThat(input).containsSequence('a', 'b', '1', '2');
    }
}