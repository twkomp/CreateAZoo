package com.company.people;

public class Visitors extends People {

    private int groupSize;
    private boolean Allergies;
    private boolean hasMembership;
    private String homeAddress;

    public Visitors(int age, int name, char gender, String race, int groupSize, boolean allergies, boolean hasMembership, String homeAddress) {
        super(age, name, gender, race);
        this.groupSize = groupSize;
        Allergies = allergies;
        this.hasMembership = hasMembership;
        this.homeAddress = homeAddress;
    }

    public int getGroupSize() {

        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public boolean isAllergies() {
        return Allergies;
    }

    public void setAllergies(boolean allergies) {
        Allergies = allergies;
    }

    public boolean isHasMembership() {
        return hasMembership;
    }

    public void setHasMembership(boolean hasMembership) {
        this.hasMembership = hasMembership;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
