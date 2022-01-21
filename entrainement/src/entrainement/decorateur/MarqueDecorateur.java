package entrainement.decorateur;

public class MarqueDecorateur extends Decorateur {

	public MarqueDecorateur(ComposantGVehicule composant) {
		super(composant);
		// TODO Auto-generated constructor stub
	}
	
	protected void afficheLogo() {
		System.out.println("Logo de la marque");
	}
	
	public void affiche() {
		super.affiche();
		this.afficheLogo();
	}

}
