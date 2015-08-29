package strategy;

/**
 * developed by BURHAN ARAS
 */
public class StrategyMain {

	public static void main(String[] args) {
		/* Here we have a simple sudoku solver */
		int[][] sudokuMatrix = new int[9][9];
		SudokuSolver sudokuSolver = new SudokuSolver(sudokuMatrix);

		/* We assign a strategy to the agent */
		sudokuSolver.setAlgorithm(new BrutForceAlgorithm());
		sudokuSolver.solve();

		/* We assign another strategy to the solver. that's the strategy pattern */
		sudokuSolver.setAlgorithm(new DepthFirstAlgorithm());
		sudokuSolver.solve();

		/*
		 * strategy pattern is easy. we change the algorithm using same agent
		 * again and again.
		 */
		sudokuSolver.setAlgorithm(new BreadthFirstAlgorithm());
		sudokuSolver.solve();

	}
	/**
	 * Bir işi yapmanın birden fazla yolu varsa sizin yapacağınız Strategy
	 * patterndir. Bu örnek programda çözmemiz gereken bir Sudoku oyunu var.
	 * Artifical Intelligence dersinden hatırlayacağınız üzere Depth-First,
	 * Breadth-First ve Brute Force gibi algoritmalar var. Biz yerine göre bu
	 * her üç algoritmayı da kullanarak sudokuyu çözelim istiyoruz. Her
	 * algoritma için yeni bir sudoku ojesi üretmemize gerek yok. Algoritma'yı
	 * interface olarak tanımlıyoruz. Sonra aklımıza gelen her yeni algoritmayı
	 * bu interface'i implemente edecek şekilde yazıyoruz. Son olarak ta
	 * SudokuSolver sınıfının içine set metodu ile inject ediyoruz. Bu şekilde
	 * SudokuSolver nesnesinin davranışını anlık olarak değiştirmiş oluyoruz.
	 * 
	 * Şimdi pür dikkat kesilin! Birazdan aklımıza yeni bir algoritma geldi.
	 * Hemen gidip Algorithm interface'ini implemente ederek yeni bir class
	 * yazıp, algoritmamızı içinde implemente ediyoruz. SudokuSolver'in içine
	 * set metoduyla bu yeni class türünden bir nesne veriyoruz.Olay halloldu.
	 * Fakat farkında olmadan Open-Closed prensibini de sağlamış olduk.
	 * 
	 * Open-Closed Prensip, "open to be extended closed to be changed"
	 * mottosuyla development hayatımıza renk katıyor. Yeni algoritmamızı
	 * geliştiriken hiçbirşeyi değiştirmedik, sadece interface'i implemente eden
	 * yani bir class yazdık.
	 */
}
