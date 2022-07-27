class Box {
	double width;
	double height;
	double depth;

	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxDemo5 {
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.setDim(10d, 20d, 30d);

		double vol = myBox.volume();

		System.out.println("The volume is: " + vol);
	}
}