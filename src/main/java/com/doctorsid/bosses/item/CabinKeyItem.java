package com.doctorsid.bosses.item;

public class CabinKeyItem {
    private String itemName;
    private String description;

    public CabinKeyItem() {
        this.itemName = "Cabin Key";
        this.description = "A key item used to unlock the cabin door.";
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }
}