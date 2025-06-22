package cleancode.minesweeper.tobe.minesweeper;

import cleancode.minesweeper.tobe.minesweeper.board.GameBoard;
import cleancode.minesweeper.tobe.minesweeper.config.GameConfig;
import cleancode.minesweeper.tobe.minesweeper.gamelevel.VeryBeginner;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleOutputHandler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinesweeperTest {

    @Test
    @DisplayName("실행 정상 작동")
    void run() {
        // given
        GameConfig gameConfig = new GameConfig(
            new VeryBeginner(),
            new ConsoleInputHandler(),
            new ConsoleOutputHandler()
        );
        GameBoard gameBoard = new GameBoard(gameConfig.getGameLevel());

        // when
        boolean inProgress = gameBoard.isInProgress();
        boolean notInProgress = !gameBoard.isInProgress();

        // then
        assertThat(inProgress).isTrue();
        assertThat(notInProgress).isFalse();
    }
}
