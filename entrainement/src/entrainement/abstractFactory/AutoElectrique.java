package entrainement.abstractFactory;

public class AutoElectrique extends Automobile {

	public AutoElectrique(String modele, int puissance) {
		super(modele, puissance);
		// TODO Auto-generated constructor stub
	}
public void affiche() {
	System.out.println("modele"+modele+"puissance"+puissance);
}
}
