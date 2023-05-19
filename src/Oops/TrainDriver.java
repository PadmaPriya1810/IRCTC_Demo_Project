package Oops;

import java.util.Scanner;

public class TrainDriver {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("WELCOME TO INDIAN RAILWAYS");
		System.out.println("Enter the Train Number");
		String trainno=sc.nextLine();
		
		Train ir=new Train(trainno);
		
		boolean b=true;
	do
	{
		System.out.println("****************");
		System.out.println("Enter Your Choice:\n "
							+ "1. Add Passenger\n "
							+ "2. Book Ticket\n "
							+ "3. Display Journey Details\n "
							+ "4. Change Boarding\n "
							+ "5. Change Destination\n "
							+ "6. Cancel Ticket\n "
							+ "7. Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: 
		{
			System.out.println("*** Enter Passenger Details ***");
			
			System.out.println("Enter Passenger Name");
			String name=sc.next();
			//sc.nextLine();
			System.out.println("Enter Passenger Age");
			int age=sc.nextInt();
			System.out.println("Enter Passenger Gender");
			char gender=sc.next().charAt(0);
			System.out.println("Enter Passenger Contact Number");
			long contactno=sc.nextLong();
			
			ir.addPassenger(new Passenger(name,age,gender,contactno));
		}
		break;
		case 2:
		{
			System.out.println("*** Enter Ticket Details ***");
			System.out.println("Enter Ticket Number");
			int ticketno=sc.nextInt();
			System.out.println("Enter Boarding Point");
			String boarding=sc.next();
			//sc.nextLine();
			System.out.println("Enter Destination Point");
			String destination=sc.next();
			sc.nextLine();
			System.out.println("Enter Journey Date");
			String journeydate=sc.nextLine();
			ir.p.addTicket(new Ticket(ticketno,boarding,destination,journeydate));
			ir.p.t.ticketDetails();
			ir.journeyDetails();
		}
		break;
		case 3:
		{
			ir.p.t.ticketDetails();
			ir.journeyDetails();
		}
		break;
		
		case 4:
		{
			System.out.println("Enter the Old Boarding Point");
			String Oldboarding=sc.next();
			//sc.nextLine();
			System.out.println("Enter the New Boarding Point");
			String Newboarding=sc.next();
			System.out.println("Enter the Ticket Number");
			int ticketno1=sc.nextInt();
			ir.p.t.setBoarding(Oldboarding, Newboarding, ticketno1);
			ir.p.t.getBoarding(Newboarding, ticketno1);
		}
		break;
		case 5:
		{
			System.out.println("Enter the Old Destination Point");
			String Olddestination=sc.next();
			//sc.nextLine();
			System.out.println("Enter the New Destination Point");
			String Newdestination=sc.next();
			System.out.println("Enter the Ticket Number");
			int ticketno1=sc.nextInt();
			ir.p.t.setDestination(Olddestination, Newdestination, ticketno1);
			ir.p.t.getDestination(Newdestination, ticketno1);
		}
		break;
		case 6:
		{
			ir.p.cancelTicket(ir.p.t);
		}
		break;
		case 7:
		{
			b=false;
		}
		break;
		default:
		{
			System.out.println("Invalid Choice");
		}
		}
		}
		while(b);
	}
}
