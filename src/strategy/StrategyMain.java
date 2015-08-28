package strategy;

/**
 * developed by BURHAN ARAS
 */
public class StrategyMain {

	public static void main(String[] args) {
		/*Here we have a simple sudoku solver*/
		int [][]sudokuMatrix = new int[9][9];
		SudokuSolver sudokuSolver = new SudokuSolver(sudokuMatrix);
		
		/*We assign a strategy to the agent*/
		sudokuSolver.setAlgorithm(new BrutForceAlgorithm());
		sudokuSolver.solve();
		
		/*We assign another strategy to the solver. that's the strategy pattern*/
		sudokuSolver.setAlgorithm(new DepthFirstAlgorithm());
		sudokuSolver.solve();
		
		/*strategy pattern is easy. we change the algorithm using same agent again and again. */
		sudokuSolver.setAlgorithm(new BreadthFirstAlgorithm());
		sudokuSolver.solve();
		
	}
}
