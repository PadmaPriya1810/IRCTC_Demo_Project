package Oops;

public class Train {
private String trainno;
Passenger p;

Train()
{
	
}
Train(String trainno)
{
	this.trainno=trainno;	
}
Train(String trainno,Passenger p)
{
	this.trainno=trainno;
	this.p=p;
}
public void journeyDetails()
{
	System.out.println("Train Number:"+trainno);
	p.passengerDetails();
}
public void addPassenger(Passenger p)
{
	if(this.p==null)
	{
		this.p=p;
		System.out.println("Passenger Details Added Successfully");
	}
	else
	{
		System.out.println("Passenger Details Already Exists");
	}	
}
}
