class FiboFormula {
	public static void main(String[] args) {

		for(int i = 0 ; i< 11 ; i++) {
			System.out.println(fibo(i));
		}

	}
	static int fibo(int n) {
		return (int)((Math.pow(((1 + Math.sqrt(5)) / 2 ) ,n) - Math.pow(((1 - Math.sqrt(5)) /2), n)) / Math.sqrt(5));
	}
}