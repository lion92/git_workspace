package entrainement.decorateur;

public class ModeleDecorateur extends Decorateur {

	public ModeleDecorateur(ComposantGVehicule composant) {
		super(composant);
		// TODO Auto-generated constructor stub
	}

	protected void afficheInfoTechnique() {
		System.out.println("info technique model");
		
	}
	
	public void affiche() {
		super.affiche();
		this.afficheInfoTechnique();
	}
	
	
}
