package SLR;

public class SimpleLinearRegression {
	
	BenettonDataSet dataSet = new BenettonDataSet();
	
	private double beta_0 = 0;
	private double beta_1 = 0;
	
	
	public void regresionEqueation(int advertisting) {
		
		LinearRegression();
		double sale = beta_0 + (beta_1 * advertisting);
		System.out.println("sale = " + String.format("%.4f", beta_0) + " + " + String.format("%.4f", beta_1) + " * " + advertisting);
		System.out.printf("sale = %.4f ", sale);

	}
	
	private void LinearRegression() {
		int sigma_x = sigma(dataSet.advertisting);
		int sigma_y = sigma(dataSet.sale);
		int sigma_xy = sigma(dataSet.advertisting, dataSet.sale);
		int sigma_xp = sigma_pow(dataSet.advertisting);
		int n = dataSet.sale.length;
		
		beta_1 = (n * sigma_xy) - (sigma_x * sigma_y);
		beta_1 = beta_1 / ((n * sigma_xp) - (sigma_x * sigma_x));
		
		beta_0 = sigma_y - (beta_1 * sigma_x);
		beta_0 = beta_0 / n;
	}
	
	private int sigma(int[] x) {
		int sum = 0;
		for(int i = 0; i < x.length; i++) sum = sum + x[i];
		return sum;
	}
	
	private int sigma(int[] x, int[] y) {
		int sum = 0;
		for(int i = 0; i < x.length; i++) sum = sum + (x[i] * y[i]);
		return sum;
	}
	
	private int sigma_pow(int[] x) {
		int sum = 0;
		for(int i = 0; i < x.length; i++) sum = sum + (x[i] * x[i]);
		return sum;
	}
}
