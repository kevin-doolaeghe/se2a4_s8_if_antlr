import java.util.HashMap;

public class Env {
	HashMap<String, Integer> variables = new HashMap<String, Integer>();
	
	public int get(String variable) {return this.variables.get(variable); }
	public void put(String variable, int valeur) {this.variables.put(variable, valeur); }
}

