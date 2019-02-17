package design.pattern.adapter;

//@Author:Nilfa Sahilan


public class RemotePersonImpl implements IRemotePerson{

	IPerson ip=new PersonImpl();
	
	@Override
	public String geenerateFullName() {
		System.out.println("Invoke remote geenerateFullName() method.");
		
		System.out.println(ip.getFirstName()+" "+ip.getLastName() ); 
		return null;
	}

	@Override
	public String generateFullAddress() {
		System.out.println("Invoke remote generateFullAddress() method.");
		return null;
	}

}

