class staff{	
	private int Staffid;
	private String Name;
	private String Phone;
	private long Salary;
	public staff(int staffid,String name,String phone,long salary) {
		Staffid=staffid;
		Name=name;
		Phone=phone;
		Salary=salary;
	}
	public void display() {
		System.out.print(Staffid+"\t"+Name+"\t"+Phone+"\t"+Salary);
	}
	
}
class Teaching extends staff{
	private String Domain;
	private int Publication;
	public Teaching(int staffid,String name,String phone,long salary,String domain,int publication) {
		super(staffid,name,phone,salary);
		Domain=domain;
		Publication=publication;
	}
	public void display() {
		super.display();
		System.out.print("\t"+Domain+"\t"+Publication);
	}
}

class Technical extends staff{
	private String Skills;
	public Technical(int staffid,String name,String phone,long salary,String skills){
		super(staffid,name,phone,salary);
		Skills=skills;
	}
	public void display() {
		super.display();
		System.out.print("\t"+"-"+"\t"+"-"+"\t\t"+Skills);
	}
}
class Contract extends staff{
	private int Period;
	public Contract(int staffid,String name,String phone,long salary,int period) {
		super( staffid, name, phone,salary);
		Period=period;
		}
	public void display() {
		super.display();
		System.out.println("\t-"+"\t"+"-"+"\t\t"+"-"+"\t"+Period);
	}
}
public class Staffdata {

	public static void main(String[] args) {
		staff[] st=new staff[3];
		st[0]=new Teaching(222, "hel", "8521",456321,"hod", 50);
		st[1]=new Technical(250,"has","96331",741258,"tng");
		st[2]=new Contract(789, "lol", "96321",74112, 2);
		System.out.println("Staffid\tName\tPhone\tSalary\tDomain\tPublication\tSkills\tPeriod");
		for(int i=0;i<3;i++) {		
			st[i].display();
			System.out.println();
		}
	}

}
