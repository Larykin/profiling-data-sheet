package com.example.larykin.profilingdatasheet;

/**
 * Created by larykin on 27/10/2017.
 */

public class Person {
    private int id;
    private String location;
    private String proxemics;
    private String date;
    private String weather;
    private String temp;
    private boolean gender;
    private String height;
    private String weight;
    private int handedness;
    private int breathing;
    private String presence;
    private String posture;
    private String shoes;
    private String colors;
    private String breathrate;
    private String blinkrate;
    private String shutterspd;
    private String hygiene;
    private String description;
    private String initges;
    private String interges;
    private boolean appreciation;
    private boolean acceptance;
    private boolean approval;
    private boolean intelligence;
    private boolean pity;
    private boolean admiration;
    private boolean power;
    private String weaknesses;
    private String dislikes;
    private String pronouns;
    private String adjectives;
    private int ght_hand;
    private int ght_association;
    private String inter2ges;
    private String phrases;
    private String tolookup;
    private String sketch;
    private String notes;

    public Person(){}

    public Person(String location, String proxemics, String date, String weather, String temp,
                  boolean gender, String height, String weight, int handedness, int breathing,
                  String presence, String posture, String shoes, String colors, String breathrate,
                  String blinkrate, String shutterspd, String hygiene, String description,
                  String initges, String interges, boolean appreciation, boolean acceptance,
                  boolean approval, boolean intelligence, boolean pity, boolean admiration,
                  boolean power, String weaknesses, String dislikes, String pronouns,
                  String adjectives, int ght_hand, int ght_association, String inter2ges,
                  String phrases, String tolookup, String sketch, String notes) {
        super();
        this.location = location;
        this.proxemics = proxemics;
        this.date = date;
        this.weather = weather;
        this.temp = temp;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.handedness = handedness;
        this.breathing = breathing;
        this.presence = presence;
        this.posture = posture;
        this.shoes = shoes;
        this.colors = colors;
        this.breathrate = breathrate;
        this.blinkrate = blinkrate;
        this.shutterspd = shutterspd;
        this.hygiene = hygiene;
        this.description = description;
        this.initges = initges;
        this.interges = interges;
        this.appreciation = appreciation;
        this.acceptance = acceptance;
        this.approval = approval;
        this.intelligence = intelligence;
        this.pity = pity;
        this.admiration = admiration;
        this.power = power;
        this.weaknesses = weaknesses;
        this.dislikes = dislikes;
        this.pronouns = pronouns;
        this.adjectives = adjectives;
        this.ght_hand = ght_hand;
        this.ght_association = ght_association;
        this.inter2ges = inter2ges;
        this.phrases = phrases;
        this.tolookup = tolookup;
        this.sketch = sketch;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", location=" + location + ", gender=" + gender + "]";
    }

    public String getLocation() {
        return location;
    }

    public boolean getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getProxemics() {
        return proxemics;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemp() {
        return temp;
    }

    public String getWeight() {
        return weight;
    }

    public String getHeight() {
        return height;
    }

    public String getPresence() {
        return presence;
    }

    public String getPosture() {
        return posture;
    }

    public String getShoes() {
        return shoes;
    }

    public String getColors() {
        return colors;
    }

    public String getBreathrate() {
        return breathrate;
    }

    public String getBlinkrate() {
        return blinkrate;
    }

    public String getShutterspd() {
        return shutterspd;
    }

    public String getHygiene() {
        return hygiene;
    }

    public String getDescription() {
        return description;
    }

    public String getInitges() {
        return initges;
    }

    public String getInterges() {
        return interges;
    }

    public boolean getAppreciation() {
        return appreciation;
    }

    public boolean getAcceptance() {
        return acceptance;
    }

    public boolean getApproval() {
        return approval;
    }

    public boolean getIntelligence() {
        return intelligence;
    }

    public boolean getPity() {
        return pity;
    }

    public boolean getAdmiration() {
        return admiration;
    }

    public boolean getPower() {
        return power;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public String getDislikes() {
        return dislikes;
    }

    public String getPronouns() {
        return pronouns;
    }

    public String getAdjectives() {
        return adjectives;
    }

    public String getInter2ges() {
        return inter2ges;
    }

    public String getPhrases() {
        return phrases;
    }

    public String getTolookup() {
        return tolookup;
    }

    public String getSketch() {
        return sketch;
    }

    public String getNotes() {
        return notes;
    }

    public void setProxemics(String proxemics) {
        this.proxemics = proxemics;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int getHandedness() {
        return handedness;
    }

    public int getBreathing() {
        return breathing;
    }

    public int getGhtHand() {
        return ght_hand;
    }

    public int getGhtAssociation() {
        return ght_association;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setHandedness(int handedness) {
        this.handedness = handedness;
    }

    public void setBreathing(int breathing) {
        this.breathing = breathing;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public void setPosture(String posture) {
        this.posture = posture;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setBreathrate(String breathrate) {
        this.breathrate = breathrate;
    }

    public void setBlinkrate(String blinkrate) {
        this.blinkrate = blinkrate;
    }

    public void setShutterspd(String shutterspd) {
        this.shutterspd = shutterspd;
    }

    public void setHygiene(String hygiene) {
        this.hygiene = hygiene;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInitges(String initges) {
        this.initges = initges;
    }

    public void setInterges(String interges) {
        this.interges = interges;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public void setAdjectives(String adjectives) {
        this.adjectives = adjectives;
    }

    public void setGhtHand(int ghtHand) {
        this.ght_hand = ghtHand;
    }

    public void setGhtAssociation(int ghtAssociation) {
        this.ght_association = ghtAssociation;
    }

    public void setInter2ges(String inter2ges) {
        this.inter2ges = inter2ges;
    }

    public void setPhrases(String phrases) {
        this.phrases = phrases;
    }

    public void setTolookup(String tolookup) {
        this.tolookup = tolookup;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setAppreciation(boolean appreciation) {
        this.appreciation = appreciation;
    }

    public void setAcceptance(boolean acceptance) {
        this.acceptance = acceptance;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }

    public void setIntelligence(boolean intelligence) {
        this.intelligence = intelligence;
    }

    public void setPity(boolean pity) {
        this.pity = pity;
    }

    public void setAdmiration(boolean admiration) {
        this.admiration = admiration;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
