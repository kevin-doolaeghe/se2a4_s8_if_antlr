
public class Variable extends Instruction {
	String variable;
	public Variable(String var) { variable=var; }
	
	int execute(Env env) {
		return env.get(variable);
	}
}

