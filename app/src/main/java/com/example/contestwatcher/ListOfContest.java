package com.example.contestwatcher;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ListOfContest {
    @SerializedName("result")
    ArrayList<Contest> contests;
    private String status;
    private String comment;



    public void setStatus(String status) {
        this.status = status;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setContests(ArrayList<Contest> contests) {
        this.contests = contests;
    }

    public ArrayList<Contest> getContests() {
        return contests;
    }

    public String getStatus() {
        return status;
    }
}
