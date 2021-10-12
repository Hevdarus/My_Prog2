package myPack;

class Balance{
	String name;
	double bal;

	Balance (String n, double b){
		name = n;
		bal = b;
	}

	void show(){
		if(bal < 0)
			System.out.println("-->");
		System.out.println(name + ": $" + bal);		

	}
}

class AccountTest{
	public static void main(String[] args) {
		
		Balance current[] = new Balance[3];

		current[0] = new Balance("Attila", 100.4);
		current[1] = new Balance("József", 200.68);
		current[2] = new Balance("Sándor", 420.69);

		for(int i = 0; i < 3; i++ ){
			current[i].show();
		}

	}
}