package entities;

public class Pensionato {

	private String name;
	private String email;

	public Pensionato(String name, String email) {
		this.name = name;
		this.email = email;
		;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return ": " + name + ", " + email;
	}

}
