public class BeerSong{
	public static void ninety_Nine_Bottles_of_Beer(){
		int bottles = 99;
		while (bottles > 0){
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");
			bottles--;
			System.out.println("take one down, pass it around, " + bottles + " bottles of beer on the wall");
		}
	}
	public static void main(String []args){

	}
}