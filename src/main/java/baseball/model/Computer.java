package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private static final int START_INCLUSIVE_NUMBER = 1;
    private static final int END_INCLUSIVE_NUMBER = 9;
    private static final int NUMBERS_LENGTH = 3;
    private final List<Integer> numbers;

    public Computer() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < NUMBERS_LENGTH) {
            addNumber(numbers);
        }
        this.numbers = numbers;
    }

    private void addNumber(List<Integer> numbers) {
        int randomNumber = Randoms.pickNumberInRange(START_INCLUSIVE_NUMBER, END_INCLUSIVE_NUMBER);
        if (numbers.contains(randomNumber)) {
            return;
        }
        numbers.add(randomNumber);
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }
}
