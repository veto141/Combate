package Pecas;

public class Bandeira {
	int[] pos = new int[2];
	String nome = "Bandeira";
	private int id = 100; 
	static int contiguais = 0;
	public Bandeira(){
		contiguais++;
	}
	
	void setPos(int a, int b) {
		pos[0] = a; //move em x
		pos[1] = b; //move em y
	}
}
