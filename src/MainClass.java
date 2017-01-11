import javax.swing.JOptionPane;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input;
        char var;

        input = JOptionPane.showInputDialog("Do you want to quit?");
        if (input == null) {
            input = "f";
        } else {
            input = input.trim();
        }
        input = input.toLowerCase();

        boolean flag = true;
        while (flag) {

            switch (input) {
                case "yes":
                    flag = false;
                    break;                   
                case "y":
                    flag = false;
                    break;
                case "o":
                    flag = false;
                    break;
                case "oui":
                    flag = false;
                    break;
                case "m":
                    flag = false;
                    break;
                case "mouais":
                    flag = false;
                    break;
                case "no":
                    input = JOptionPane.showInputDialog("Do you want to quit?");
                    break;
                case "n":
                    input = JOptionPane.showInputDialog("Do you want to quit?");
                    break;
                case "non":
                    input = JOptionPane.showInputDialog("Do you want to quit?");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "There is an error with you "
                            + "typed the options are Yes, No, Y, N, o, oui, m, mouais");
                    input = JOptionPane.showInputDialog("Do you want to quit?");
            }// end main
        } 
        JOptionPane.showMessageDialog(null, "Thank you for your time");
	}

}
