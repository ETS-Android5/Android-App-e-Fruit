package com.unipi.p17172.nikolaspateras.sms13033.Items;

public class Item {
    int id;
    String smsNumber;
    String smsReason;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    boolean isChecked = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSmsNumber() {
        return smsNumber;
    }

    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }

    public String getSmsReason() {
        return smsReason;
    }

    public void setSmsReason(String smsReason) {
        this.smsReason = smsReason;
    }
}
