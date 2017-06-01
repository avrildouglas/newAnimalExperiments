package newAnimalExperiment;

public class Animal{
	private String commonName;
	private String animalFamily;
	
	
	public String sleep(){
		return "A " + animalFamily + " sleeps...";
	}
	public String eat(){
		return "A " + animalFamily + " eats...";
	}
	public String breathe(){
		return "A " + animalFamily + " breathes...";
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public String getAnimalFamily() {
		return animalFamily;
	}
	public void setAnimalFamily(String animalFamily) {
		this.animalFamily = animalFamily;
	}
	
}