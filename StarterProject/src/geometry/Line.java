package geometry;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private boolean selected;

	
	public Line() {
		this.startPoint = new Point();
		this.endPoint = new Point();
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	
	public Point getStartPoint() {
		return this.startPoint;
	}
	
	public void setStartPoint(Point point) {
		this.startPoint = point;
	}
	
	public Point getEndPoint() {
		return this.endPoint;
	}
	
	public void setEndPoint(Point point) {
		this.endPoint = point;
	}
	
	public boolean isSelected() {
		return this.selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public double length() {
		//duzinu linije racunamo kao udaljenost endPoint tacke i startPoint tacke
		//koristimo distance metodu definisanu u Point klasi
		return this.endPoint.distance(this.startPoint);
	}
	
	@Override
	public String toString() {
		//return "("+this.startPoint.getX()+","+this.startPoint.getY()+")"+"--> ("+this.endPoint.getX()+","+this.endPoint.getY()+")";
		return this.startPoint + "-->" + this.endPoint;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line l = (Line)obj;
			return (this.getStartPoint().equals(l.getStartPoint()) && this.getEndPoint().equals(l.getEndPoint()));
		}else {
			return false;
		}
	}

	
	
}
