class A{
	void callMe(){
		System.out.println("This is A's callMe");
	}
}

class B extends A{
	void callMe(){
		System.out.println("This is B's callMe");
	}
}

class C extends B{
	void callMe(){
		System.out.println("This is C's callMe");
	}
}

class Dispatch{
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();

		A r;
		r = a;
		r.callMe();
		
		r = b;
		r.callMe();

		r = c;
		r.callMe();
	}
}