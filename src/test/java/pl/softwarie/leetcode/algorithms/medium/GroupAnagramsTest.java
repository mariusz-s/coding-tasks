package pl.softwarie.leetcode.algorithms.medium;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupAnagramsTest {

    private final GroupAnagrams solution = new GroupAnagrams();

    @Test
    public void shouldGroupAnagrams() {
        // having
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        // when
        List<List<String>> results = solution.groupAnagrams(input);

        // then
        for (List<String> group : results) {
            if (group.size() == 3) {
                assertThat(group).contains("ate", "eat", "tea");
            }
        }
    }
}