
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


class BoxWeigth extends Box{

	double weigth;

	BoxWeigth(double w, double l, double h, double m){
		super(l, w, h);
		weigth = m;
	}
}


class BoxDemoWeigth{
	public static void main(String[] args) {


		BoxWeigth weigthBox = new BoxWeigth(10, 20, 30, 5.5);
		Box plainBox = new Box();
		
		
		double vol = weigthBox.volume();
		System.out.println("box1 vol: " + vol);
		System.out.println("box1 weigth: " + weigthBox.weigth);


		plainBox = weigthBox;

		vol = plainBox.volume();
		System.out.println("box2 vol: " + vol);
		//System.out.println("box2 weigth: " + plainBox.weigth);
	
		weigthBox = plainBox;
		System.out.println("box1 vol: " + vol);
		System.out.println("box1 weigth: " + weigthBox.weigth);



	}
}