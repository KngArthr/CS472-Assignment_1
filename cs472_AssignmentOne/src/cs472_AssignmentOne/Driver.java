package cs472_AssignmentOne;

import java.util.*;

public class Driver {
	
	
	

	
	
	

	public static void main(String[] args) {
		//int[] instrucArray = {0x032BA020, 0x8CE90014, 0x12A90003, 0x022DA822, 0xADB30020, 0x02697824, 0xAE8FFFF4, 0x018C6020, 0x02A4A825, 0x158FFFF7, 0x8ECDFFF0};
		int[] instrucArrayTest = {0x0345EB22, 0x14950002, 0xafa7fffc, 0x8cd5000c, 0x01852820, 0x02653024};
		


		RFormatClass rFormatClass = new RFormatClass();
		
		
	
		
		for(int i = 0; i < instrucArrayTest.length; i++) {
			rFormatClass.setOpcode((instrucArrayTest[i] & rFormatClass.getOpcodeChunk())>>>26);
			


			
			if(rFormatClass.isRFormat()) {
				//System.out.println(Integer.toHexString(rFormatClass.getKnownInstrucArray(i)));
				//System.out.println(Integer.toHexString((rFormatClass.getKnownInstrucArray(i) & rFormatClass.getOpcodeChunk())>>>26));
				
				rFormatClass.isolateChunksR(i, instrucArrayTest);
				rFormatClass.whichFuncR();
				rFormatClass.printResultR();
				

				
				
			}else {
				//System.out.println(Integer.toHexString(rFormatClass.getKnownInstrucArray(i)));
				//System.out.println(Integer.toHexString((rFormatClass.getKnownInstrucArray(i) & rFormatClass.getOpcodeChunk())>>>26));
			
				rFormatClass.isolateChunksI(i, instrucArrayTest);
				rFormatClass.whichFuncI();
				rFormatClass.printResultI();

				
				
			}
			
			
			rFormatClass.setAddress(((rFormatClass.getAddress() + 4)));
			
		}
		
		
			
	}
	

}
