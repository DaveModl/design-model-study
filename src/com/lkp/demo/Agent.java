package com.lkp.demo;

public class Agent {
    private Stars star;
    private Fans fans;
    private Company company;

    public Stars getStar() {
        return star;
    }

    public void setStar(Stars star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void fansMeeting(){
        System.out.println(fans.getName() + " meeting " + star.getName());
    }

    public void work(){
        System.out.println(star.getName() + " work with " + company.getName() );
    }
}
