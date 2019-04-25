package com.example.registerpage;

import java.util.ArrayList;

public class Members {
    String membername;
    String memberid;
    double mbalance;
    ArrayList transactions;
    Members()
    {

    }
    Members(String membername,String memberid,double bal){
        this.membername=membername;
        this.memberid=memberid;
        this.mbalance=bal;
        this.transactions=transactions;
    }
    Members(String memberid,double mbalance){
        this.memberid=memberid;
        this.mbalance=mbalance;
    }

    public String getMembername() {
        return membername;
    }

    public String getMemberid() {
        return memberid;
    }

    public double getMbalance() {
        return mbalance;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList transactions) {
        this.transactions = transactions;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public void setMbalance(double mbalance) {
        this.mbalance = mbalance;
    }
}
