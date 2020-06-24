package com.tarehong.compositepattern;

/**
 * @author billhu
 */
public class Label extends Component {

    public Label(String name) {
        super(name);
    }

    @Override
    public void printComponent() {
        System.out.println(this.name);
    }
}
