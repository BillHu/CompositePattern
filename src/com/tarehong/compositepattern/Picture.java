package com.tarehong.compositepattern;


/**
 * @author billhu
 */
public class Picture extends Component {
    public Picture(String name) {
        super(name);
    }

    @Override
    public void printComponent() {
        System.out.println(this.name);
    }
}
