package dfs_and_bfs;

public class NumberOfIsland_dfs {

	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '0', '0', '0' }, 
						  { '1', '1', '0', '0', '0' }, 
						  { '0', '0', '1', '0', '0' },
						  { '0', '0', '0', '1', '1' } };

		NumberOfIsland_dfs a = new NumberOfIsland_dfs();
		a.print(grid);
		System.out.println("result : " + a.solve(grid));

	}

	public int solve(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

		int count = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					count++;
					dfs(grid, i, j);
				}
			}
		}
		System.out.println("----------------");
		print(grid);
		return count;
	}

	public void dfs(char[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;

		grid[i][j] = 'X';

		dfs(grid, i - 1, j);
		dfs(grid, i + 1, j);
		dfs(grid, i, j - 1);
		dfs(grid, i, j + 1);

	}

	public void print(char[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}

}
