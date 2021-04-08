public class Constante extends Instruction {
	int valeur;
	public Constante(int val) { valeur=val; }
	
	int execute(Env env) {
		return valeur;
	}
}


