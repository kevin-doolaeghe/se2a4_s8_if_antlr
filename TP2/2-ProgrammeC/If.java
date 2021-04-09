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
		    if ((instruction1!=null ? instruction1.execute(env) : 0) != (instruction2!= null ? instruction2.execute(env) : 0)) {
			    return instruction3!=null ? instruction3.execute(env) : 0;
		    }
		    else {
			    return instruction4!=null ? instruction4.execute(env) : 0;
		    }
        case 1:
		    if ((instruction1!=null ? instruction1.execute(env) : 0) == (instruction2!= null ? instruction2.execute(env) : 0)) {
			    return instruction3!=null ? instruction3.execute(env) : 0;
		    }
		    else {
			    return instruction4!=null ? instruction4.execute(env) : 0;
		    }
        case 2:
		    if ((instruction1!=null ? instruction1.execute(env) : 0) > (instruction2!= null ? instruction2.execute(env) : 0)) {
			    return instruction3!=null ? instruction3.execute(env) : 0;
		    }
		    else {
			    return instruction4!=null ? instruction4.execute(env) : 0;
		    }
        case 3:
		    if ((instruction1!=null ? instruction1.execute(env) : 0) < (instruction2!= null ? instruction2.execute(env) : 0)) {
			    return instruction3!=null ? instruction3.execute(env) : 0;
		    }
		    else {
			    return instruction4!=null ? instruction4.execute(env) : 0;
		    }
        default:
            return 0;
        }
	}
}


