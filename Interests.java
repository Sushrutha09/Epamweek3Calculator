package CleanCode.CleanCode;
import java.io.*;
import java.lang.*;
public class Interests {
	public  float SimpleInterests(float pin,float  ti,float re ) {
		float x=(pin*ti*re)/100;
		return x;
	}
	public double  CompoundInterests(double pin,double  ti,double  re ) {
		double  x=pin*(Math.pow((1+(ti/100)),re));
		x=x-pin;
		return x;
	}
}





