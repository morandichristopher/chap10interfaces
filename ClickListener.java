import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   An action listener that prints a message.
*/
public class ClickListener implements ActionListener
{
	private Measurable[] objects;
	private String metric;
	
	public ClickListener(Measurable[] objects, String metric)
	{
		this.objects = objects;
		this.metric = metric;
	}

	public void actionPerformed(ActionEvent event)
	{
		double result;
		String objectType;
		
		
		if (this.metric == "Maximum") {
			result = Data.max(this.objects);
		} else if (this.metric == "Minimum") {
			result = Data.min(this.objects);
		} else { 
			result = Data.average(this.objects);
		}
		
		
		String name = this.objects[0].getClass().getSimpleName(); 
		if (name.equals("BankAccount")) {
			objectType = "Account Balance";
		} else if (name.equals("Country")) {
			objectType = "Country Area";
		} else { 
			objectType = "Quiz Score";
		}
		
		
		System.out.printf("The "+this.metric+" "+objectType+" is: %.1f", result);
		System.out.println();
	}
}