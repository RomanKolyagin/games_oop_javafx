package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure bb = new BishopBlack(Cell.C1);
        Cell expected = Cell.C1;
        assertThat(bb.position()).isEqualTo(expected);
    }

    @Test
    public void copy() {
        Figure bb = new BishopBlack(Cell.C1);
        Cell expected = Cell.C1;
        bb = bb.copy(Cell.C1);
        assertThat(bb.position()).isEqualTo(expected);
    }

    @Test
    public void whenMoveException() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        ImpossibleMoveException exception = assertThrows(
                ImpossibleMoveException.class,
                () -> {
                    bishopBlack.way(Cell.C3);
                });
        assertThat(exception.getMessage()).isEqualTo(
                String.format("Could not move by diagonal from %s to %s", Cell.C1, Cell.C3)
        );
    }
}