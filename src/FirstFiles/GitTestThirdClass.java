class GitTestThirdClass{
	int num1, num2, sum;
	
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
}