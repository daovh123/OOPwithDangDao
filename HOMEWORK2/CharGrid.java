// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid la bien.
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int n = grid.length;
		int m = grid[0].length;
		int minRow = n, maxRow = -1, minCol = m, maxCol = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == ch) {
					if (i < minRow) minRow = i;
					if (i > maxRow) maxRow = i;
					if (j < minCol) minCol = j;
					if (j > maxCol) maxCol = j;
				}
			}
		}
		if (maxRow == -1) {
			return 0;
		}
		return (maxRow - minRow + 1) * (maxCol - minCol + 1);
	}

	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int n = grid.length;
		int m = grid[0].length;
		int count = 0;
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < m - 1; j++) {
				char center = grid[i][j];
				int armLength = 1;
				while (i - armLength >= 0 && i + armLength < n &&
						j - armLength >= 0 && j + armLength < m &&
						grid[i - armLength][j] == center &&  // nhánh trên
						grid[i + armLength][j] == center &&  // nhánh dưới
						grid[i][j - armLength] == center &&  // nhánh trái
						grid[i][j + armLength] == center) {  // nhánh phải
					if (armLength >= 2) {
						count++;
					}
					armLength++;
				}
			}
		}
		return count;
	}
	
}
