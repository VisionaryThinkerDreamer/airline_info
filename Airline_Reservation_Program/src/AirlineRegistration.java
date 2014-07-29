// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration
{
	public static void main(String[] args)
	{
		String firstAnswer = JOptionPane
				.showInputDialog("Going on a trip are we? Well, "
						+ "I'm going to need to ask you some questions first. Is that okay?");
		firstAnswer = firstAnswer.toLowerCase();
		if (firstAnswer.equals("no") // || firstAnswer.equals("No")
				|| firstAnswer.equals("no.")// || firstAnswer.equals("No.")
				|| firstAnswer.equals("NO!")
				|| firstAnswer.equals("I don't think so."))
		{
			String secondAnswer = JOptionPane
					.showInputDialog(
							null,
							"Alright, listen jackass. I have a job to do here, and I work from 5 am to\n"
									+ "7 pm to feed my virtual kids. \n I don't have time to deal with smartasses like you,"
									+ " so are you taking a trip or not?");
			secondAnswer = secondAnswer.toLowerCase();
			if (secondAnswer.equals("no")
					|| secondAnswer.equals("no.")
					|| secondAnswer
							.equals("Well, I was but you're pretty rude."))
			{
				JOptionPane
						.showMessageDialog(
								null,
								"Well, quit bothering me then! \n"
										+ " Jeez, some people just don't get that computers are self aware nowadays.");
			}
		}
		if (firstAnswer.equals("yes") || firstAnswer.equals("yes.")
				|| firstAnswer.equals("sure")
				|| firstAnswer.equals("sure."))
		{
			String yesAnswer = JOptionPane
					.showInputDialog("Great. First, what's your name?");
		}
	}
}