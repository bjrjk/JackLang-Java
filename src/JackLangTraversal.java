import java.util.*;
import java.lang.*;

public class JackLangTraversal extends JackLangBaseVisitor<Integer> {
	private HashMap<String,JackLangParser.FunctionContext> functionList=new HashMap<String,JackLangParser.FunctionContext>();
	private ArrayList<JackLangParser.FunctionContext> traceStack=new ArrayList<JackLangParser.FunctionContext>();
	private ArrayList<HashMap<String, Object>> runtimeStack=new ArrayList<HashMap<String,Object>>();
	private HashMap<String,Object> globalMemory=new HashMap<String,Object>();
	private Scanner scanner=new Scanner(System.in);
	
	private void printTraceStack() {
		System.err.println("Tracestack:");
		for(int i=traceStack.size()-1;i>=0;i--) {
			System.err.printf("at %s %s(%s)\n", 
					traceStack.get(i).BASICTYPE().getText(),
					traceStack.get(i).IDENTIFIER().getText(),
					traceStack.get(i).parameters()!=null?traceStack.get(i).parameters().getText():""
					);
		}
	}
	private void throwError(String errMessage){
		System.err.println(errMessage);
		printTraceStack();
		System.exit(1);
	}
	
	private HashMap<String, Object> createRuntimeStorage(){
		if(runtimeStack.size()>250)throwError("RuntimeError: StackOverFlow: More than 250 Function Calls.");
		HashMap<String, Object> retVal=new HashMap<String, Object>();
		return retVal;
	}
	private void popRuntimeStorage(){
		if(runtimeStack.size()==0)throwError("RuntimeError: Stack is already Empty, Unable to Pop Runtime Stack.");
		runtimeStack.remove(runtimeStack.size()-1);
	}
	
	private Integer getIntegerValue(String key) {
		HashMap<String, Object> curStack=runtimeStack.get(runtimeStack.size()-1);
		if(curStack.containsKey(key)) {
			if(curStack.get(key) instanceof Integer) {
				return (Integer)curStack.get(key);
			}else {
				throwError("RuntimeError: "+key+" variable(get) in current function scope isn't an Integer!");
				return null;
			}
		}else if(globalMemory.containsKey(key)) {
			if(globalMemory.get(key) instanceof Integer) {
				return (Integer)globalMemory.get(key);
			}else {
				throwError("RuntimeError: "+key+" variable(get) in global scope isn't an Integer!");
				return null;
			}
		}else {
			throwError("RuntimeError: "+key+" variable(get) neither defined in current function scope or global scope!");
			return null;
		}
	}
	private void setIntegerValue(String key, Integer value) {
		HashMap<String, Object> curStack=runtimeStack.get(runtimeStack.size()-1);
		if(curStack.containsKey(key)) {
			if(curStack.get(key) instanceof Integer) {
				curStack.put(key, value);
			}else {
				throwError("RuntimeError: "+key+" variable(set) in current function scope isn't an Integer!");
			}
		}else if(globalMemory.containsKey(key)) {
			if(globalMemory.get(key) instanceof Integer) {
				globalMemory.put(key, value);
			}else {
				throwError("RuntimeError: "+key+" variable(set) in global scope isn't an Integer!");
			}
		}else {
			throwError("RuntimeError: "+key+" variable(set) neither defined in current function scope or global scope!");
		}
	}
	private Integer getArrayValue(String key,int index) {
		HashMap<String, Object> curStack=runtimeStack.get(runtimeStack.size()-1);
		if(curStack.containsKey(key)) {
			if(curStack.get(key) instanceof ArrayList) {
				if(index<((ArrayList)curStack.get(key)).size())
					return (Integer)((ArrayList)curStack.get(key)).get(index);
				else{
					throwError("RuntimeError: "+key+"["+index+"]"+" variable(get) in current function scope is Out of Bound!");
					return null;
				}
			}else {
				throwError("RuntimeError: "+key+" variable(get) in current function scope isn't an Array!");
				return null;
			}
		}else if(globalMemory.containsKey(key)) {
			if(globalMemory.get(key) instanceof ArrayList) {
				if(index<((ArrayList)globalMemory.get(key)).size())
					return (Integer)((ArrayList)globalMemory.get(key)).get(index);
				else{
					throwError("RuntimeError: "+key+"["+index+"]"+" variable(get) in global scope is Out of Bound!");
					return null;
				}
			}else {
				throwError("RuntimeError: "+key+" variable(get) in global scope isn't an Array!");
				return null;
			}
		}else {
			throwError("RuntimeError: "+key+" Array(get) neither defined in current function scope or global scope!");
			return null;
		}
	}
	private void setArrayValue(String key, int index, Integer value) {
		HashMap<String, Object> curStack=runtimeStack.get(runtimeStack.size()-1);
		if(curStack.containsKey(key)) {
			if(curStack.get(key) instanceof ArrayList) {
				if(index<((ArrayList)curStack.get(key)).size())
					((ArrayList)curStack.get(key)).set(index, value);
				else 
					throwError("RuntimeError: "+key+"["+index+"]"+" variable(set) in current function scope is Out of Bound!");
			}else {
				throwError("RuntimeError: "+key+" variable(set) in current function scope isn't an Array!");
			}
		}else if(globalMemory.containsKey(key)) {
			if(globalMemory.get(key) instanceof ArrayList) {
				if(index<((ArrayList)globalMemory.get(key)).size())
					((ArrayList)globalMemory.get(key)).set(index, value);
				else 
					throwError("RuntimeError: "+key+"["+index+"]"+" variable(set) in global scope is Out of Bound!");
			}else {
				throwError("RuntimeError: "+key+" variable(set) in global scope isn't an Array!");
			}
		}else {
			throwError("RuntimeError: "+key+" Array(set) neither defined in current function scope or global scope!");
		}
	}
	
	private int readInt(){
		if(!scanner.hasNextInt())throwError("RuntimeError: Unable to read an integer from STDIN.");
		return scanner.nextInt();
	}
	private void printInt(int x) {
		System.out.print(x);
	}
	private void printLn() {
		System.out.println();
	}
	private void printSpace() {
		System.out.print(" ");
	}
	
	@Override 
	public Integer visitProgram(JackLangParser.ProgramContext ctx) {
		for(int i=0;i<ctx.func().size();i++) {
			JackLangParser.FunctionContext curFunc=(JackLangParser.FunctionContext)ctx.func(i);
			if(functionList.containsKey(curFunc.IDENTIFIER().getText()))
				throwError("CompileError: Overload isn't allowed. Function name: "+curFunc.IDENTIFIER().getText());
			else functionList.put(curFunc.IDENTIFIER().getText(), curFunc);
		}
		for(int i=0;i<ctx.varDeclare().size();i++) {
			JackLangParser.DeclContext curDeclare=(JackLangParser.DeclContext)((JackLangParser.VarDeclContext)ctx.varDeclare(i)).declare();
			if(globalMemory.containsKey(curDeclare.IDENTIFIER().getText()))
				throwError("CompileError: Define Variable Multiple times(Global) aren't allowed. Variable name: "+curDeclare.IDENTIFIER().getText());
			else {
				if(curDeclare.type() instanceof JackLangParser.ArrayTypeContext) {
					JackLangParser.ArrayTypeContext arrayTypeCon=(JackLangParser.ArrayTypeContext)curDeclare.type();
					int arrSize=Integer.valueOf(arrayTypeCon.INT().getText());
					ArrayList<Integer> arr=new ArrayList<Integer>(arrSize);
					for(int j=0;j<arrSize;j++)arr.add(0);
					globalMemory.put(curDeclare.IDENTIFIER().getText(), arr);
				}else if(curDeclare.type() instanceof JackLangParser.IntTypeContext) {
					globalMemory.put(curDeclare.IDENTIFIER().getText(), 0);
				}else {
					throwError("CompileError: Unknown DataType(Global)!");
				}
			}
		}
		JackLangParser.FunctionContext funcMain=functionList.get("main");
		if(funcMain.parameters()!=null) 
			throwError("CompileError: Entrypoint `main` must have no parameters!");
		HashMap<String,Object> storage=createRuntimeStorage();
		traceStack.add(traceStack.size(),funcMain);
		runtimeStack.add(storage);
		int ret=visitFunction(funcMain);
		traceStack.remove(traceStack.size()-1);
		System.out.println("Program terminated with return code "+ret);
		return ret; 
	}
	
	@Override 
	public Integer visitFunction(JackLangParser.FunctionContext ctx) {
		Integer ret=visit(ctx.block());
		if(ret==null) {
			System.out.println("Warning: No return value, return 0 instead. Function Name: "+ctx.IDENTIFIER().getText());
			return 0;
		}
		return ret;
	}
	@Override 
	public Integer visitDecl(JackLangParser.DeclContext ctx) { 
		HashMap<String, Object> curStorage=runtimeStack.get(runtimeStack.size()-1);
		if(curStorage.containsKey(ctx.IDENTIFIER().getText()))
			throwError("CompilerError: Define Variable Multiple times(Local Stack) aren't allowed. Variable name: "+ctx.IDENTIFIER().getText());
		else {
			if(ctx.type() instanceof JackLangParser.ArrayTypeContext) {
				JackLangParser.ArrayTypeContext atCon=(JackLangParser.ArrayTypeContext)ctx.type();
				String arrName=ctx.IDENTIFIER().getText();
				int arrSize=Integer.valueOf(atCon.INT().getText());
				ArrayList<Integer> arr=new ArrayList<Integer>(arrSize);
				for(int i=0;i<arrSize;i++)arr.add(0);
				curStorage.put(arrName, arr);
			}else if(ctx.type() instanceof JackLangParser.IntTypeContext) {
				curStorage.put(ctx.IDENTIFIER().getText(), 0);
			}else {
				throwError("CompileError: Unknown DataType(Local Stack)!");
			}
		}
		return null;
	}
	@Override 
	public Integer visitBlock(JackLangParser.BlockContext ctx) { 
		List<JackLangParser.StatementContext> statCon=ctx.statement();
		for(int i=0;i<statCon.size();i++) {
			Integer ret=visit(statCon.get(i));
			if(ret!=null)return ret;
		}
		return null;
	}
	
	@Override public Integer visitIf(JackLangParser.IfContext ctx) { 
		int cond=visit(ctx.expr());
		Integer ret=null;
		if(cond!=0)ret=visit(ctx.statement(0));
		else if(ctx.statement(1)!=null)ret=visit(ctx.statement(1));
		return ret; 
	}

	@Override public Integer visitWhile(JackLangParser.WhileContext ctx) {
		int cond=visit(ctx.expr());
		Integer ret=null;
		while(cond!=0) {
			ret=visit(ctx.statement());
			if(ret!=null)return ret;
			cond=visit(ctx.expr());
		}
		return ret; 
	}

	@Override public Integer visitDoWhile(JackLangParser.DoWhileContext ctx) {
		int cond;
		Integer ret=null;
		do {
			ret=visit(ctx.statement());
			if(ret!=null)return ret;
			cond=visit(ctx.expr());
		}while(cond!=0);
		return ret; 
	}

	@Override public Integer visitReturn(JackLangParser.ReturnContext ctx) {
		return visit(ctx.expr());
	}

	@Override public Integer visitAssign(JackLangParser.AssignContext ctx) {
		int value=visit(ctx.expr(1));
		if(ctx.expr(0) instanceof JackLangParser.ArrayVisitContext) {
			JackLangParser.ArrayVisitContext avCon=(JackLangParser.ArrayVisitContext)ctx.expr(0);
			String arrName=avCon.IDENTIFIER().getText();
			int arrIndex=visit(avCon.expr());
			setArrayValue(arrName,arrIndex,value);
		}else if(ctx.expr(0) instanceof JackLangParser.IdentifierContext) {
			JackLangParser.IdentifierContext intCon=(JackLangParser.IdentifierContext)ctx.expr(0);
			setIntegerValue(intCon.IDENTIFIER().getText(),value);
		}else {
			throwError("CompileError: the symbol on left of the equal sign isn't a l-value");
		}
		return null; 
	}
	
	@Override public Integer visitFuncStat(JackLangParser.FuncStatContext ctx) { 
		visit(ctx.expr());
		return null; 
	}
	
	@Override 
	public Integer visitParenExpr(JackLangParser.ParenExprContext ctx) { 
		return visit(ctx.expr()); 
	}
	@Override 
	public Integer visitIntLiteral(JackLangParser.IntLiteralContext ctx) { 
		return Integer.valueOf(ctx.getText()); 
	}
	@Override 
	public Integer visitFunctionCall(JackLangParser.FunctionCallContext ctx) { 
		String funName=ctx.IDENTIFIER().getText();
		if(funName.equals("readInt"))return readInt();
		else if(funName.equals("printInt")) {
			if(ctx.exprList()==null)
				throwError("CompileError: readInt has arguments!!!");
			printInt(visit(ctx.exprList().expr(0)));
			return 0;
		}else if(funName.equals("printLn")){
			printLn();
			return 0;
		}else if(funName.equals("printSpace")) {
			printSpace();
			return 0;
		}
		JackLangParser.ParasContext parasCon=(JackLangParser.ParasContext)functionList.get(funName).parameters();
		HashMap<String,Object> storage=createRuntimeStorage();
		if(parasCon!=null&&ctx.exprList()!=null) {
			if(parasCon.declare().size()!=ctx.exprList().expr().size()) 
				throwError("CompileError: The number of arguments and parameters are different! Function name: "+funName);
			for(int i=0;i<parasCon.declare().size();i++) {
				storage.put(
						((JackLangParser.DeclContext)parasCon.declare(i)).IDENTIFIER().getText(),
						visit(ctx.exprList().expr(i))
						);
			}
		}
		traceStack.add(traceStack.size(),functionList.get(funName));
		runtimeStack.add(storage);
		int ret=visitFunction(functionList.get(funName));
		traceStack.remove(traceStack.size()-1);
		popRuntimeStorage();
		return ret;
	}
	@Override
	public Integer visitArrayVisit(JackLangParser.ArrayVisitContext ctx) {
		int index=visit(ctx.expr());
		return getArrayValue(ctx.IDENTIFIER().getText(),index);
	}
	@Override 
	public Integer visitIdentifier(JackLangParser.IdentifierContext ctx) {
		return getIntegerValue(ctx.getText());
	}
	@Override 
	public Integer visitUnaryMinus(JackLangParser.UnaryMinusContext ctx) {
		return -visit(ctx.expr()); 
	}
	@Override 
	public Integer visitBoolNOT(JackLangParser.BoolNOTContext ctx) {
		Integer r=visit(ctx.expr());
		if(r.equals(0))return 1;
		else return 0;
	}
	@Override 
	public Integer visitMULDIV(JackLangParser.MULDIVContext ctx) { 
		Integer r1=visit(ctx.expr(0));
		Integer r2=visit(ctx.expr(1));
		if(ctx.op.getType()==JackLangParser.MUL) {
			return r1*r2;
		}else if(ctx.op.getType()==JackLangParser.DIV){
			return r1/r2;
		} else {
			throwError("InternalError: visitMULDIV, please report this incident to the developer!");
			return 0;
		}
	}
	@Override 
	public Integer visitADDSUB(JackLangParser.ADDSUBContext ctx) { 
		Integer r1=visit(ctx.expr(0));
		Integer r2=visit(ctx.expr(1));
		if(ctx.op.getType()==JackLangParser.ADD) {
			return r1+r2;
		}else if(ctx.op.getType()==JackLangParser.SUB){
			return r1-r2;
		}else {
			throwError("InternalError: visitADDSUB, please report this incident to the developer!");
			return 0;
		}
	}
	@Override 
	public Integer visitCompareSize(JackLangParser.CompareSizeContext ctx) {
		Integer r1=visit(ctx.expr(0));
		Integer r2=visit(ctx.expr(1));
		if(ctx.op.getType()==JackLangParser.LT) {
			if(r1.intValue()<r2.intValue())return 1;
			else return 0;
		}else if(ctx.op.getType()==JackLangParser.LE) {
			if(r1.intValue()<=r2.intValue())return 1;
			else return 0;
		}else if(ctx.op.getType()==JackLangParser.GE) {
			if(r1.intValue()>=r2.intValue())return 1;
			else return 0;
		}else if(ctx.op.getType()==JackLangParser.GT){
			if(r1.intValue()>r2.intValue())return 1;
			else return 0;
		}else {
			throwError("InternalError: visitCompareSize, please report this incident to the developer!");
			return 0;
		}
	}
	@Override
	public Integer visitCompareEquality(JackLangParser.CompareEqualityContext ctx) {
		Integer r1=visit(ctx.expr(0));
		Integer r2=visit(ctx.expr(1));
		if(ctx.op.getType()==JackLangParser.EQ) {
			if(r1.equals(r2))return 1;
			else return 0;
		}else if(ctx.op.getType()==JackLangParser.NE){
			if(!r1.equals(r2))return 1;
			else return 0;
		}else {
			throwError("InternalError: visitCompareEquality, please report this incident to the developer!");
			return 0;
		}
	}
	@Override
	public Integer visitBoolAND(JackLangParser.BoolANDContext ctx) { 
		Integer r1=visit(ctx.expr(0));
		Integer r2=visit(ctx.expr(1));
		if(!r1.equals(0)&&!r2.equals(0))return 1;
		else return 0;
	}
	@Override 
	public Integer visitBoolOR(JackLangParser.BoolORContext ctx){
		Integer r1=visit(ctx.expr(0));
		Integer r2=visit(ctx.expr(1));
		if(r1.equals(0)&&r2.equals(0))return 0;
		else return 1;
	}

}
