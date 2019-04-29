package inheritance;
public class Father {
	protected String eyes="black";

	protected String skin="black";
	protected String abilities="sports";
	protected String interest="girls";
    
	
	
	public Father(String eyes, String skin, String ability, String interest) {
		this.eyes=eyes;
		this.skin=skin;	
		this.abilities=abilities;
		this.interest=interest;
	}

	
	public Father(String eyes, String skin, String interest) {
		this.eyes=eyes;
		this.skin=skin;
		this.interest=interest;
	}


	public String geteyes() {
		return eyes;
	}
	
	public String getskin() {
		return eyes;
    }
	public void setskin(String newSkin) {
		skin=newSkin;
	}

	public void seteyes(String newEyes) {
		newEyes=eyes;
	}
	public String getinterest() {
		return interest;
	}
	public void setinterest(String newInterest) {
		newInterest=interest;
		
	}
	public String getabilities() {
		return abilities;
	}
	public void setabilities(String newAbilities) {
		newAbilities=abilities;
	}
			
		
		

	
	public String toString() {
		return eyes+"/"+"/"+skin+"/"+abilities+"/"+interest;
	
              
}
}
