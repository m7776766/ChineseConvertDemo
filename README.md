# ChineseConvertDemo

一個使用 opencc4j 實現簡體中文與繁體中文互相轉換的示範專案。

A demo project for Chinese Traditional and Simplified conversion using opencc4j.

## 功能特點 (Features)

- 簡體中文轉繁體中文 (Simplified to Traditional)
- 繁體中文轉簡體中文 (Traditional to Simplified)
- 基於 opencc4j 函式庫 (Based on opencc4j library)

## 技術棧 (Tech Stack)

- Java 8
- Maven
- opencc4j 1.8.1
- JUnit 4.13.2

## 專案結構 (Project Structure)

```
ChineseConvertDemo/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── convert/
│   │                   └── ChineseConverter.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── convert/
│                       └── ChineseConverterTest.java
└── README.md
```

## 如何使用 (How to Use)

### 建置專案 (Build the Project)

```bash
mvn clean compile
```

### 執行測試 (Run Tests)

```bash
mvn test
```

### 執行示範程式 (Run Demo)

```bash
mvn exec:java -Dexec.mainClass="com.example.convert.ChineseConverter"
```

### 在程式碼中使用 (Use in Code)

```java
import com.example.convert.ChineseConverter;

public class Example {
    public static void main(String[] args) {
        ChineseConverter converter = new ChineseConverter();
        
        // 簡體轉繁體 (Simplified to Traditional)
        String simplified = "我爱中国";
        String traditional = converter.toTraditional(simplified);
        System.out.println(traditional); // 輸出: 我愛中國
        
        // 繁體轉簡體 (Traditional to Simplified)
        String traditional2 = "我愛中國";
        String simplified2 = converter.toSimplified(traditional2);
        System.out.println(simplified2); // 輸出: 我爱中国
    }
}
```

## API 說明 (API Documentation)

### ChineseConverter

#### toTraditional(String simplifiedText)

將簡體中文轉換為繁體中文。

- **參數**: `simplifiedText` - 簡體中文字串
- **返回值**: 繁體中文字串

#### toSimplified(String traditionalText)

將繁體中文轉換為簡體中文。

- **參數**: `traditionalText` - 繁體中文字串
- **返回值**: 簡體中文字串

## 依賴項 (Dependencies)

主要依賴 opencc4j 函式庫進行中文轉換：

```xml
<dependency>
    <groupId>com.github.houbb</groupId>
    <artifactId>opencc4j</artifactId>
    <version>1.8.1</version>
</dependency>
```

## 參考資料 (References)

- [opencc4j GitHub Repository](https://github.com/houbb/opencc4j)

## 授權 (License)

本專案僅供學習和示範使用。