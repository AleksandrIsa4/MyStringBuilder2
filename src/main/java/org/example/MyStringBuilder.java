package org.example;

public class MyStringBuilder{

    private Snapshot snapshot;
    private StringBuilder sb;

    public MyStringBuilder() {
        sb = new StringBuilder();
        createSnapshot();
    }

    public MyStringBuilder append(String str) {
        createSnapshot();
        sb.append(str);
        return this;
    }

    public String toString() {
        return sb.toString();
    }

    public void createSnapshot() {
        this.snapshot = new Snapshot(sb.toString(), snapshot);
    }

    public void undo() {
        if (snapshot != null) {
            sb = (snapshot.getValue() == null) ? new StringBuilder() : new StringBuilder(snapshot.getValue());
            this.snapshot = snapshot.getSnapshot();
        }
    }
}

class Snapshot {

    private String value;
    private Snapshot snapshot;

    public Snapshot(String value, Snapshot snapshot) {
        this.value = value;
        this.snapshot = snapshot;
    }

    public Snapshot getSnapshot() {
        return snapshot;
    }

    public String getValue() {
        return value;
    }
}