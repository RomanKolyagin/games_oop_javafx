package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.*;
public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bb = new BishopBlack(Cell.A1);
        Cell expected = Cell.A1;
        assertThat(bb.position()).isEqualTo(expected);
    }

    @Test
    public void testCopy() {
        BishopBlack bb = new BishopBlack(Cell.A1);
        Figure expected = bb.copy(Cell.A5);
        assertThat(expected.position()).isEqualTo(Cell.A5);
    }
}