package org.example;

public class MyStringBuilder extends MyAbstractStringBuilder {

    private Snapshot snapshot;

    public MyStringBuilder() {
        super(16);
        createSnapshot();
    }

    public MyStringBuilder(int capacity) {
        super(capacity);
        createSnapshot();
    }

    public MyStringBuilder(String str) {
        super(str);
        createSnapshot();
    }

    @Override
    public MyAbstractStringBuilder append(String str) {
        createSnapshot();
        return super.append(str);
    }

    public String toString() {
        return value.length == 0 ? null : new String(value);
    }

    public void createSnapshot() {
        this.snapshot = new Snapshot(value, count, snapshot);
    }

    public void undo() {
        if (snapshot != null) {
            this.value = snapshot.getValue();
            this.count = snapshot.getCount();
            this.snapshot = snapshot.getSnapshot();
        }
    }
}

class Snapshot {

    private byte[] value;

    private int count;

    private Snapshot snapshot;

    public Snapshot(byte[] value, int count, Snapshot snapshot) {
        this.value = value;
        this.count = count;
        this.snapshot = snapshot;
    }

    public Snapshot getSnapshot() {
        return snapshot;
    }

    public int getCount() {
        return count;
    }


    public byte[] getValue() {
        return value;
    }

}
