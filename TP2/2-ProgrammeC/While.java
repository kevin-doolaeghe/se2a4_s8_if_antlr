public class While extends Instruction {
	Instruction instruction1;
	Instruction instruction2;
    Instruction instruction3;
    Constante operation;
    int res;

    public While(Instruction i1, Instruction i2, Instruction i3, Constante op) { instruction1=i1; instruction2=i2; instruction3=i3; operation=op; }
	
	int execute(Env env) {
        switch (operation.execute(env)) {
        case 0:
		    while ((instruction1!=null ? instruction1.execute(env) : 0) != (instruction2!=null ? instruction2.execute(env) : 0)) {
			    res = (instruction3!=null ? instruction3.execute(env) : 0);
		    }
            return res;
        case 1:
		    while ((instruction1!=null ? instruction1.execute(env) : 0) == (instruction2!=null ? instruction2.execute(env) : 0)) {
			    res = (instruction3!=null ? instruction3.execute(env) : 0);
		    }
            return res;
        case 2:
		    while ((instruction1!=null ? instruction1.execute(env) : 0) > (instruction2!=null ? instruction2.execute(env) : 0)) {
			    res = (instruction3!=null ? instruction3.execute(env) : 0);
		    }
            return res;
        case 3:
		    while ((instruction1!=null ? instruction1.execute(env) : 0) < (instruction2!=null ? instruction2.execute(env) : 0)) {
			    res = (instruction3!=null ? instruction3.execute(env) : 0);
		    }
            return res;
        default:
            return 0;
        }
	}
}


