import java.util.Random;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter
{	
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)
	{
		String msg = e.getMessage().getContentRaw();
		String[] args = msg.split(" ");
		
		if(args[0].equalsIgnoreCase(Main.PREFIX + "shitpost"))
		{
			Random r = new Random();
			
			//random number of emotes between 3 and 7
			for(int i = 0; i < (3 + r.nextInt(4)); i++)
			{	
				Main.char_arr[r.nextInt(Main.ROWS)][r.nextInt(Main.COLUMNS)] //gets random emote and assigns it to a random array element
						= Utils.getRandomEmote();;
			}
			
			e.getChannel().sendMessage(Utils.getArrayAsString(Main.char_arr)).queue();
			Utils.clearArray(Main.char_arr); //clear array after use for next time
		}
	}
}
