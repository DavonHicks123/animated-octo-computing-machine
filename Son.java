package inheritance;

public class Son extends Father {

 protected String weaknesses="sports";
 protected String capabilities="subjects";
  protected static String Son="Dan";

	public Son(String weaknesses,String eyes, String skin, String capabilities, String interest) {
		super(skin, eyes, interest);
		this.weaknesses=weaknesses;
		this.capabilities=capabilities;
	
	}
    public String getCapabilities() {
		return capabilities;
    }
    public void setCapabilities(String newCapabilities) {
		newCapabilities=capabilities;
    }
	public String getWeaknesses() {
		return weaknesses;	
	}
	public void setWeaknesses(String newWeaknesses) {
		newWeaknesses=weaknesses;
	}
	public String abilities() {
		return abilities;
	}
	public void setabilities(String newAbilities) {
		newAbilities=abilities;
	}
	public String toString() {
		return super.toString();

	}
}
