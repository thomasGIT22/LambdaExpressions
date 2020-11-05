package com.stout;

/**
 * A simple Widget for demonstrating lambda expressions.
 *
 * @author Bob Trapp
 */
public class Widget implements Comparable<Widget> {

    /**
     * A numeric value.
     */
    private int value;

    /**
     * The name of the Widget.
     */
    private String name;

    /**
     * The full constructor.
     *
     * @param value a numeric value
     * @param name the name of the Widget
     */
    public Widget(int value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * An override of toString()
     *
     * @return a String representation of the Widget
     */
    @Override
    public String toString() {
        return "Widget{" + "value=" + value + ", name=" + name + '}';
    }



    /**
     * A numeric value.
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * A numeric value.
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * The name of the Widget.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the Widget.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An implementation of Comparable to help sort Widget objects by value.
     *
     * @param otherWidget
     * @return
     */
    @Override
    public int compareTo(Widget otherWidget) {
        return this.value = otherWidget.getValue();
    }

}
