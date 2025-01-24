package JavaPractice;

public class ReviseArmstrong {

	public static void main(String[] args) {

		// 153 - 1*1*1 + 5*5*5 + 3*3*3 - 1 +125+ 27 = 153
		
		isArmstrong(153);
		isArmstrong(253);


	}

	public static void isArmstrong(int num) {
		  int r;
		  int cube = 0;
		  int t;
		  
		  t=num;
		  while(num>0) {
			  r = num%10;
			  num = num/10;
			  cube = cube+(r*r*r);
		  }
		  if(t==cube) {
			  System.out.println("This is Armstrong number ");
		  }else {
			  System.out.println( "This is not an Armstrong number ");

		  }
	}

}
