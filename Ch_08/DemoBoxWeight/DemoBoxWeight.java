// This program uses inheritance to extend Box

class Box {
	double width;
	double height;
	double depth;

	// construct clone of object
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor used when all dimensions have been specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// constructor used when no dimensions specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// constructor used when creating a cube
	Box(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Here, Box is extended to include weight

class BoxWeight extends Box {
	double weight;

	BoxWeight(double w, double h, double d, double m) {
		weight = w;
		height = h;
		depth = d;
		weight = m;
	}
}

class DemoBoxWeight {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

		System.out.println("Volume of mybox1 is: " + mybox1.volume());
		System.out.println("Weight of mybox1 is: " + mybox1.weight);

		System.out.println("Volume of mybox2 is: " + mybox2.volume());
		System.out.println("Weight of mybox2 is: " + mybox2.volume());
	}
}