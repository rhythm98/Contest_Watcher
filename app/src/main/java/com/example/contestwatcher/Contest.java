package com.example.contestwatcher;

public class Contest {
    private int id;
    private String name="";
    private String type="";
    private String phase="";
//    private enum type{
//        CF, IOI, ICPC;
//    }
//    private enum phase{
//        BEFORE, CODING, PENDING_SYSTEM_TEST, SYSTEM_TEST, FINISHED;
//    }
    /*
    public enum EventStatus {
        PENDING(1), OPEN(2), DISPATCHED(3), APPENDED(4), CLOSED(5), REQUESTED_TO_CLOSE(
                6), ACTION_REQUESTED_FROM_POLICE_STATION(7), ACTION_REQUESTED_FROMD_ISPATCHER(
                8), ACTION_REQUESTED_FROM_SUPERVISOR(9);
        private int value;
        private EventStatus(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
        //Just for testing from some SO answers, but no use
        public void setValue(int value) {
            this.value = value;
        }
        public static EventStatus getEventStatusById(int id) {
            EventStatus event = null;
            switch (id) {
                case 1:
                    event = PENDING;
                    break;
                case 2:
                    event = OPEN;
                    break;
                default:
                    break;
            }
            return event;
        }
    }
    */  //<--ENUM Getter Setter

    private Boolean frozen=false;
    private int durationSeconds=-1;
    private int startTimeSeconds=-1;
    private int relativeTimeSeconds=-1;
    private String preparedBy="";

    public void setType(String type) {
        this.type = type;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getType() {
        return type;
    }

    public String getPhase() {
        return phase;
    }

    private String websiteUrl;
    private String description;
    private int difficulty;
    private String kind;
    private String icpcRegion;
    private String country;
    private String city;
    private String season;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public void setStartTimeSeconds(int startTimeSeconds) {
        this.startTimeSeconds = startTimeSeconds;
    }

    public void setRelativeTimeSeconds(int relativeTimeSeconds) {
        this.relativeTimeSeconds = relativeTimeSeconds;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setIcpcRegion(String icpcRegion) {
        this.icpcRegion = icpcRegion;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getFrozen() {
        return frozen;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public int getStartTimeSeconds() {
        return startTimeSeconds;
    }

    public int getRelativeTimeSeconds() {
        return relativeTimeSeconds;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getKind() {
        return kind;
    }

    public String getIcpcRegion() {
        return icpcRegion;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getSeason() {
        return season;
    }
}