package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

	@Test
	void findSmallestDifference() {
		TeamsFileReader tfr = new TeamsFileReader();

		assertEquals("Aston_Villa", tfr.findSmallestDifferenceName());
	}

	
}