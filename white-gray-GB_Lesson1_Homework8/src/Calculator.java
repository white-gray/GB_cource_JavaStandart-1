import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame mainFrame;
    public Calculator() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Calculator");
        mainFrame.setBounds(500, 100, 300, 300);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JPanel left = new JPanel();
        left.setLayout(new GridLayout(2, 5));
        JPanel right = new JPanel();
        right.setLayout(new GridLayout(4, 1));
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(3, 1));

        mainFrame.add(top, BorderLayout.NORTH);
        mainFrame.add(left, BorderLayout.WEST);
        mainFrame.add(right, BorderLayout.EAST);
        mainFrame.add(bottom, BorderLayout.SOUTH);

        JTextField outField = new JTextField();
        outField.setEditable(false);
        top.add(outField, BorderLayout.CENTER);

        // задаём размеры и положение кнопок


        ActionButtonListener abListener = new ActionButtonListener(outField);
        for (int i = 0; i <= 9; i++) {
            JButton digitBtn = new JButton(String.valueOf(i));
            left.add(digitBtn);
            digitBtn.addActionListener(abListener);
        }
        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(abListener);
        right.add(plusBtn);
        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(abListener);
        right.add(minusBtn);
        JButton multiolyBtn = new JButton("*");
        multiolyBtn.addActionListener(abListener);
        right.add(multiolyBtn);
        JButton divideBtn = new JButton("/");
        divideBtn.addActionListener(abListener);
        right.add(divideBtn);
        JButton submitBtn = new JButton("=");
        submitBtn.addActionListener(abListener);
        bottom.add(submitBtn);
        JButton cancelOneBtn = new JButton("Delete");
        cancelOneBtn.addActionListener(abListener);
        bottom.add(cancelOneBtn);
        JButton cancelAllBtn = new JButton("Clear");
        cancelAllBtn.addActionListener(abListener);
        bottom.add(cancelAllBtn);
        mainFrame.setVisible(true);}

    }

