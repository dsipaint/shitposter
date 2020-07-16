import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main
{
	static JDA jda;
	static final String PREFIX = "^", AIR_ID = "730914402324185121"; //id for an emote which is blank in wilbur's server
	static final int ROWS = 5, COLUMNS = 10;
	
	static String[][] char_arr;
	
	public static void main(String[] args)
	{
		try
		{
			jda = new JDABuilder(AccountType.BOT).setToken("").build();
		}
		catch (LoginException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			jda.awaitReady();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		char_arr = new String[ROWS][COLUMNS];
		Utils.clearArray(char_arr);
		
		jda.addEventListener(new CommandListener());
		jda.addEventListener(new StopListener());
	}
}
