package pl.softwarie.leetcode.algorithms;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ReverseIntTest {

    @Test
    public void reverse() {
        // given && when && then
        assertThat(ReverseInt.reverse(123)).isEqualTo(321);
        assertThat(ReverseInt.reverse(-123)).isEqualTo(-321);
        assertThat(ReverseInt.reverse(120)).isEqualTo(21);
        assertThat(ReverseInt.reverse(1534236469)).isEqualTo(0);
    }
}