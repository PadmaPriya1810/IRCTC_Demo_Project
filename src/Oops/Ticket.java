package Oops;

public class Ticket {
	private int ticketno;
	private String boarding;
	private String destination;
	private String journeydate;
	
	
	Ticket()
	{
		
	}
	
	Ticket(int ticketno)
	{
		this.ticketno=ticketno;
	}
	
	Ticket(int ticketno, String boarding)
	{
		this(ticketno);
		this.boarding=boarding;
	}
	
	Ticket(int ticketno,String boarding,String destination)
	{
		this(ticketno,boarding);
		this.destination=destination;
	}
	
	Ticket(int ticketno,String boarding,String destination,String journeydate)
	{
		this(ticketno,boarding,destination);
		this.journeydate=journeydate;
	}
	
	public int getTicketNo(int ticketno)
	{
		if(this.ticketno==ticketno)
		{
			return ticketno;
		}
		
		else
		
		return 0;
		
	}
	
	public String getBoarding(String boarding,int ticketno)
	{
		if((this.boarding.equals(boarding))&&this.ticketno==ticketno)
		{
			return boarding;
		}
		else
			return "Invalid Boarding Point";
	}
	
	public String getDestination(String destination,int ticketno)
	{
		if((this.destination.equals(destination))&&this.ticketno==ticketno)
		{
			return destination;
		}
		else
			return "Invalid Destination Point";
	}
	public String getJourneyDate(String journeydate,int ticketno)
	{
		if((this.journeydate.equals(journeydate))&&this.ticketno==ticketno)
		{
			return journeydate;
		}
		else
			return "Invalid Journey Date";
	}
	
	public void ticketDetails()
	{
		System.out.println("Ticket Number :"+ticketno);
		System.out.println("Boarding Point :"+boarding);
		System.out.println("Destination Point :"+destination);
		System.out.println("Journey Date :"+journeydate);
	}
	
	public void setBoarding(String Oldboarding,String Newboarding, int ticketno)
	{
		if((this.boarding.equals(Oldboarding))&&this.ticketno==ticketno)
		{
			this.boarding=Newboarding;
			System.out.println("Successfully Boarding Point Changed!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public void setDestination(String Olddestination,String Newdestination,int ticketno)
	{
		if((this.destination.equals(Olddestination))&&this.ticketno==ticketno)
		{
			this.destination=Newdestination;
			System.out.println("Successfully Destination Point Changed!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public void setJourneyDate(String Oldjourneydate,String Newjourneydate,int ticketno)
	{
		if(this.ticketno==ticketno)
		{
			this.journeydate=Newjourneydate;
			System.out.println("Successfully Journey Date Changed!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
}
