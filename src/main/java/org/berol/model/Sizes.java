package org.berol.model;

public class Sizes {

    private float length;
    private float width;
    private float depth;

    public Sizes(float length, float width, float depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public float getLength() { return length; }

    public void setLength(float length) { this.length = length; }

    public float getWidth() { return width; }

    public void setWidth(float width) { this.width = width; }

    public float getDepth() { return depth; }

    public void setDepth(float depth) { this.depth = depth; }

}
