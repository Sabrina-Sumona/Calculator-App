import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.pow;

public class Calculator extends JFrame {
    private JPanel mainPanel;

    private JButton button01;
    private JButton button02;
    private JButton button03;
    private JButton button04;
    private JButton button05;
    private JButton button06;
    private JButton button07;
    private JButton button08;
    private JButton button09;
    private JButton button10;

    private JTextField output;
    private JButton clear;
    private JButton sum;
    private JButton sub;
    private JButton mul;
    private JButton div;
    private JButton equal;
    private JLabel A;
    private JLabel Operator;
    private JLabel B;
    private JButton reset;
    private JLabel Answer;
    private JButton dot;
    private JButton mod;
    private JButton power;
    private JButton root;

    public Calculator(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
//        output.setBackground(Color.GRAY);
            button01.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+1);
                }
            });
            button02.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+2);
                }
            });
            button03.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+3);
                }
            });
            button04.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+4);
                }
            });
            button05.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+5);
                }
            });
            button06.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+6);
                }
            });
            button07.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+7);
                }
            });
            button08.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+8);
                }
            });
            button09.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+9);
                }
            });
            button10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText(output.getText()+0);
                }
            });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("");
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.parseDouble(output.getText());
                A.setText(String.valueOf(a));
                output.setText("");
                B.setText("B");
                Operator.setText("x");
                Answer.setText("Answer");
            }
        });
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.parseDouble(output.getText());
                A.setText(String.valueOf(a));
                output.setText("");
                B.setText("B");
                Operator.setText("+");
                Answer.setText("Answer");
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.parseDouble(output.getText());
                A.setText(String.valueOf(a));
                output.setText("");
                B.setText("B");
                Operator.setText("-");
                Answer.setText("Answer");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.parseDouble(output.getText());
                A.setText(String.valueOf(a));
                output.setText("");
                B.setText("B");
                Operator.setText("÷");
                Answer.setText("Answer");
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double b = Double.parseDouble(output.getText());
                B.setText(String.valueOf(b));
                output.setText("");
                String op = Operator.getText();
                switch (op) {
                    case "+": {
                        Double ans = Double.parseDouble(A.getText()) + Double.parseDouble(B.getText());
                        Answer.setText(String.valueOf(ans));
                        break;
                    }
                    case "-": {
                        Double ans = Double.parseDouble(A.getText()) - Double.parseDouble(B.getText());
                        Answer.setText(String.valueOf(ans));
                        break;
                    }
                    case "x": {
                        Double ans = Double.parseDouble(A.getText()) * Double.parseDouble(B.getText());
                        Answer.setText(String.valueOf(ans));
                        break;
                    }
                    case "÷": {
                        Double ans = Double.parseDouble(A.getText()) / Double.parseDouble(B.getText());
                        Answer.setText(String.valueOf(ans));
                        break;
                    }
                    case "%": {
                        Double ans = Double.parseDouble(A.getText()) % Double.parseDouble(B.getText());
                        Answer.setText(String.valueOf(ans));
                        break;
                    }
                    case "^": {
                        Double ans = pow(Double.parseDouble(A.getText()), Double.parseDouble(B.getText()));
                        Answer.setText(String.valueOf(ans));
                        break;
                    }
                    case "√": {
                        Double ans = Math.sqrt(Double.parseDouble(B.getText()));
                        Answer.setText(String.valueOf(ans));
                        break;
                    }
                    default:
                        Answer.setText("Invalid operation!");
                        break;
                }
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText("Answer");
                A.setText("A");
                Operator.setText("Operator");
                B.setText("B");
            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(output.getText()+".");
            }
        });
        mod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.parseDouble(output.getText());
                A.setText(String.valueOf(a));
                output.setText("");
                B.setText("B");
                Operator.setText("%");
                Answer.setText("Answer");
            }
        });
        power.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.parseDouble(output.getText());
                A.setText(String.valueOf(a));
                output.setText("");
                B.setText("B");
                Operator.setText("^");
                Answer.setText("Answer");
            }
        });
        root.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A.setText(String.valueOf(2));
                output.setText("");
                B.setText("B");
                Operator.setText("√");
                Answer.setText("Answer");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Calculator("Calculator");
        frame.setVisible(true);
        frame.setSize(700,350);
    }

}
