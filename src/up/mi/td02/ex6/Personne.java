package up.mi.td02.ex6;

public class Personne {
	private String firstname;
	private String lastname;
	private String telNumber;

	public Personne(String firstname, String lastname, String tel){
		this.firstname = firstname;
		this.lastname = lastname;
		this.telNumber = tel;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getTelNumber() {
		return telNumber;
	}
}
