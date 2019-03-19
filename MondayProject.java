import java.io.*;
import java.util.*;

public class MondayProject {
	
	private String userName;
	private String userHome;
	private int favoriteNum;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHome() {
		return userHome;
	}
	public void setUserHome(String userHome) {
		this.userHome = userHome;
	}
	public int getFavoriteNum() {
		return favoriteNum;
	}
	public void setFavoriteNum(int favoriteNum) {
		this.favoriteNum = favoriteNum;
	}
	
	public void getInfo() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?:: ");
		setUserName(keyboard.nextLine());
		System.out.println("What is your Hometown?:: ");
		userHome = keyboard.nextLine();
		System.out.println("What is your favorite number?:: ");
		favoriteNum = keyboard.nextInt();
		
	}
	
	public void writeToFile() throws IOException {
		
		PrintWriter writer = new PrintWriter(new FileWriter(new File(getUserName()+".dat")));
		writer.println(getUserName()+"\n"+getUserHome()+"\n"+getFavoriteNum());
		writer.close();
		
		
	}
	
	public void testFileInfo() throws IOException {
		
		Scanner file = new Scanner(new File(getUserName()+".dat"));
		while(file.hasNext()) 
			{
				System.out.println(file.nextLine());
			}
		
	}
	public String toString() {
		return "";
	}

}
