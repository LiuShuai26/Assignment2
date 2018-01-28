public class BeerSong {
	public static void ninety_Nine_Bottles_of_Beer(){
		int bottles = 99;
		while (bottles > 0){
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");
			bottles--;
			if (bottles > 0)	//print diffrent sentence when no more bottles on the wall
				System.out.println("take one down, pass it around, " + bottles + " bottles of beer on the wall");
			else
				System.out.println("take one down, pass it around, no more bottles of beer on the wall");
		}
	}
	public static void main(String []args){
		ninety_Nine_Bottles_of_Beer();
	}
}
