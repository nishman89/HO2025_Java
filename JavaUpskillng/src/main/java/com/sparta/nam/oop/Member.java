package com.sparta.nam.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Member implements Moveable {

    // Private fields
    private String firstName;
    private String lastName;
    private LocalDate joinDate;

    // Public methods to expose the private fields we want

    // Ctor - they are a special method
    // Must have the same name as the class
    // No return type is stated, because it returns the Class as a type
    public Member(String firstName, String lastName, int year, int month, int day){
        this(firstName, lastName);
        this.joinDate = LocalDate.of(year, month, day);
    }

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // How long has this person been a member
    public long getMemberDays(){
        // comparing the join date, to now, and giving the difference in days
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName() + " has been a member for " + getMemberDays() + " days.";
    }

    @Override
    public String move() {
        return "I am moving!!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(firstName, member.firstName) && Objects.equals(lastName, member.lastName) && Objects.equals(joinDate, member.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, joinDate);
    }
}
