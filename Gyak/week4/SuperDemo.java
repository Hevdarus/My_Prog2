
class Box{
	private double length;
	private double width;
	private double heigth;

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

	BoxWeigth(){
		super();
		weigth = 0;
	}

	BoxWeigth(BoxWeigth ob){
		super(ob);
		weigth = ob.weigth;
	}

	BoxWeigth(double w, double l, double h, double m){
		super(l, w, h);
		weigth = m;
	}

	BoxWeigth(double len, double m){
		super(len);
		weigth = m;
	}
}


class SuperDemo{
	public static void main(String[] args) {


		double vol = 0;

		BoxWeigth weigthBox1 = new BoxWeigth(10, 20, 30, 5.5);
		
		vol = weigthBox1.volume();
		System.out.println("weigthBox1 vol: " + vol);
		System.out.println("weigthBox1 weigth: " + weigthBox1.weigth);

		BoxWeigth weigthBox2 = new BoxWeigth();
		
		vol = weigthBox2.volume();
		System.out.println("weigthBox2 vol: " + vol);
		System.out.println("weigthBox2 weigth: " + weigthBox2.weigth);

		BoxWeigth weigthBox3 = new BoxWeigth(10, 8.4);
		
		vol = weigthBox3.volume();
		System.out.println("weigthBox3 vol: " + vol);
		System.out.println("weigthBox3 weigth: " + weigthBox3.weigth);

		BoxWeigth weigthBox4 = new BoxWeigth(weigthBox1);
		
		vol = weigthBox4.volume();
		System.out.println("weigthBox4 vol: " + vol);
		System.out.println("weigthBox4 weigth: " + weigthBox4.weigth);
	}
}