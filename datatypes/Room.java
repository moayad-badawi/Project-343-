package datatypes;
// change roomNumber to roomID
public class Room
{
	private int id;
	private int occupancyLimit;
	private String buildingName;
	public Room(int id, int occupancyLimit, String buildingName)
	{
		this.id = id;
		this.occupancyLimit = occupancyLimit;
		this.buildingName = buildingName;
	}
	public void setRoomID(int id) { this.id = id; }
	public void setOccupancyLimit(int occupancyLimit) { this.occupancyLimit = occupancyLimit; }
	public void setBuildingName(String buildingName) { this.buildingName = buildingName; }
	public int id() { return id; }
	public int occupancyLimit() { return occupancyLimit; }
	public String buildingName() { return buildingName; }
}
