package m2i.Formation.ADN;

import java.util.ArrayList;
import java.util.List;

public class DNA extends Strand{
	
	///   ACIDE AMINE => INITIATION =>
	
	private SequenceDeBase sequenceDeBase;
	private List<DNABase> brin1;
	private List<DNABase> brin2;

	public SequenceDeBase getSequenceDeBase() {
		return sequenceDeBase;
	}

	public List<DNABase> getBrin1() {
		return brin1;
	}
	
	public void setBrin1(List<DNABase> brin1) {
		this.brin1 = brin1;
	}
	
	
	public List<DNABase> Transposition(List<DNABase> brin1) {
		//Transposition
		this.brin2 = new ArrayList<DNABase>();
	/*	for (DNABase i : brin1)
		{
			switch(i) 
			{ 
			case A : brin2.add(SequenceDeBase.T); break; 
			case T : brin2.add(SequenceDeBase.A); break; 
			case C : brin2.add(SequenceDeBase.G); break; 
			case G : brin2.add(SequenceDeBase.C); break; 
			default:
				break; 
			}	 
		}*/
		return brin2;
	}



/*	public List<SequenceDeBase> Transcription(List<SequenceDeBase> brin1){
		
		this.brin2 = new ArrayList<SequenceDeBase>();

		for (SequenceDeBase i : brin1)
		{
			switch(i) 
			{ 
			case A : brin2.add(SequenceDeBase.A); break; 
			case T : brin2.add(SequenceDeBase.U); break; 
			case C : brin2.add(SequenceDeBase.C); break; 
			case G : brin2.add(SequenceDeBase.G); break; 
			default:
				break; 
			}	 
		}
		return brin2;

	}*/

}
