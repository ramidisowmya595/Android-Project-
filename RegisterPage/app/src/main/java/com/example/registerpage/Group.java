package com.example.registerpage;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupname;
    String groupid;
   ArrayList<Members> members;
    Group(String groupname, String groupid, ArrayList<Members> members){
        this.groupname=groupname;
        this.groupid=groupid;
        this.members= members;
    }

    public String getGroupname() {
        return groupname;
    }

    public String getGroupid() {
        return groupid;
    }

    public ArrayList<Members> getMembers() {
        return members;
    }
}
