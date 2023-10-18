package baseball.model;

import baseball.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ComputerTest extends NsTest {

    @Test
    void 컴퓨터_랜덤_숫자_생성() {
        Computer computer = new Computer();
        List<Integer> numbers = computer.getNumbers();

        System.out.println(numbers);
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
