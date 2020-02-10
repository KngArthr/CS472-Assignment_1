package cs472_AssignmentOne;

import java.util.*;

public class Driver {
	
	
	

	
	
	

	public static void main(String[] args) {
		


		RFormatClass rFormatClass = new RFormatClass();
		
		
	
		
		for(int i = 0; i < rFormatClass.instrucArray.length; i++) {
			rFormatClass.setOpcode((rFormatClass.getInstrucArray(i) & rFormatClass.getOpcodeChunk())>>>26);
			


			
			if(rFormatClass.isRFormat()) {
				//System.out.println(Integer.toHexString(rFormatClass.getKnownInstrucArray(i)));
				//System.out.println(Integer.toHexString((rFormatClass.getKnownInstrucArray(i) & rFormatClass.getOpcodeChunk())>>>26));
				
				rFormatClass.isolateChunksR(i);
				rFormatClass.whichFuncR();
				rFormatClass.printResultR();
				

				
				
			}else {
				//System.out.println(Integer.toHexString(rFormatClass.getKnownInstrucArray(i)));
				//System.out.println(Integer.toHexString((rFormatClass.getKnownInstrucArray(i) & rFormatClass.getOpcodeChunk())>>>26));
			
				rFormatClass.isolateChunksI(i);
				rFormatClass.whichFuncI();
				rFormatClass.printResultI();

				
				
			}
			
			
			rFormatClass.setAddress(((rFormatClass.getAddress() + 4)));
			
		}
		
		
			
	}
	

}
