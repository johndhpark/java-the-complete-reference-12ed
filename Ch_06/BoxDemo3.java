class Box {
	double width;
	double height;
	double depth;

	void volume() {
		double vol = width * height * depth;
		System.out.println("The volume is: " + vol);
	}
}

class BoxDemo3 {
	public static void main(String[] args) {
		Box myBox = new Box();

		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 30;

		myBox.volume();
	}
}