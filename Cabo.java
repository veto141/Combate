package Pecas;

public class Cabo {
	int[] pos = new int[2];
	String nome = "Cabo";
	private int id = 3; 
	static int contiguais = 0;
	public Cabo(){
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
	
	void desarmaBomba(int idpeca) {
		if(idpeca == 69) {
			//aqui vamo apagar a bomba quando criada;
		}
	}
	
	int[] getPos() {
		return pos;
	}
	
	int getId() {
		return id;
	}
}
