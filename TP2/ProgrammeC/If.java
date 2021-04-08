public class If extends Instruction {
	Instruction instruction1;
	Instruction instruction2;
    Instruction instruction3;
    Instruction instruction4;
    Constante operation;

    public If(Instruction i1, Instruction i2, Instruction i3, Instruction i4, Constante op) { instruction1=i1; instruction2=i2; instruction3=i3; instruction4=i4; operation=op; }
	
	int execute(Env env) {
        switch (operation.execute(env)) {
        case 0:
		    if (instruction1.execute(env) == instruction2.execute(env)) {
			    return instruction3.execute(env);
		    }
		    else {
			    return instruction4.execute(env);
		    }
        case 1:
		    if (instruction1.execute(env) != instruction2.execute(env)) {
			    return instruction3.execute(env);
		    }
		    else {
			    return instruction4.execute(env);
		    }
        case 2:
		    if (instruction1.execute(env) > instruction2.execute(env)) {
			    return instruction3.execute(env);
		    }
		    else {
			    return instruction4.execute(env);
		    }
        case 3:
		    if (instruction1.execute(env) < instruction2.execute(env)) {
			    return instruction3.execute(env);
		    }
		    else {
			    return instruction4.execute(env);
		    }
        default:
            return 0;
        }
	}
}


