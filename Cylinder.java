
public class Cylinder extends Circle{
	
	private double length;
	public Cylinder() {
		
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
		return findArea() * getLength();
	}
}
