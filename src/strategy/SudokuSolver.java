package strategy;

/**
 * developed by BURHAN ARAS
 */
public class SudokuSolver {

	private int[][] sudokuMatrix;
	private Algorithm algorithm;

	public SudokuSolver(int[][] sudokuMatrix) {
		this.sudokuMatrix = sudokuMatrix;
	}

	public void setAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;

	}

	public void solve() {
		if(algorithm == null){
			System.out.println("Please sen an algorithm as a strategy using setAlgorithm() method.");
			return;
		}
		this.algorithm.execute();
	}

}
