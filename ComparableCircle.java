
public class ComparableCircle extends Circle implements CompareObject{
	
	public ComparableCircle(double radius) {
		super(radius);
	}
	@Override
	public int compareTo(Object o) {
		if(this == o) {
			return 0;
		}
		if(o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle)o;
			//方法1
			//			if(this.getRadius() > c.getRadius()) {
//				return 1;
//			}else if(this.getRadius() < c.getRadius()) {
//				return -1;
//			}else {
//				return 0;
//			}
			//方法2(else後同方法一)
			return this.getRadius().compareTo(c.getRadius());
 		}else {
 			//return 0;
 			throw new RuntimeException("傳入的數據類型不匹配");
 		}
	}

}
