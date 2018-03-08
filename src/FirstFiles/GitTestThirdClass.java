class GitTestThirdClass{
	int num1, num2, sum, product;
	
	GitTestThirdClass(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	GitTestThirdClass(int num1) {
		this.num1 = num1;
		num2 = 10;
	}

	GitTestThirdClass() {
		num1 = 10;
		num2 = 20;
	}

	int calculateSumThirdClass() {
		sum = num1 + num2;
		return sum;
	}

	int caculateProductThirdClass() {
		product = num1 * num2;
		return product;
	}

	String toString() {
		System.out.println("The value of this object is num1: " + num1 + " , num2: " + num2);
	}
}