class Box {
	double width;
	double height;
	double depth;

	Box() {
		width = 10;
		height = 10;
		depth = 10;
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

class BoxDemo6 {
	public static void main(String[] args) {
		Box myBox = new Box();
		double vol = myBox.volume();
		System.out.println("My volume is: " + vol);

		myBox.setDim(10, 20, 30);
		vol = myBox.volume();
		System.out.println("My volume is: " + vol);
	}
}