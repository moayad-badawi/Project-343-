package datatypes;

public class Room
{
	private int roomNumber;
	private int occupancyLimit;
	public Room(int roomNumber, int occupancyLimit)
	{
		this.roomNumber = roomNumber;
		this.occupancyLimit = occupancyLimit;
	}
	public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
	public void setOccupancyLimit(int occupancyLimit) { this.occupancyLimit = occupancyLimit; }
	public int roomNumber() { return roomNumber; }
	public int occupancyLimit() { return occupancyLimit; }
}
