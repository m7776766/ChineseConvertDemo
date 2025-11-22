package com.example.convert;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for ChineseConverter
 */
public class ChineseConverterTest {

    private ChineseConverter converter;

    @Before
    public void setUp() {
        converter = new ChineseConverter();
    }

    @Test
    public void testSimplifiedToTraditional() {
        String simplified = "我爱中国";
        String traditional = converter.toTraditional(simplified);
        assertEquals("我愛中國", traditional);
    }

    @Test
    public void testTraditionalToSimplified() {
        String traditional = "我愛中國";
        String simplified = converter.toSimplified(traditional);
        assertEquals("我爱中国", simplified);
    }

    @Test
    public void testSimplifiedToTraditionalWithMultipleWords() {
        String simplified = "简体字转换为繁体字";
        String traditional = converter.toTraditional(simplified);
        assertEquals("簡體字轉換爲繁體字", traditional);
    }

    @Test
    public void testTraditionalToSimplifiedWithMultipleWords() {
        String traditional = "繁體字轉換為簡體字";
        String simplified = converter.toSimplified(traditional);
        assertEquals("繁体字转换为简体字", simplified);
    }

    @Test
    public void testNullInput() {
        assertNull(converter.toTraditional(null));
        assertNull(converter.toSimplified(null));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", converter.toTraditional(""));
        assertEquals("", converter.toSimplified(""));
    }

    @Test
    public void testMixedContent() {
        String simplified = "Hello 世界";
        String traditional = converter.toTraditional(simplified);
        assertTrue(traditional.contains("Hello"));
        assertTrue(traditional.contains("世界"));
    }
}
