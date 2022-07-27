class Box {
	double width;
	double height;
	double depth;

	double volume() {
		return width * height * depth;
	}
}

class BoxDemo4 {
	public static void main(String[] args) {
		Box myBox = new Box();

		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 30;

		double vol = myBox.volume();

		System.out.println("The volume is: " + vol);
	}
}