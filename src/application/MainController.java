package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label result;
	String str="";
	public void processNumber(ActionEvent event) {
		Button clickedButton = (Button) event.getSource();
        String value = clickedButton.getText();
        str+=value;
        result.setText(str);
       // System.out.println(str);
	}
	public void processOperator(ActionEvent event) {
		Modal modal=new Modal();
		int ans=modal.calculate(str);
		str="";
		result.setText(Integer.toString(ans));
	}
	public void removeBack(ActionEvent event) {
		if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
		result.setText(str);
	}
	public void clearAll(ActionEvent event) {
		str="";
		result.setText(str);
	}
	public void factorial(ActionEvent event) {
		Modal model=new Modal();
		try {
			int num=Integer.parseInt(str);
			System.out.println(num);
			int ans=model.factorial(num);
			str="";
			result.setText(Integer.toString(ans));
		}catch(Exception e) {
			e.printStackTrace();
			result.setText("Given Input is not valid");
		}
	}
	public void square(ActionEvent event) {
		try {
			int num=Integer.parseInt(str);
			Long ans=num*num*1L;
			str="";
			result.setText(Long.toString(ans));
		}catch(Exception e) {
			e.printStackTrace();
			result.setText("Given Input is not valid");
		}
	}
	public void sqrRoot(ActionEvent event) {
		int num=Integer.parseInt(str);
		double ans= Math.sqrt(num);
		str="";
		result.setText(Double.toString(ans));
	}

}
