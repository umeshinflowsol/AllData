package com.inflow.annotation;


public class Author {
    private String authorName;
    private String address;


    public Author(String authorName, String address) {
        this.authorName = authorName;
        this.address = address;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
