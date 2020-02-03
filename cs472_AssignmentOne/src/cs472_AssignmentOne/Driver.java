package cs472_AssignmentOne;

import java.util.*;

public class Driver {
	
	
	

	
	
	

	public static void main(String[] args) {
		RFormatClass rFormatClass = new RFormatClass();
		
		
		
		rFormatClass.setOpcode((rFormatClass.getKnownInstruc1() & rFormatClass.getOpcodeChunk())>>>26);
		
		rFormatClass.isolateChunksR();
		
		if(rFormatClass.isRFormat()) {
			
			
		}else {
			
			
			
		}
		
			
	}
	

}
