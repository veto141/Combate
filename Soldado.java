package Pecas;

public class Soldado {
	int[] pos = new int[2];
	String nome = "Soldado";
	private int id = 2; 
	static int contiguais = 0;
	public Soldado(){
		contiguais++;
	}
	
	void setPos(int a, int b) {
		pos[0] = a; //move em x
		pos[1] = b; //move em y
	}
	
	void andaFrente() { //caso id seja agua nao anda.
		if(pos[1]>=1) {
			pos[1] = pos[1] - 1;
		}
	}
	
	void andaTras() {
		if(pos[1]<=3) {
			pos[1] = pos[1] + 1;
		}
	}
	
	void andaEsq() {
		if(pos[0]>=1) {
			pos[0] = pos[0] - 1;
		}
	}
	
	void andaDir() {
		if(pos[1]<=3) {
			pos[0] = pos[0] + 1;
		}
	}
	
	void dashFrente(int casas) {
		if(pos[1]>=casas) {
			pos[1] = pos[1] - casas;
		}
	}
	
	void dashTras(int casas) {
		if(pos[1]<=(4-casas)) {
			pos[1] = pos[1] + casas;
		}
	}
	
	void dashEsq(int casas) {
		if(pos[0]>=casas) {
			pos[0] = pos[0] - casas;
		}
	}
	
	void dashDir(int casas) {
		if(pos[1]<=(4-casas)) {
			pos[0] = pos[0] + casas;
		}
	}
	
	int[] getPos() {
		return pos;
	}
	
	int getId() {
		return id;
	}
}
