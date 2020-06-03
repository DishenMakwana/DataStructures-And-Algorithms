package map;

import java.util.*;

public class HashCodeAndEqulas {

	public static void main(String[] args) {
		car c1=new car("OD",20);
		car c2=new car("maruti",33);
		car c3=new car("OD",20);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		

	}

	
}
class car
{
	String name ;
	int avg;
	public car(String name, int avg) {
		this.name = name;
		this.avg = avg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avg;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		car other = (car) obj;
		if (avg != other.avg)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}