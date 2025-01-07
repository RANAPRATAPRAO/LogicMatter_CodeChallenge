package com.studentfilterapp.model;

public class Student {
    private int id;
    private String name;
    private int english;
    private int maths;
    private int science;
    private int socialScience;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEnglish() { return english; }
    public void setEnglish(int english) { this.english = english; }

    public int getMaths() { return maths; }
    public void setMaths(int maths) { this.maths = maths; }

    public int getScience() { return science; }
    public void setScience(int science) { this.science = science; }

    public int getSocialScience() { return socialScience; }
    public void setSocialScience(int socialScience) { this.socialScience = socialScience; }
}
