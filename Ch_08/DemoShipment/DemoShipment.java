// A complete implementation of BoxWeight.
class Box {
	private double width;
	private double height;
	private double depth;

	// construct clone of an object
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// consturctor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// constructor used when no dimensions specified
	Box() {
		width = height = depth = -1;
	}

	// constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return height * width * depth;
	}
}

class BoxWeight extends Box {
	double weight;

	// construct clone of an object
	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	// constructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}

	// default constructor
	BoxWeight() {
		super();
		weight = -1;
	}

	// constructor used when cube is created
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

class Shipment extends BoxWeight {
	double cost;

	// construct clone of an object
	Shipment(Shipment ob) {
		super(ob);
		cost = ob.cost;
	}

	// construct all parameters are specified
	Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m);
		cost = c;
	}

	// default constructor
	Shipment() {
		super();
		cost = -1;
	}

	// Shipment when cube is created
	Shipment(double l, double m, double c) {
		super(l, m);
		cost = -1;
	}
}

class DemoShipment {
	public static void main(String[] args) {
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

		double vol;

		vol = shipment1.volume();
		System.out.println("Volumen of shipment1 is " + vol);
		System.out.println("Weight of shipment1 is " + shipment1.weight);
		System.out.println("Shipping cost: $" + shipment1.cost);
		System.out.println();

		vol = shipment2.volume();
		System.out.println("Volume of shipment2 is " + vol);
		System.out.println("Weight of shipment2 is " + shipment2.weight);
		System.out.println("Shipping cost: $" + shipment2.cost);
	}
}