
class Box{
	double length;
	double width;
	double heigth;

	double volume(){
		return length * width * heigth;
	}

	Box(){
		length = -1;
		width = -1;
		heigth = -1;
		System.out.println("Box() constructor");
	}

	Box(Box ob){
		this.length = ob.length;
		this.width = ob.width;
		this.heigth = ob.heigth;
	}

	Box(double len){
		length = width = heigth = len;
		System.out.println("Box(1) constructor");
	}

	Box(double length, double width, double heigth){
		this.length = length;
		this.width = width;
		this. heigth = heigth;
		System.out.println("Box constructor");
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
		weigth = -1;
		System.out.println("BoxWeigth() constructor");
	}

	BoxWeigth(double l, double w, double h, double m){
		super(l, w, h);
		weigth = m;
		System.out.println("BoxWeigth constructor");
	}

	BoxWeigth(BoxWeigth ob){
		super(ob);
		this.weigth = ob.weigth;
	}

	BoxWeigth(double len, double w){
		super(len);
		this.weigth = w;
		System.out.println("BoxWeigth(2) constructor");
	}
}

class Shipment extends BoxWeigth{

	double cost;

	Shipment(Shipment ob){
		super(ob);
		this.cost = ob.cost;
		System.out.println("Shipment \'copy\'");
	}

	Shipment(){
		super();
		cost = -1;
		System.out.println("Shipment() constructor");
	}

	Shipment(double l, double w, double h, double m, double c){
		super(l, w, h, m);
		cost = c;
		System.out.println("Shipment constructor");

	}
	Shipment(double l, double m, double c){
		super(l, m);
		cost = c;
		System.out.println("Shipment(3) constructor");
	}
}


class DemoShpiment{
	public static void main(String[] args) {

	Shipment ship1 = new Shipment(10, 20, 30, 10, 3.14);
	Shipment ship2 = new Shipment(10, 15, 20, 25, 50);

	double vol;

	vol = ship1.volume();

	System.out.println("Ship1 volume: " + vol);
	System.out.println("Ship1 weigth: " + ship1.weigth);
	System.out.println("Ship1 cost: " + ship1.cost);		

	vol = ship2.volume();

	System.out.println("Ship2 volume: " + vol);
	System.out.println("Ship2 weigth: " + ship2.weigth);
	System.out.println("Ship2 cost: " + ship2.cost);

	Shipment ship3 = new Shipment();

	}
}