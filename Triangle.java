package session11;

//This is child class named as Triangle. It has Abstract method inherited from Shape.


class Triangle extends Shape {
	//This method calculates the area for Triangle. It takes height & base as parameters.
	public int printArea(int height, int base) {
		int area = (height * base) / 2;
		return area;
	}

	@Override
	protected float printArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
