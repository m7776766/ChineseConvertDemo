package com.example.convert;

import com.github.houbb.opencc4j.util.ZhConverterUtil;

/**
 * Chinese Converter using opencc4j library
 * Provides methods to convert between Simplified and Traditional Chinese
 */
public class ChineseConverter {

    /**
     * Convert Simplified Chinese to Traditional Chinese
     * 
     * @param simplifiedText the simplified Chinese text
     * @return the traditional Chinese text
     */
    public String toTraditional(String simplifiedText) {
        if (simplifiedText == null || simplifiedText.isEmpty()) {
            return simplifiedText;
        }
        return ZhConverterUtil.toTraditional(simplifiedText);
    }

    /**
     * Convert Traditional Chinese to Simplified Chinese
     * 
     * @param traditionalText the traditional Chinese text
     * @return the simplified Chinese text
     */
    public String toSimplified(String traditionalText) {
        if (traditionalText == null || traditionalText.isEmpty()) {
            return traditionalText;
        }
        return ZhConverterUtil.toSimple(traditionalText);
    }

    /**
     * Main method to demonstrate the conversion functionality
     */
    public static void main(String[] args) {
        ChineseConverter converter = new ChineseConverter();

        // Test Simplified to Traditional conversion
        String simplifiedText = "我爱中国";
        String traditionalText = converter.toTraditional(simplifiedText);
        System.out.println("简体: " + simplifiedText);
        System.out.println("繁体: " + traditionalText);

        System.out.println();

        // Test Traditional to Simplified conversion
        String traditionalText2 = "我愛中國";
        String simplifiedText2 = converter.toSimplified(traditionalText2);
        System.out.println("繁体: " + traditionalText2);
        System.out.println("简体: " + simplifiedText2);
    }
}
