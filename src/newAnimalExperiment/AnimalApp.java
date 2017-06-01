package newAnimalExperiment;

public class AnimalApp {
	
	public static void main(String[] args) {

		Cow c = new Cow();
		c.setAnimalFamily("Cow Family");
		c.setCommonName("Cow");
		print(c.breathe());
		print(c.getCommonName() +" belongs to  " + c.getAnimalFamily());
		
		Chimpanzee p = new Chimpanzee();
		p.setAnimalFamily("Primate Family");
		p.setCommonName("Chimpanzee");
		print(p.breathe());
		print(p.getCommonName() +" belongs to  " + p.getAnimalFamily());
	}
	
			
		public static void print(String s){
			System.out.println(s);
		}
}
