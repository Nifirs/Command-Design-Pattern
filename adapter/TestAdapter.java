package design.pattern.adapter;

//@Author:Nilfa Sahilan


public class TestAdapter {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		IPerson person = new PersonImpl();
		
		IRemotePerson remotePerson = new RemotePersonImpl();
		
		System.out.println("Person says");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAddressLine1());
		System.out.println(person.getAddressLine2());
		
		System.out.println("\nRemote Persona says");
		
		
		remotePerson.geenerateFullName();
		remotePerson.generateFullAddress();
		
		System.out.println("\nPerson Adapter says");
		PersonAdapter adapter = new PersonAdapter(person);
		testPerson(adapter);
		
	}
	
	static void testPerson(IRemotePerson remotePerson){
		remotePerson.geenerateFullName();
		remotePerson.generateFullAddress();
	}

}
