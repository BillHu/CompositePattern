package com.tarehong.compositepattern;

/**
 * @author billhu
 */
public class CheckBox extends Component {
    public CheckBox(String name) {
        super(name);
    }

    @Override
    public void printComponent() {
        System.out.println(this.name);
    }
}
