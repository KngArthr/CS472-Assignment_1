package cs472_AssignmentOne;

import java.util.Scanner;

public class RFormatClass {
	Scanner scan = new Scanner(System.in);



	int[] instrucArray = {0x032BA020, 0x8CE90014, 0x12A90003, 0x022DA822, 0xADB30020, 0x02697824, 0xAE8FFFF4, 0x018C6020, 0x02A4A825, 0x158FFFF7, 0x8ECDFFF0};
	int[] knownInstrucArray = {0x00A63820, 0x8D070004, 0xAD0DFFFC};
	int knownInstruc1 = 0x00A63820;
	int address = 0x9A040;

	
	int opcode;
	int src1reg;
	int src2reg;
	int destreg;
	int func;
	
	
	//Both chunks
	int opcodeChunk = 0b11111100000000000000000000000000;
	int src1regChunk = 0b00000011111000000000000000000000;
	
	//R Chunks
	int src2regChunk = 0b00000000000111110000000000000000;
	int destregChunk = 0b00000000000000001111100000000000;
	int functionChunk = 0b00000000000000001111100000111111;
	
	//I chunks
	int srcdestChunk = 0b00000000000111110000000000000000;
	int offsetChunk = 0b00000000000000001111111111111111;
		
	public void doStuff() {
		
		
		System.out.print("Original: ");
		System.out.print("\t" + knownInstruc1);
		System.out.println("\t" + Integer.toHexString(knownInstruc1));

		destreg = knownInstruc1 >>> 7;
		
		System.out.print("Output: ");
		System.out.print("\t" + destreg);
		System.out.print("\t" + Integer.toHexString(destreg));
		
	}
	
	
	public String scanInput(){
		String userInput;
		userInput = scan.nextLine();
		return userInput;
	}
	
	public String sourceInstructions(int instruc) {
		return "poop";
	}
	
	public void printResult(int instruc, String func, int resultDest, int resultSrc, int resultSrc2){
		System.out.print("Original: ");
		System.out.println("\t" + instruc);
		
		System.out.print("Output: ");
		System.out.print("\t" + func);
		System.out.print("\t" + " $" + resultDest + ", $" + resultSrc + ", $" + resultSrc2);

	}
	public void isolateChunksR() {
		
		src1reg = (knownInstruc1 & src1regChunk)>>>21;
		src2reg = (knownInstruc1 & src2regChunk)>>>16;
		destreg = (knownInstruc1 & destregChunk)>>>11;
		func = (knownInstruc1 & functionChunk);

	}
	
	public boolean isRFormat() {
		if(opcodeChunk > 0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public int[] getInstrucArray() {
		return instrucArray;
	}


	public void setInstrucArray(int[] instrucArray) {
		this.instrucArray = instrucArray;
	}


	public int[] getKnownInstrucArray() {
		return knownInstrucArray;
	}


	public void setKnownInstrucArray(int[] knownInstrucArray) {
		this.knownInstrucArray = knownInstrucArray;
	}


	public int getKnownInstruc1() {
		return knownInstruc1;
	}


	public void setKnownInstruc1(int knownInstruc1) {
		this.knownInstruc1 = knownInstruc1;
	}


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


	public int getFunc() {
		return func;
	}


	public void setFunc(int func) {
		this.func = func;
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
