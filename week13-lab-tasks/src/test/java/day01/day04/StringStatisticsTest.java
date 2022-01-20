package day01.day04;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void vowelCounterTest() {
        StringStatistics stringStatistics = new StringStatistics();
        Map<Character,Integer> result = stringStatistics.vowelCounter("appletree");

        assertEquals(1,result.get('a'));
        assertEquals(3,result.get('e'));
        assertNull(result.get('u'));
    }
}