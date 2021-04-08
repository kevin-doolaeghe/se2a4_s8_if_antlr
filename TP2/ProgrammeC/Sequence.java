public class Sequence extends Instruction {
	Instruction instruction1;
	Instruction instruction2;
	public Sequence(Instruction i1, Instruction i2) { instruction1=i1; instruction2=i2; }
	
	int execute(Env env) {
		int ignore = instruction1.execute(env);
		return instruction2.execute(env);
	}
}

