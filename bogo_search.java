import java.util.Random;
public class bogo_search {

	public static void main(String[] args) {
		//Best case: 1  Average case: N  Worst case: ∞ 
	}
	public static void bogo_search(int[] listity_list, int find){
		Random Random_value = new Random();
		boolean tf = true;
		while(tf == true){
			int listselection = Random_value.nextInt(listity_list.length);
			if (listity_list[listselection]==(find)){
				System.out.println("It is in "+(listselection+1));
				tf = false;
			}
		}
	}

}
