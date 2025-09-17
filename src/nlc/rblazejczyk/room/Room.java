package nlc.rblazejczyk.room;

import java.util.ArrayList;


public abstract class Room {
    private String roomName;

    public double getAreaSqM() {
        return areaSqM;
    }

    public void setAreaSqM(double areaSqM) {
        this.areaSqM = areaSqM;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    private double areaSqM;
    private int floor;//no of the floors in property
    private ArrayList<String> items;


    public Room(String roomName, double areaSqM, int floor, ArrayList<String> items) {
        this.roomName = roomName;
        this.areaSqM = areaSqM;
        this.floor = floor;
        this.items = items;
    }


}
