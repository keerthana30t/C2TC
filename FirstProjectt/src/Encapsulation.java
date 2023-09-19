
public class Encapsulation {


	private String name;
	private String idnum;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		age=newAge;
	}
	
	public void setName(String newName) {
		name=newName;
	}
	
	public void setidnum(String newid) {
		idnum=newid;
	}
	
	public static void main(String[] args) {
		Encapsulation encap=new Encapsulation();
		encap.setName("Keerthana");
		encap.setAge(21);
		encap.setidnum("1234ab");
	
	System.out.println("Name:"+encap.getName() +"Age:"+encap.getAge());
		// TODO Auto-generated method stub

	}

}
