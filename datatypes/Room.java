package datatypes;
// change roomNumber to roomID
public class Room
{
	private int roomNumber;
	private int occupancyLimit;
	private String buildingName;
	public Room(int roomNumber, int occupancyLimit, String buildingName)
	{
		this.roomNumber = roomNumber;
		this.occupancyLimit = occupancyLimit;
		this.buildingName = buildingName;
	}
	public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
	public void setOccupancyLimit(int occupancyLimit) { this.occupancyLimit = occupancyLimit; }
	public void setBuildingName(String buildingName) { this.buildingName = buildingName; }
	public int roomNumber() { return roomNumber; }
	public int occupancyLimit() { return occupancyLimit; }
	public String buildingName() { return buildingName; }
}
