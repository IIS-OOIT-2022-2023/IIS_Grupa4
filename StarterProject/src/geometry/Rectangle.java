package geometry;

public class Rectangle {
	private Point upperLeftPoint;
	private int height;
	private int width;
	private boolean selected;

	public Rectangle () {
		 this.upperLeftPoint = new Point();
	}

	public Rectangle(Point upperLeftPoint, int height, int width)  {
		this.upperLeftPoint = upperLeftPoint;
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(Point upperLeftPoint, int height, int width, boolean selected) {
		this(upperLeftPoint, height, width);
		this.selected = selected;
	}

	public double area() {
		return (this.height * this.width);
	}

	public double circumference() {
		return 2*(this.height + this.width);
	}

	public Point getUpperLeftPoint() {
		return this.upperLeftPoint;
	}

	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isSelected() {
		return this.selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean contains(int x, int y) {
		return (x > this.upperLeftPoint.getX() && x < this.upperLeftPoint.getX() + this.width &&
				y > this.upperLeftPoint.getY() && y < this.upperLeftPoint.getY() + this.height);
	}

	public boolean contains(Point click) {
		return contains(click.getX(), click.getY());
	}
	
	@Override
	public String toString() {
		//return "Upper left point: (" + this.upperLeftPoint.getX() + "," + this.upperLeftPoint.getY() + "), width = "+ this.width + ", height = "+ this.height;
		return "Upper left point: " + this.upperLeftPoint + ", width = "+ this.width + ", height = "+ this.height;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Rectangle) {
			Rectangle r = (Rectangle)o;
			return (r.getUpperLeftPoint().equals(this.upperLeftPoint) &&
					r.getHeight() == this.height && r.getWidth() == this.width);
		} else {
			return false;
		}
	}
}
