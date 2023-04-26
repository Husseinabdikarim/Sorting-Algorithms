package com.husseinabdikarim;

import java.util.Comparator;

public class Route implements Comparable<Route>{
    private String source;
    private String destination;


    public Route(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public int compareTo(Route o) {

        int position = 0;
        if (this.source.compareTo(o.source) == 0) {
            if (this.destination.compareTo(o.destination) > 0) {
                position = 1;
            } else
                position = -1;
        } else if (this.source.compareTo(o.source) > 0) {
            position = 1;
        } else if(this.source.compareTo(o.source) < 0)
            position = -1;

        return position;

    }

    @Override
    public String toString() {
        return source + " " + destination + "\n";
    }
}
