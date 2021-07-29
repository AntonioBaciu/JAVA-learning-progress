package academy.learnprogramming;

public class House {
    private Room room;
    private Furniture furniture;
    private SofaDimensions sofaDimensions;
    private TvDimensions tvDimensions;
    private RoomDimensions roomDimensions;

    public House(Room room, Furniture furniture, SofaDimensions sofaDimensions, TvDimensions tvDimensions, RoomDimensions roomDimensions) {
        this.room = room;
        this.furniture = furniture;
        this.sofaDimensions = sofaDimensions;
        this.tvDimensions = tvDimensions;
        this.roomDimensions = roomDimensions;
    }

    public void HouseInfo() {
        room.roomInfo();
        furniture.furnitureInfo();
        sofaDimensions.sofaMeasures();
        tvDimensions.tvDimensions();
        roomDimensions.roomMeasures();
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
