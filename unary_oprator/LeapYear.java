class LeapYear{
		
  	public static void main(String[] args){

		int leap=100;
		String l="Leap year";
		String lpn="Not A leap year";
String res = (leap % 4 == 0 && (leap % 100 != 0 || leap % 400 == 0)) ? l : lpn;				
	System.out.println(res);
}
}