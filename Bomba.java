package Pecas;

public class Bomba {
	int[] pos = new int[2];
	String nome = "Bomba";
	private int id = 69; 
	static int contiguais = 0;
	public Bomba(){
		contiguais++;
	}
	
	void setPos(int a, int b) {
		pos[0] = a; //move em x
		pos[1] = b; //move em y
	}
	
	int[] getPos() {
		return pos;
	}
	
	int getId() {
		return id;
	}
}

