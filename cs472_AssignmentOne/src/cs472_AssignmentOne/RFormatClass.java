package cs472_AssignmentOne;

import java.util.Scanner;

public class RFormatClass {
	Scanner scan = new Scanner(System.in);

	

	int[] instrucArray = {0x032BA020, 0x8CE90014, 0x12A90003, 0x022DA822, 0xADB30020, 0x02697824, 0xAE8FFFF4, 0x018C6020, 0x02A4A825, 0x158FFFF7, 0x8ECDFFF0};
	//int[] knownInstrucArray = {0x00A63820, 0x8D070004, 0xAD0DFFFC};

	//Both format variables
	int opcode;
	int src1reg;
	int funcInt;
	String funcString;
	int address = 0x9A040;
	
	//R format variables
	
	int src2reg;
	int destreg;
	
	//I format variables
	int srcdestreg;
	short offset;
	

	
	
	//Both chunks
	int opcodeChunk = 0b11111100000000000000000000000000;
	int src1regChunk = 0b00000011111000000000000000000000;
	
	//R Chunks
	int src2regChunk = 0b00000000000111110000000000000000;
	int destregChunk = 0b00000000000000001111100000000000;
	int functionChunk = 0b00000000000000000000000000111111;
	
	//I chunks
	int srcdestChunk = 0b00000000000111110000000000000000;
	int offsetChunk = 0b00000000000000001111111111111111;
	
	
	
	
	
	
	public String scanInput(){
		String userInput;
		userInput = scan.nextLine();
		return userInput;
	}
	
	public String sourceInstructions(int instruc) {
		return "poop";
	}
	
	public void whichFuncR() {
		if(funcInt==0x20) {
			funcString = "add";
		}
		if(funcInt==0x22) {
			funcString = "sub";
		}
		if(funcInt==0x24) {
			funcString = "and";
		}
		if(funcInt==0x25) {
			funcString = "or";
		}

		
	}
	public void whichFuncI() {

		if(opcode==0x2a) {
			funcString = "slt";
		}
		if(opcode==0x23) {
			funcString = "lw";
		}
		if(opcode==0x2b) {
			funcString = "sw";
		}
		if(opcode==0x4) {
			funcString = "beq";
		}
		if(opcode==0x5) {
			funcString = "bne";
		}
		
	}
	
	public void printResultR(){
		System.out.print(Integer.toHexString(address));
		
		System.out.print("\t");
		System.out.print(funcString);
		System.out.println(" $" + destreg + ", $" + src1reg + ", $" + src2reg);

	}
	
	public void printResultI(){
		System.out.print(Integer.toHexString(address));
		
		System.out.print("\t");
		System.out.print(funcString);
		System.out.println(" $" + srcdestreg + ", " + offset + " ($" + src1reg + ")");

	}
	public int getFuncInt() {
		return funcInt;
	}


	public void setFuncInt(int funcInt) {
		this.funcInt = funcInt;
	}


	public String getFuncString() {
		return funcString;
	}


	public void setFuncString(String funcString) {
		this.funcString = funcString;
	}


	public void isolateChunksR(int slot) {
		
		src1reg = (instrucArray[slot] & src1regChunk)>>>21;
		src2reg = (instrucArray[slot] & src2regChunk)>>>16;
		destreg = (instrucArray[slot] & destregChunk)>>>11;
		funcInt = (instrucArray[slot] & functionChunk);

	}
	public void isolateChunksI(int slot) {
		
		src1reg = (instrucArray[slot] & src1regChunk)>>>21;
		srcdestreg = (instrucArray[slot] & srcdestChunk)>>>16;
		offset = (short) (instrucArray[slot] & offsetChunk);

	}
	
	
	public boolean isRFormat() {
		if(opcode > 0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public int getInstrucArray(int slot) {
		return instrucArray[slot];
	}


	public void setInstrucArray(int[] instrucArray) {
		this.instrucArray = instrucArray;
	}


	/*public int getKnownInstrucArray(int slot) {
		return knownInstrucArray[slot];
	}


	public void setKnownInstrucArray(int[] knownInstrucArray) {
		this.knownInstrucArray = knownInstrucArray;
	}*/


	public int getAddress() {
		return address;
	}


	public void setAddress(int address) {
		this.address = address;
	}


	public int getOpcode() {
		return opcode;
	}


	public void setOpcode(int opcode) {
		this.opcode = opcode;
	}


	public int getSrc1reg() {
		return src1reg;
	}


	public void setSrc1reg(int src1reg) {
		this.src1reg = src1reg;
	}


	public int getSrc2reg() {
		return src2reg;
	}


	public void setSrc2reg(int src2reg) {
		this.src2reg = src2reg;
	}


	public int getDestreg() {
		return destreg;
	}


	public void setDestreg(int destreg) {
		this.destreg = destreg;
	}





	public int getOpcodeChunk() {
		return opcodeChunk;
	}


	public void setOpcodeChunk(int opcodeChunk) {
		this.opcodeChunk = opcodeChunk;
	}


	public int getSrc1regChunk() {
		return src1regChunk;
	}


	public void setSrc1regChunk(int src1regChunk) {
		this.src1regChunk = src1regChunk;
	}


	public int getSrc2regChunk() {
		return src2regChunk;
	}


	public void setSrc2regChunk(int src2regChunk) {
		this.src2regChunk = src2regChunk;
	}


	public int getDestregChunk() {
		return destregChunk;
	}


	public void setDestregChunk(int destregChunk) {
		this.destregChunk = destregChunk;
	}


	public int getFunctionChunk() {
		return functionChunk;
	}


	public void setFunctionChunk(int functionChunk) {
		this.functionChunk = functionChunk;
	}


	public int getSrcdestChunk() {
		return srcdestChunk;
	}


	public void setSrcdestChunk(int srcdestChunk) {
		this.srcdestChunk = srcdestChunk;
	}


	public int getOffsetChunk() {
		return offsetChunk;
	}


	public void setOffsetChunk(int offsetChunk) {
		this.offsetChunk = offsetChunk;
	}

	
}
