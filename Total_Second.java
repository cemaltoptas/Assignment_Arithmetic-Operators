package assignment3;

public class Total_Second {

	public static void main(String[] args) {
		
		/*
		  outputs the number of hours, minutes, and seconds 
		  that corresponds to input total seconds.
		 */
		
		int inputSeconds=3695 ;
		int hours=inputSeconds/3600;
		int minutes= (inputSeconds%3600)/60;
		int seconds =(inputSeconds%3600)%60; 
		
		System.out.println(hours + " Hour, " + minutes + " minutes, " + seconds + " seconds");
		

	}

}
