package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {
    @Test
    void whenPositionThenCurrentPosition() {
        Cell expectedPosition = Cell.A1;
        Figure bishopBlack = new BishopBlack(expectedPosition);
        Cell actual = bishopBlack.position();
        assertThat(actual).isEqualTo(expectedPosition);
    }

    @Test
    void whenCopyThenCurrent() {
        Cell expectedCopy = Cell.A1;
        Figure bishopBlack = new BishopBlack(expectedCopy);
        Figure copy = bishopBlack.copy(expectedCopy);
        assertThat(copy.position()).isEqualTo(expectedCopy);
    }
}