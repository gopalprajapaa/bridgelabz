package HotelManagementSystem;

import java.util.Date;

class Rooms{
	private String room_id;
	private String type;
	private double price;
	public Rooms(String room_id,String type,double price)
	{
		this.room_id=room_id;
		this.type=type;
		this.price=price;
	}
	public String getroom_id() {
		return room_id;
	}
	public String gettype() {
		return type;
	}
	public double getprice() {
		return price;
	}
}
class Bookings{
	private String booking_id;
	private String room_id;
	private String guest_id;
	private Date checkin;
	private Date checkout;
	public Bookings(String booking_id,String room_id,String guest_id,Date checkin,Date checkout)
	{
		this.booking_id=booking_id;
		this.room_id=room_id;
		this.guest_id=guest_id;
		this.checkin=checkin;
		this.checkout=checkout;
	}
	public String getbooking_id() {
		return booking_id;
	}
	public String getroom_id() {
		return room_id;
	}
	public String getguest_id() {
		return guest_id;
	}
	public Date getcheckin() {
		return checkin;
	}
	public Date getcheckout() {
		return checkout;
	}
}
class Guest{
	private String guest_id;
	private String name;
	public Guest(String guest_id,String name)
	{
		this.guest_id=guest_id;
		this.name=name;
	}
	public String getguest_id() {
		return guest_id;
	}
	public String getname() {
		return name;
	}
}
class Booked{
	private List<Bookings> booking;
	public Booked()
}
public class HotelSystem {

}
