//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;

	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}

	/**
	 * Does row-clearing on the grid.
	 */
	public void clearRows() {
		int rows = grid[0].length;
		int cols = grid.length;
		int nextRow = 0;

		for (int y = 0; y < rows; y++) {
			if (!isFullRow(y)) {
				for (int x = 0; x < cols; x++) {
					grid[x][nextRow] = grid[x][y];
				}
				nextRow++;
			}
		}

		for (int y = nextRow; y < rows; y++) {
			for (int x = 0; x < cols; x++) {
				grid[x][y] = false;
			}
		}
	}

	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	public boolean[][] getGrid() {
		return grid;
	}
	private boolean isFullRow(int row) {
		for (int x = 0; x < grid.length; x++) {
			if (!grid[x][row]) {
				return false;
			}
		}
		return true;
	}
}
