class Box {
	double width;
	double height;
	double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxDemo7 {
	public static void main(String[] args) {
		Box myBox = new Box(10, 20, 30);
		double vol = myBox.volume();
		System.out.println("My volume is: " + vol);

		myBox.setDim(40, 50, 60);
		vol = myBox.volume();
		System.out.println("My volume is: " + vol);
	}
}