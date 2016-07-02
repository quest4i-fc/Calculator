package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringCalculator {

    public int add(String text) {
        if (isBlank(text)) {
            return 0;
        }
        
        return Stream.of(split(text))
        	.mapToInt(v -> toPositive(v))
        	.sum();
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    /**
     * 	문자열을 사용자 커스텀 구분자가 있는 것과 없는 것으로 구분해서 반환한다.
     */
    private String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }

        return text.split(",|:");
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }
} // end of StringCalculator
