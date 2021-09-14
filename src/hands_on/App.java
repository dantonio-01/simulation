package hands_on;


import SLR.SimpleLinearRegression;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		SimpleLinearRegression slr = new SimpleLinearRegression();
		Scanner sr = new Scanner(System.in);
		slr.regresionEqueation(sr.nextInt());
		sr.close();
	}
}