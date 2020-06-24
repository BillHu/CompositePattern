package com.tarehong.compositepattern;

/**
 * @author billhu
 */
public class TextBox extends Component {
    public TextBox(String name) {
        super(name);
    }

    @Override
    public void printComponent() {
        System.out.println(this.name);
    }
}
