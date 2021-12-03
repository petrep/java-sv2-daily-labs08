package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

	public String findSmallestDifference(String fileName) {
		String teamWithSmallestDifference = null;
		List<String> fileData = null;

		try {
			fileData = Files.readAllLines(Paths.get(fileName));
		} catch (IOException ioe) {
			throw new IllegalStateException("Can not read file.", ioe);
		}

		int minSpread = 1000;

		for(int i = 1; i < fileData.size(); i++) {
			try {
				String currentLine = fileData.get(i);
				String teamNameString = currentLine.substring(6,23).trim();
	//			int day = Integer.parseInt(dayString);

				String goalsFor = currentLine.substring(43,45).trim();
				int max = Integer.parseInt(goalsFor);

				String goalsAgainst = currentLine.substring(50,52).trim();
				int min = Integer.parseInt(goalsAgainst);

				int diff = Math.abs(max - min);

				if(diff < minSpread) {
					minSpread = diff;
					teamWithSmallestDifference = teamNameString;
				}
			} catch (NumberFormatException err) {
				continue;
			}
		}



		return teamWithSmallestDifference;

	}

	public int findSmallestTemperatureSpread(String fileNameString){
//		fileNameString = "src/main/resources/notexisting.txt";
		int dayWithSmallestTempSpread = 0;
		List<String> fileData = null;

		try {
			fileData = Files.readAllLines(Paths.get(fileNameString));
		} catch (IOException ioe) {
			throw new IllegalStateException("Can not read file.", ioe);
		}

		int minSpread = 1000;

		for(int i = 2; i < fileData.size() -1; i++) {
			String currentLine = fileData.get(i);
			String dayString = currentLine.substring(2,4).trim();
			int day = Integer.parseInt(dayString);

			String maxString = currentLine.substring(6,8).trim();
			int max = Integer.parseInt(maxString);

			String minString = currentLine.substring(12,14).trim();
			int min = Integer.parseInt(minString);

			int diff = max - min;

			if(diff < minSpread) {
				minSpread = diff;
				dayWithSmallestTempSpread = day;
			}
		}


		return dayWithSmallestTempSpread;
	}
}
