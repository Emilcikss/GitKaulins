package Kladbishe;

import java.util.Random;

public class nodarbiba1 {
static void mestkaulinu(int reizes) {
	int sk;
	Random rand = new Random();
	for(int i=1; i<=reizes; i++) {
		sk = rand.nextInt(6)+1;
		System.out.println(sk + " - izkritusais skaitlis");
	}
	
}
	public static void main(String[] args) {
		mestkaulinu(5);
	}
}
