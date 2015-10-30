package m2i.Formation.ADN;

public class Codon {
    private RNABase[] RNABases = new RNABase[3];
    
    private AminoAcid aminoAcid;

	public AminoAcid getAminoAcid() {
		return aminoAcid;
	}

	public void setAminoAcid(AminoAcid aminoAcid) {
		this.aminoAcid = aminoAcid;
	}

	public RNABase[] getRNABases() {
		return RNABases;
	}
    


}
