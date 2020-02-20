package CleanCode.CleanCode;

public class HouseConstructionExample {
		double p=0;
		double cost(String s,double r,String y) {
			if (s.equals("STANDARD MATERIALS")) {
				p=p+(1200*r);
				}
			else if (s.equals("ABOVE STANDARD MATERIALS")) {
				p=p+(1500*r);
				} else {
				if (y.equals("FULLY AUTOMATED HOME" )) {
					p=p+(2500*r);
				}
				else {
					p=p+(1800*r);
				}
				
			}
			return(p);	
		}

	}



