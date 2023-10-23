package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
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
        Figure bb = new BishopBlack(Cell.A1);
        Cell expected = Cell.G5;
        bb = bb.copy(Cell.G5);
        assertThat(bb.position()).isEqualTo(expected);
    }
}