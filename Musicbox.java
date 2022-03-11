package my;

import java.primer.AfMp3Player;

public class Musicbox
{
	private String[] items;
	private int index = -1;
	private AfMp3Player player;
	
	public Musicbox()
	{
		items = new String [3];
		
		items[0] = "music/影山浩宣 - CHA-LA HEAD-CHA-LA.mp3";
		items[1] = "music/Geoff Knorr _ Phill Boucher - China (The Atomic Era).mp3";
		items[2] = "music/Joel Hanson - Traveling Light.mp3";
	}
	
	public void next()
	{
		this.index ++;
		if(this.index >= 3)
		{
			this.index = 0;
		}
		if(this.index < 0)
		{
			this.index = 0;
		}
		
		String path = this.items[index];
		System.out.println("播放:" + path );
		
		this.stop();
		
		this.player = new AfMp3Player();
		this.player.play(path);
	}
	
	public void stop()
	{
		if(player != null)
		{
			this.player.close();
			this.player = null;
		}
	}
	
	public void test()
	{
		int index = 0;
		String path = this.items[index];
		
		AfMp3Player pl = new AfMp3Player();
		pl.play(path);
		
	}
}
