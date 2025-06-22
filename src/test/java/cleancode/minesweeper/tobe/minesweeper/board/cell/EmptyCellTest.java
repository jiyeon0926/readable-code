package cleancode.minesweeper.tobe.minesweeper.board.cell;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmptyCellTest {

    @Test
    @DisplayName("초기 상태")
    void unchecked() {
        // given
        Cell cell = new EmptyCell();

        // when
        CellSnapshot snapshot = cell.getSnapshot();

        // then
        assertThat(snapshot).isEqualTo(CellSnapshot.ofUnchecked());
        assertThat(snapshot).isNotEqualTo(CellSnapshot.ofEmpty());
        assertThat(snapshot).isNotEqualTo(CellSnapshot.ofFlag());
    }

    @Test
    @DisplayName("열린 상태")
    void open() {
        // given
        Cell cell = new EmptyCell();

        // when
        cell.open();
        CellSnapshot snapshot = cell.getSnapshot();

        // then
        assertThat(snapshot).isEqualTo(CellSnapshot.ofEmpty());
        assertThat(snapshot).isNotEqualTo(CellSnapshot.ofUnchecked());
        assertThat(snapshot).isNotEqualTo(CellSnapshot.ofFlag());
    }

    @Test
    @DisplayName("깃발이 꽂힌 상태")
    void flag() {
        // given
        Cell cell = new EmptyCell();

        // when
        cell.flag();
        CellSnapshot snapshot = cell.getSnapshot();

        // then
        assertThat(snapshot).isEqualTo(CellSnapshot.ofFlag());
        assertThat(snapshot).isNotEqualTo(CellSnapshot.ofUnchecked());
        assertThat(snapshot).isNotEqualTo(CellSnapshot.ofEmpty());
    }
}
