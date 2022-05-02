public class toString {
      
    int rollno;  
    String name;  
    String city;  
     
    toString(int rollno, String name, String city){  
    this.rollno=rollno;  
    this.name=name;  
    this.city=city;  
    }  
      
    public String toString(){//overriding the toString() method  
     return rollno+" "+name+" "+city;  
    }  
    public static void main(String args[]){  
      toString s1=new toString(101,"Raj","lucknow");  
      toString s2=new toString(102,"Vijay","ghaziabad");  
        
      System.out.println(s1);//compiler writes here s1.toString()  
      System.out.println(s2);//compiler writes here s2.toString()  
    }  
   }  