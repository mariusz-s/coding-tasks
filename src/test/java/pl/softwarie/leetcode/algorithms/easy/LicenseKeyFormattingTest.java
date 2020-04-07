package pl.softwarie.leetcode.algorithms.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LicenseKeyFormattingTest {

    private final LicenseKeyFormatting solution = new LicenseKeyFormatting();

    @Test
    public void shouldFormat() {
        // having
        String S = "5F3Z-2e-9-w";
        int K = 4;

        // when
        String result = solution.licenseKeyFormatting(S, K);

        // then
        assertThat(result).isEqualTo("5F3Z-2E9W");
    }

    @Test
    public void shouldFormat2() {
        // having
        String S = "2-5g-3-J";
        int K = 2;

        // when
        String result = solution.licenseKeyFormatting(S, K);

        // then
        assertThat(result).isEqualTo("2-5G-3J");
    }
}