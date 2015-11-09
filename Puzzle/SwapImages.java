import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCanvas extends Canvas
{
Image i,j;
int flag;
MyCanvas()
{
Toolkit t= Toolkit.getDefaultToolkit();
i=t.getImage("penguins.jpg"); //PATH OF FIRST IMAGE
j=t.getImage("Lighthouse.jpg"); //PATH OF SECOND IMAGE
}

public void paint(Graphics g)
{
if(flag==0)
{
g.drawImage(i,50,50,this);
g.drawImage(j,300,50,this);
}
if (flag==1)
{
g.drawImage(i,300,50,this);
g.drawImage(j,50,50,this);
}
}
}

class SwapImages implements ActionListener 
{
MyCanvas m= new MyCanvas();
JFrame jf;
SwapImages()
{
jf=new JFrame("SWAP IMAGES");
jf.add(m);
JButton button1=new JButton("Swap");
Panel p=new Panel();
p.add(button1);
jf.add(p,BorderLayout.SOUTH);
button1.addActionListener(this);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(400,400);
jf.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(m.flag==0)
m.flag=1;
else 
m.flag=0;
m.repaint();
}

public static void main(String s[])
{
new SwapImages();
}
}