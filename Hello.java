package my;

import java.primer.AfInput;
import java.primer.AfMp3Player;

public class Hello
{


	public static void main(String[] args)
	{

		Musicbox box = new Musicbox();
		
		System.out.println("----------------");
		System.out.println("next:播放下一首");
		System.out.println("quit:退出程序");
		System.out.println("----------------");
		
		while(true)
		{
			System.out.println(">");
			String cmd = AfInput.getString();
			
			if(cmd.equals("next"))
			{
				box.next();
			}
			else if(cmd.equals("quit"))
			{
				box.stop();
				break;
			}
			else
			{
				System.out.println("请输入正确的命令！");
			}
		}
		
		System.out.println("exit");
	}

}
