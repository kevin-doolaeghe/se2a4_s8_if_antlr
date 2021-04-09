
public class Affectation extends Instruction {
    String variable;
    Instruction expression;
    public Affectation(String v,Instruction e) { variable=v; expression=e; }

    int execute(Env env) {
    	int valeur= expression.execute(env);
    	env.put(variable, valeur);
    	return valeur;
    }
}



