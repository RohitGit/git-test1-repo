class GitTestFirstClass{
	public static void main(String[] args) {
		System.out.println("GitTestFirstClass");
		System.out.println("Hello GIT!");

		GitTestSecondClass gTSC1 = new GitTestSecondClass(1, "Hello G");
		gTSC1.printGitTestSecondClass();

		GitTestSecondClass gTSC1 = new GitTestSecondClass(2, "zero");
		int val = gTSC1.getA();
		System.out.println("value of A is " + val);

		GitTestThirdClass gTTC1 = new GitTestThirdClass(5, val);
		System.out.println("SUM is " + gTTC1.calculateSumThirdClass());

		GitFirstNewFeature gFNF1 = new GitFirstNewFeature();
		int sqr = gFNF1.calculateSquare(3);
		System.out.println("Square is " + sqr);
	}	
}