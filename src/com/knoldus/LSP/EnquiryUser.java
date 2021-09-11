package com.knoldus.LSP;

public class EnquiryUser extends Member{
    public EnquiryUser(String name){
        super(name);
        this.memberType = "Enquiry";
    }

    @Override
    public String getDatabase() {
        return "Added to the Enquiry Info to DB";
    }
}
