package ex3_abstract;

public abstract class Unit {

	String name;
	int energy;
	boolean fly;
	
	public int getEnergy() {
		return energy;
	}
	
	abstract public void decEnergy();
	
}
