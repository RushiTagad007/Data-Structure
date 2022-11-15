package menudriventreeset;

public class ChemicalElements implements Comparable<ChemicalElements> {

	
int AtomicNum;
String AtomicName;
String AutomicFormula;
Float AutomicWeight;

ChemicalElements left;
ChemicalElements Right;




public ChemicalElements() {

}
public ChemicalElements(int atomicNum, String atomicName, String automicFormula, Float automicWeight) {
	
	AtomicNum = atomicNum;
	AtomicName = atomicName;
	AutomicFormula = automicFormula;
	AutomicWeight = automicWeight;
	
}
@Override
public String toString() {
	return "ChemicalElements [AtomicNum=" + AtomicNum + ", AtomicName=" + AtomicName + ", AutomicFormula="
			+ AutomicFormula + ", AutomicWeight=" + AutomicWeight + "]";
}

@Override
public int compareTo(ChemicalElements o) {


	return 0;
}


}
