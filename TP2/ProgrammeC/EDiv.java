public class EDiv extends Instruction {
	Instruction instruction1;
	Instruction instruction2;
	public EDiv(Instruction i1, Instruction i2) { instruction1=i1; instruction2=i2; }
	
	int execute(Env env) {
		return instruction1.execute(env) / instruction2.execute(env);
	}
}

