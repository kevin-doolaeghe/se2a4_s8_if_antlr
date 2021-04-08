public class If extends Instruction {
	Instruction instruction1;
	Instruction instruction2;
	public If(Instruction i1, Instruction i2) { instruction1=i1; instruction2=i2; }
	
	int execute(Env env) {
		if (0 != instruction1.execute(env)) {
			return instruction2.execute(env);
		}
		else {
			return 0;
		}
	}
}


