package com.tarehong.compositepattern;

/**
 * @author billhu
 */
public class PasswordBox extends Component {
    public PasswordBox(String name) {
        super(name);
    }

    @Override
    public void printComponent() {
        System.out.println(this.name);
    }
}
