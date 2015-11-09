import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Puzzle implements ActionListener 
{
	JFrame f;
	Button[] b=new Button[9];
	String s;
	Puzzle()
	{
		f=new JFrame();
		for(int i=0,y=0,k=0;i<3;i++)
		{
			
			for(int j=0,x=0;j<3;j++,k++)
			{
				if(k<8)
				s=String.valueOf(k);
				else
					s="";
				b[k]=new Button(s);

				b[k].setBounds(x,y,100,100);
				f.add(b[k]);
				b[k].addActionListener(this);
				x=x+100;
			}y=y+100;
	

		}
		f.setLayout(null);
		f.setSize(325,340);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		//b[8].setBackground(Color.BLACK);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[0])
		{
			//b[0].setBackground(Color.BLACK);
			if(b[1].getLabel()=="")
			{
				b[1].setLabel(b[0].getLabel());
				b[0].setLabel("");
				//b[1].setBackground(null);
			}
			else if(b[3].getLabel()=="")
			{
				
				b[3].setLabel(b[0].getLabel());
				b[0].setLabel("");
				//b[3].setBackground(null);
			}
		}
		if(e.getSource()==b[1])
		{
			//b[1].setBackground(Color.BLACK);
			if(b[0].getLabel()=="")
			{
				b[0].setLabel(b[1].getLabel());
				b[1].setLabel("");
				//b[1].setBackground(null);
				
			}
			else if(b[2].getLabel()=="")
			{
				
				b[2].setLabel(b[1].getLabel());
				b[1].setLabel("");
				//b[1].setBackground(null);
			}
			else if(b[4].getLabel()=="")
			{
				b[4].setLabel(b[1].getLabel());
				b[1].setLabel("");
				//b[1].setBackground(null);
			}
			//b[1].setBackground(Color.RED);
		}
		if(e.getSource()==b[2])
		{
			//b[2].setBackground(Color.BLACK);
			if(b[1].getLabel()=="")
			{
				b[1].setLabel(b[2].getLabel());
				b[2].setLabel("");
				//b[2].setBackground(null);
			}
			else if(b[5].getLabel()=="")
			{
				
				b[5].setLabel(b[2].getLabel());
				b[2].setLabel("");
				//b[2].setBackground(null);
			}
			//b[2].setBackground(Color.RED);
		}
		if(e.getSource()==b[3])
		{
			//b[3].setBackground(Color.BLACK);
			if(b[0].getLabel()=="")
			{
				b[0].setLabel(b[3].getLabel());
				b[3].setLabel("");
				//b[3].setBackground(null);
			}
			else if(b[6].getLabel()=="")
			{
				
				b[6].setLabel(b[3].getLabel());
				b[3].setLabel("");
				//b[3].setBackground(null);
			}//b[3].setBackground(Color.RED);\
			else if(b[4].getLabel()=="")
			{
				
				b[4].setLabel(b[3].getLabel());
				b[3].setLabel("");
				//b[3].setBackground(null);
			}
		}
		if(e.getSource()==b[4])
		{
			//b[4].setBackground(Color.BLACK);
			if(b[5].getLabel()=="")
			{
				b[5].setLabel(b[4].getLabel());
				b[4].setLabel("");
				//b[4].setBackground(null);
			}
			else if(b[3].getLabel()=="")
			{
				
				b[3].setLabel(b[4].getLabel());
				b[4].setLabel("");
				//b[4].setBackground(null);
			}
			
			else if(b[1].getLabel()=="")
			{
				b[1].setLabel(b[4].getLabel());
				b[4].setLabel("");
				//b[4].setBackground(null);
			}
			
			else if(b[7].getLabel()=="")
			{
				b[7].setLabel(b[4].getLabel());
				b[4].setLabel("");
				//b[4].setBackground(null);
			}//b[4].setBackground(Color.RED);

		}
		if(e.getSource()==b[5])
		{
			//b[5].setBackground(Color.BLACK);
			if(b[2].getLabel()=="")
			{
				b[2].setLabel(b[5].getLabel());
				b[5].setLabel("");
				//b[5].setBackground(null);
			}
			else if(b[8].getLabel()=="")
			{
				
				b[8].setLabel(b[5].getLabel());
				b[5].setLabel("");
				//b[5].setBackground(null);
			}
			
			else if(b[4].getLabel()=="")
			{
				b[4].setLabel(b[5].getLabel());
				b[5].setLabel("");
				//b[5].setBackground(null);
			}//b[5].setBackground(Color.RED);
		}
		if(e.getSource()==b[6])
		{
			//b[6].setBackground(Color.BLACK);
			if(b[3].getLabel()=="")
			{
				b[3].setLabel(b[6].getLabel());
				b[6].setLabel("");
				//b[6].setBackground(null);
			}
			else if(b[7].getLabel()=="")
			{
				
				b[7].setLabel(b[6].getLabel());
				b[6].setLabel("");
				//b[6].setBackground(null);
			}//b[6].setBackground(Color.RED);
		}
		if(e.getSource()==b[7])
		{
		
			//b[7].setBackground(Color.BLACK);
			if(b[4].getLabel()=="")
			{
				b[4].setLabel(b[7].getLabel());
				b[7].setLabel("");
				//b[7].setBackground(null);
			}
			else if(b[6].getLabel()=="")
			{
				
				b[6].setLabel(b[7].getLabel());
				b[7].setLabel("");
				//b[7].setBackground(null);
			}	
			
			else if(b[8].getLabel()=="")
			{
				b[8].setLabel(b[7].getLabel());
				b[7].setLabel("");
				//b[7].setBackground(null);
			}
			//b[7].setBackground(Color.RED);
		}
		if(e.getSource()==b[8])
		{
			//b[8].setBackground(Color.BLACK);
			if(b[5].getLabel()=="")
			{
				b[5].setLabel(b[8].getLabel());
				b[8].setLabel("");
				//b[8].setBackground(null);
			}
			else if(b[7].getLabel()=="")
			{
				
				b[7].setLabel(b[8].getLabel());
				b[8].setLabel("");
				//b[8].setBackground(null);
			}//b[8].setBackground(Color.RED);
		}
	}
	public static void main(String[] args) 
	{
		new Puzzle();
	}
}
