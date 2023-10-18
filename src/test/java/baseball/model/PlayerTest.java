package baseball.model;

import baseball.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PlayerTest extends NsTest {

    @Test
    void 입력_숫자_자릿수_검증() {
        List<Integer> numbers = List.of(1, 2);

        assertDoesNotThrow(() -> new Player(numbers));
    }

    @Test
    void 입력_숫자_형식_검증() {
        List<Integer> numbers = List.of(1, 2, 0);

        assertDoesNotThrow(() -> new Player(numbers));
    }

    @Test
    void 입력_숫자_중복_검증() {
        List<Integer> numbers = List.of(1, 2, 2);

        assertDoesNotThrow(() -> new Player(numbers));
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
