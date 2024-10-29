package com.ify.co.ad;

public class Advertisement {
    private Object content; // the video
    private String name; // the name or the title
    private long amountPaid; // The amount paid for ads in cents
    private int impressionsRemaining; // the number of impressions that have been paid for but not shown.
    private int duration; // the duration in seconds

    public Advertisement(Object content, String name, long amountPaid, int impressionsRemaining, int duration) {
        this.content = content;
        this.name = name;
        this.amountPaid = amountPaid;
        this.impressionsRemaining = impressionsRemaining;
        this.duration = duration;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(long amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getImpressionsRemaining() {
        return impressionsRemaining;
    }

    public void setImpressionsRemaining(int impressionsRemaining) {
        this.impressionsRemaining = impressionsRemaining;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
