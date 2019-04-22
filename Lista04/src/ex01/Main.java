package ex01;

public class Main {

	public static void main(String[] args) {
		
		//vetor de 10 posições
		Animal meusAnimais[] = new Animal[10];
		
		meusAnimais[0] = new Homem();
		meusAnimais[1] = new Cao();
		meusAnimais[2] = new Homem();
		meusAnimais[3] = new Homem();
		meusAnimais[4] = new Cao();
		meusAnimais[5] = new Gato();
		meusAnimais[6] = new Gato();
		meusAnimais[7] = new Cao();
		meusAnimais[8] = new Homem();
		meusAnimais[9] = new Homem();
		
		for (Animal animal : meusAnimais) {
			System.out.println("Animal falando: " + animal.fala());
		}
	}

}
