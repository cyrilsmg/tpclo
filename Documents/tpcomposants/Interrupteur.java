/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */


public class Interrupteur extends Composant {
	
	public String description(){
		return this.getId();
		}
	
	protected boolean etat;
	public void on() {
		etat = true;
	}    
	public void off() {
		etat = false;
	}
	
	public boolean getEtat() throws NonConnecteException {
		return etat;	
	}
	
	protected Composant in;
	public void setIn(Composant cp){
		in = cp;
	}
	
	
	
}
