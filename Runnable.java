package lambda;

public class Runnable {

	
	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1()
	{
		// Java 8֮ǰ��
//		new Thread(new Runnable() {
//		    @Override
//		    public void run() {
//		    System.out.println("Before Java8, too much code for too little to do");
//		    }
//		}).start();
//		
		//Java 8��ʽ��
//		(params) -> expression
//		(params) -> statement
//		(params) -> { statements }
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();		
	}
	
	
}


//Java 8֮ǰ��
//JButton show =  new JButton("Show");
//show.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// System.out.println("Event handling without lambda expression is boring");
// }
//});

//Java 8��ʽ��
//show.addActionListener((e) -> {
// System.out.println("Light, Camera, Action !! Lambda expressions Rocks");
//});
