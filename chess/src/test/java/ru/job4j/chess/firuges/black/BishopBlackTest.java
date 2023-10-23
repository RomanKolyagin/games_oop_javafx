package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.*;
public class BishopBlackTest {

    @Test
    public void position() {
        Figure bb = new BishopBlack(Cell.A1);
        Cell expected = Cell.A1;
        assertThat(bb.position()).isEqualTo(expected);
    }

    @Test
    public void copy() {
        Figure bb = new BishopBlack(Cell.C1);
        Cell expected = Cell.G5;
        bb = bb.copy(Cell.G5);
        assertThat(bb.position()).isEqualTo(expected);
    }

    @Test
    public void way() throws ImpossibleMoveException {
        Figure bb = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bb.way(Cell.G5)).isEqualTo(expected);

    }
}