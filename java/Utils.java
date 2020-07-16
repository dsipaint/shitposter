import java.util.Arrays;
import java.util.Random;

public class Utils
{	
	//display i rows and j columns of a 2d array
	public static String getArrayAsString(String[][] arr)
	{
		String str = "";
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				str += arr[i][j];
			
			str += "\n";
		}
		
		return str;
	}
	
	//clears a 2d array with the air emote
	public static void clearArray(String[][] arr)
	{
		//fill each array with the clear string
		for(String[] sub_arr : arr)
			Arrays.fill(sub_arr, Main.jda.getEmoteById(Main.AIR_ID).getAsMention()); //fill with air emotes
	}
	
	public static String getRandomEmote()
	{
		Random r = new Random();
		
		//get a random emote from the list
		return Main.jda.getEmotes().get(r.nextInt(Main.jda.getEmotes().size())).getAsMention();
	}
}
