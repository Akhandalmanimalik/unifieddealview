package model;

public class Applicants {
	private String firstName;
	private String lastName;
	private String[] documents;
	private String email;
	private String includeInDeal;
	private String cell;
	
	public Applicants() {
		// TODO Auto-generated constructor stub
	}
	public Applicants(String firstName, String lastName, String[] documents,
			String email, String includeInDeal, String cell) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.documents = documents;
		this.email = email;
		this.includeInDeal=includeInDeal;
		this.cell = cell;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getDocuments() {
		return documents;
	}

	public void setDocuments(String[] documents) {
		this.documents = documents;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "ClassPojo [lastName = " + lastName + ", documents = "
				+ documents + ", email = " + email + ", firstName = "
				+ firstName + "]";
	}
	public String getIncludeInDeal() {
		return includeInDeal;
	}
	public void setIncludeInDeal(String includeInDeal) {
		this.includeInDeal = includeInDeal;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
}
