package entrainement.decorateur;

public abstract class Decorateur implements ComposantGVehicule {
	protected ComposantGVehicule composant;

	public Decorateur(ComposantGVehicule composant) {
		super();
		this.composant = composant;
	}
	
	public void  affiche() {
		composant.affiche();
	}
	

}
