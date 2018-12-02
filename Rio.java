package Pecas;

public class Rio {
	int[] pos = new int[2];
	String nome = "Rio";
	private int id = 37; 
	static int contiguais = 0;
	public Rio(){
		contiguais++;
	}
	
	void setPos(int a) {
		pos[0] = a; //move em x
		pos[1] = 2; //move em y(só spawna no meio então é 2)
	}
	
	int[] getPos() {
		return pos;
	}
	
	int getId() {
		return id;
	}
}
