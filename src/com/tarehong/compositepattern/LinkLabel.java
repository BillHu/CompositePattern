package com.tarehong.compositepattern;

/**
 * @author billhu
 */
public class LinkLabel extends Component {
    public LinkLabel(String name) {
        super(name);
    }

    @Override
    public void printComponent() {
        System.out.println(this.name);
    }
}
