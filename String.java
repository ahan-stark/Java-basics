import java.util.Scanner;
import java.util.StringTokenizer;

class Customer{
    private String Name;
    private String dateofbirth;
    public void readData(String name,String dob){
        Name=name;
        dateofbirth=dob;
    }
    public void displayData(){
        StringTokenizer st=new StringTokenizer(dateofbirth+",");
        System.out.println(Name+",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken()+",");
        }
    }
}

class Tele {

	public static void main(java.lang.String[] args) {
		 Scanner in=new Scanner(System.in);
	        System.out.println("name");
	        String name=in.nextLine();
	        System.out.println("dob");
	        String dob=in.nextLine();
	        Customer cu=new Customer();
	        cu.readData(name, dob);
	        cu.displayData();
	        in.close();

		

	}

}
