class Box{
	double length;
	double width;
	double heigth;

	double volume(){
		return length * width * heigth;
	}

	Box(){
		length = 0;
		width = 0;
		heigth = 0;
	}

	Box(Box ob){
		this.length = ob.length;
		this.width = ob.width;
		this.heigth = ob.heigth;
	}

	Box(double len){
		length = width = heigth = len;
	}

	Box(double length, double width, double heigth){
		this.length = length;
		this.width = width;
		this. heigth = heigth;
	}

	void setDim(double w, double l, double h){
		length = l;
		width = w;
		heigth = h;

	}

	void setDim(double len){
		length = width = heigth = len;
	}
}


class BoxDemo{
	public static void main(String[] args) {
		
		Box myBox1 = new Box();

		myBox1.length = 10;
		myBox1.heigth = 20;
		myBox1.width = 30;

		//double vol = myBox1.length * myBox1.heigth * myBox1.width;

		double vol = myBox1.volume();

		System.out.println("Volume of myBox1 is " + vol);

		Box myBox2 = new Box(myBox1);
		System.out.println("Volume of myBox2 is " + myBox2.volume());

		Box myBox3 = new Box(10.0);
		System.out.println("Volume of myBox3 is " + myBox3.volume());

		Box myBox4 = new Box(10.0, 15.0, 25.0);
		System.out.println("Volume of myBox4 is " + myBox4.volume());

		myBox4.setDim(30.0);
		System.out.println("Volume of myBox4 is " + myBox4.volume());

		myBox4.setDim(20.0, 25.0, 30.0);
		System.out.println("Volume of myBox4 is " + myBox4.volume());


	}
}