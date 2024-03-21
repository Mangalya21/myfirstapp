package com.example.hackathon;

public class requestMenuItems {
    String BloodBankName;
    String DateOfAppoinment;
    String ApprovalStatus;

    public requestMenuItems(String bloodBankName, String dateOfAppoinment, String approvalStatus) {
        BloodBankName = bloodBankName;
        DateOfAppoinment = dateOfAppoinment;
        ApprovalStatus = approvalStatus;
    }

    public String getBloodBankName() {
        return BloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        BloodBankName = bloodBankName;
    }

    public String getDateOfAppoinment() {
        return DateOfAppoinment;
    }

    public void setDateOfAppoinment(String dateOfAppoinment) {
        DateOfAppoinment = dateOfAppoinment;
    }

    public String getApprovalStatus() {
        return ApprovalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        ApprovalStatus = approvalStatus;
    }
}
