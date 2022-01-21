package entrainement.abstractFactory;

public abstract class Automobile {
	protected String modele;
	protected int puissance;

	public Automobile(String modele, int puissance) {
		super();
		this.modele = modele;
		this.puissance = puissance;
	}
public abstract void affiche();
}
