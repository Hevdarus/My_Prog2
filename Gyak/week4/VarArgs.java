class VarArgs{
	static void vaTest(int ... v){
		System.out.println("Number of args: " + v.length + ", contents: \n");

		for (var i : v)
			System.out.println(i + " ");
	}
	

	static void vaTest(boolean ... v){
		System.out.println("Number of args: " + v.length + ", contents: \n");

		for (var i : v)
			System.out.println(i + " ");
	}

	static void vaTest(String msg, boolean ... v){
		System.out.println(msg);
		System.out.println("Number of args: " + v.length + ", contents: \n");

		for (var i : v)
			System.out.println(i + " ");
	}


	public static void main(String[] args) {
		vaTest(10);
		vaTest(10, 20, 30, 40, 56);

		vaTest(true);
		vaTest(true, false, false);

		vaTest("Üzi", true);
		vaTest("Üzi", true, true);
	}
}