package com.tarehong.compositepattern;

/**
 * @author billhu
 */
public class Button extends Component{

    public Button(String name) {
        super(name);
    }

    @Override
    public void printComponent() {
        System.out.println(super.name);
    }
}
