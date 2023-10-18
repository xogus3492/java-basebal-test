package baseball.model;

import java.util.List;

public class Player {
    private static final int NUMBERS_LENGTH = 3;
    private static final int START_INCLUSIVE_NUMBER = 1;
    private static final int END_INCLUSIVE_NUMBER = 9;
    private static final String INCORRECT_DIGIT_MESSAGE = "3자리 수여야 합니다.";
    private static final String NOT_CONSIST_OF_NUMBER_MESSAGE = "1~9의 숫자로 이루어져야 합니다.";
    private static final String DUPLICATE_NUMBER_MESSAGE = "숫자가 중복되면 안됩니다.";
    private final List<Integer> numbers;

    public Player(List<Integer> numbers) {
        verifyNumberDigit(numbers);
        verifyConsistOfNumber(numbers);
        verifyDuplicateNumber(numbers);
        this.numbers = numbers;
    }

    private void verifyNumberDigit(List<Integer> numbers)  {
        if (numbers.size() != NUMBERS_LENGTH) {
            throw new IllegalArgumentException(Player.INCORRECT_DIGIT_MESSAGE);
        }
    }

    private void verifyConsistOfNumber(List<Integer> numbers)  {
        int elementCount = (int) numbers.stream()
                .filter(e -> (e >= START_INCLUSIVE_NUMBER) && (e <= END_INCLUSIVE_NUMBER))
                .count();
        if (elementCount != NUMBERS_LENGTH) {
            throw new IllegalArgumentException(Player.NOT_CONSIST_OF_NUMBER_MESSAGE);
        }
    }

    private void verifyDuplicateNumber(List<Integer> numbers)  {
        int elementCount = (int) numbers.stream()
                .distinct()
                .count();
        if (elementCount != NUMBERS_LENGTH) {
            throw new IllegalArgumentException(Player.DUPLICATE_NUMBER_MESSAGE);
        }
    }

}
