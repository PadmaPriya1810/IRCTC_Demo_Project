package Oops;

public class Passenger {
	private String name;
	private int age;
	private char gender;
	private long contactno;
	Ticket t;
	
	Passenger()
	{
		
	}
	
	Passenger(String name)
	{
		this.name=name;
	}
	
	Passenger(String name,int age)
	{
		this(name);
		this.age=age;
	}
	Passenger(String name,int age,char gender)
	{
		this(name,age);
		this.gender=gender;
	}
	Passenger(String name,int age,char gender,long contactno)
	{
		this(name,age,gender);
		this.contactno=contactno;
	
	}

	public String getName(String name,long contactno )
	{
		if((this.name.equals(name))&&this.contactno==contactno)
		{
			return name;
		}
		else
			return "Invalid Credentials";
	}
	public int getAge(int age,long contactno )
	{
		if((this.age==age)&&this.contactno==contactno)
		{
			return age;
		}
		else
			return 0;
	}
	
	public char getGender(char gender,long contactno )
	{
		if((this.gender==gender)&&this.contactno==contactno)
		{
			return gender;
		}
		else
			return 0;
	}
	
	public long getContactNo(String name,long contactno )
	{
		if((this.name.equals(name))&&this.contactno==contactno)
		{
			return contactno;
		}
		else
			return 0l;
	}
	public void setName(String Oldname,String Newname,long contactno)
	{
		if((this.name.equals(Oldname))&&this.contactno==contactno)
		{
			this.name=Newname;
			System.out.println("Successfully Passenger Name Changed!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	public void setAge(int Oldage,int Newage,long contactno)
	{
		if((this.age==(Oldage))&&this.contactno==contactno)
		{
			this.age=Newage;
			System.out.println("Successfully Passenger Age Changed!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	public void setGender(char Oldgender,char Newgender,long contactno)
	{
		if((this.gender==(Oldgender))&&this.contactno==contactno)
		{
			this.gender=Newgender;
			System.out.println("Successfully Passenger Gender Changed!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	public void setContactno(long Oldcontactno,long Newcontactno )
	{
		if(this.contactno==Oldcontactno)
		{
			this.contactno=Newcontactno;
			System.out.println("Successfully Contact Number Changed!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public void passengerDetails()
	{
		System.out.println("Passenger Name: "+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Contact Number:"+contactno);
		//t.ticketDetails();
	}
	
	public void addTicket(Ticket t)
	{
		if(this.t==null)
		{
			this.t=t;
			System.out.println("Ticket Details Added Successfully");
		}
		else
		{
			System.out.println("Ticket Booked Already");
		}
		
	}
	public void cancelTicket(Ticket t)
	{
		if(this.t!=null)
		{
			this.t=null;
			System.out.println("Ticket Cancelled Successfully");
		}
		else
		{
			System.out.println("Book Ticket");
		}
		
	}
	
}

