package com.tarehong;

import com.tarehong.compositepattern.*;

/**
 * @author billhu
 */
public class Main {

    public static void main(String[] args) {

        WinForm winForm = new WinForm("WINDOW窗口");
        winForm.addComponent(new Picture("LOGO图片"));
        winForm.addComponent(new Button("登录"));
        winForm.addComponent(new Button("注册"));

        Frame frame1 = new Frame("FRAME1");
        frame1.addComponent(new Label("用户名"));
        frame1.addComponent(new TextBox("文本框"));
        frame1.addComponent(new Label("密码"));
        frame1.addComponent(new PasswordBox("密码框"));
        frame1.addComponent(new CheckBox("复选框"));
        frame1.addComponent(new TextBox("记住用户名"));
        frame1.addComponent(new LinkLabel("忘记密码"));
        winForm.addComponent(frame1);


        winForm.printComponent();

    }
}
