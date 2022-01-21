package entrainement.decorateur;

public class VueCatalogue {

	public static void main(String[] args) {
		VueVehicule veVehicule=new VueVehicule();
		ModeleDecorateur modeleDecorateur=new ModeleDecorateur(veVehicule);
		MarqueDecorateur marqueDecorateur = new MarqueDecorateur(modeleDecorateur);
		marqueDecorateur.affiche();
		

	}

}
