package com.tarehong.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author billhu
 */
public class Frame extends Component {

    private final List<Component> childComponents = new ArrayList<>();

    public Frame(String name) {
        super(name);
    }

    @Override
    public void printComponent() {
        System.out.println(this.name);
        for (Component component : childComponents) {
            component.printComponent();
        }
    }

    public void addComponent(Component component) {
        childComponents.add(component);
    }

    public void removeComponent(Component component) {
        childComponents.remove(component);
    }
}
