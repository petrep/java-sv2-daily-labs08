package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

	@Test
	void testCreateWithList() {
		List<Integer> testList = Arrays.asList(6, 33, -12, 21, 28);
		NumberSequence numberSequence = new NumberSequence(testList);

		assertEquals(5, numberSequence.getNumbers().size());
		assertEquals(-12, numberSequence.getNumbers().get(2));
		assertEquals(21, numberSequence.getNumbers().get(3));
	}

	@Test
	void testCreateWithRandoms() {
		NumberSequence numberSequence = new NumberSequence(6, 1,60);

		assertEquals(6, numberSequence.getNumbers().size());
		assertTrue(numberSequence.getNumbers().get(0) != numberSequence.getNumbers().get(3));
		assertTrue(numberSequence.getNumbers().get(2) != numberSequence.getNumbers().get(4));
		assertTrue(numberSequence.getNumbers().get(0) != numberSequence.getNumbers().get(5));
		assertTrue(numberSequence.getNumbers().get(0) >= 1 && numberSequence.getNumbers().get(0) <= 60);
		assertTrue(numberSequence.getNumbers().get(4) >= 1 && numberSequence.getNumbers().get(4) <= 60);
		assertFalse(numberSequence.getNumbers().get(3) < 1 || numberSequence.getNumbers().get(3) > 60);
	}

	@Test
	void testCloseToAverage() {
		List<Integer> testList = Arrays.asList(19, 11, 29, -7, 18, -11, 17);
		NumberSequence numberSequence = new NumberSequence(testList);

		List<Integer> result = numberSequence.closeToAverage(7);

		assertEquals(2, result.size());
		assertEquals(11, result.get(0));
		assertEquals(17, result.get(1));
	}
}