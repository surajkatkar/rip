//importing awt package for use
import java.awt.*;
import java.awt.event.*;

class First extends Frame
{
	/* TextField name,pass;
    Button b1,b2;
    First()
    {
        setLayout(new FlowLayout());
        this.setLayout(null);
        Label n=new Label("Name:");
        Label p=new Label("password:");
        name=new TextField(20);
        pass=new TextField(20);
        pass.setEchoChar('#');
        b1=new Button("submit");
        b2=new Button("cancel");
        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
        this.add(b1);
        this.add(b2);
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
        name.setBounds(200,100,90,20);
        pass.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
        b2.setBounds(180,260,70,40);
 
    }
    public static void main(String args[])
    {
        First ml=new First();
        ml.setVisible(true);
        ml.setSize(400,400);
        ml.setTitle("my login window");
 
    }*/
	First()
	{
		
		this.setLayout(null);
		
		Label name=new Label("Name",Label.CENTER);
		TextField n=new TextField(20);
		this.add(n);
		name.setBounds(10,10,10,10);
		n.setBounds(30,10,10,10);
		this.add(name);
		

		Label pass=new Label("Password");
		System.out.println("hello");
		this.add(pass);
		pass.setBounds(10,10,10,10);

		this.setSize(500,500);
		/*addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		}); */
		
		
	}
	
	public static void main(String[] args)
	{
		First ft=new First();
		ft.setVisible(true);
	}
}