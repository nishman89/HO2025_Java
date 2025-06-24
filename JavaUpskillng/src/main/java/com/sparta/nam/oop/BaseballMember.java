package com.sparta.nam.oop;

public class BaseballMember extends Member {

    private String position;
    public BaseballMember(String firstName, String lastName, int year, int month, int day, String position) {
        super(firstName, lastName, year, month, day);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return getFullName() + " has been a member for " + getMemberDays() + " days. In position " + position;
    }
}
