package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader2 {

//Todo: note that this class should not be used, we created the solution
//      in the day05 folder.

	public String findSmallestDifference(String fileName) {
		List<String> lines = readLines(fileName);
		lines = filterLines(lines, 0, 18);

		int minDifference = 1000;


		return fileName;
	}

	private List<String> readLines(String name) {
		try {
			return Files.readAllLines(Paths.get("" + name));
		} catch (IOException ioe) {
			throw new IllegalStateException("Can not read file.", ioe);
		}
	}

	private List<String> filterLines(List<String> lines, int... filtered) {
		List<String> result = new ArrayList<>();
		for (int i = 0; i < lines.size(); i++) {
			if (!Arrays.asList(filtered).contains(i))  {
				result.add(lines.get(i));
			}
		}
		return result;
	}


}
