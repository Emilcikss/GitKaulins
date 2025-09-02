package Kladbishe;

import java.util.Random;

public class nodarbiba1 {
static void mestkaulinu() {
	int sk;
	Random rand = new Random();
	sk = rand.nextInt(6)+1;
	System.out.println(sk + " - izkritusais skaitlis");
}
	public static void main(String[] args) {
		mestkaulinu();
	}
}
