import java.util.Scanner;
public class Television {

	private int channelId;
	private String channelName;
	private int volume;
	private boolean tvState;
	
	Scanner scan = new Scanner(System.in);
	
	public String getChannelByName(int channelId) {
		if(channelId < 0) {
			this.channelId = 10;
			channelName = "BBC Pidgin";
		}
		else if(channelId > 10) {
			this.channelId = 0;
			channelName = "AV";
		}
		else {
			switch(channelId) {
		
			case 1:
				channelName =	"Channels TV";
				break;
			case 2:
				channelName =	"NTA";
				break;
			case 3:
				channelName =	"TVC";
				break;
			case 4:
				channelName =	"Lagos TV";
				break;
			case 5:
				channelName =	"Africa Independent Television";
				break;
			case 6:
				channelName =	"Silver Bird Television";
			case 7:
				channelName = "CNN Africa";
				break;
			case 8:
				channelName = "Bendel Brocasting Network";
				break;
			case 9:
				channelName = "Oduduwa People Television";
			case 10:
				channelName = "BBC Pidgin";
				break;
			case 0:
				channelName =	"AV";
				break;
			}

		}
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public String getChannelId() {
		
		return getChannelByName(channelId);
	}
	public void setChannelId() {
		System.out.println("Enter Channel Number 0 : 10 OR -5 for your TV volume");
		int channelId = scan.nextInt();
		if(channelId == -5) {
			
			//System.out.println("Your TV volume is : "+getVolume());
			System.out.println("Enter -4 to reduce volume,  -6 to increase volume  , 0 to change channel");
			int volume = scan.nextInt();
			if(volume == -4) {
				changeVolumeDown();
			}
			else if(volume == -6) {
				changeVolumeUp();
			}
			else if(volume == 0){
				setChannelId();
			}
		}
		System.out.println("You are watching : "+getChannelByName(channelId));
	}
	

	public int getVolume() {
		System.out.println("Your TV Volume is : "+volume);
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	public boolean isTvSate() {
		return tvState;
	}
	public void setTvSate() {
			this.tvState = true;
		if(tvState == true) {
			setChannelId();
		}
//		else {
//			System.out.println("Enter 1 to turn TV On ");
//			turnOn = scan.nextInt();
//		}
		
	}
	
	public void changeChannelUp() {
		if(tvState) {
			System.out.println("TV is Off");
		}
		else {
			channelId++;
			getChannelByName(channelId);
		}
		
	}
	
	public void changeChannelDown() {
		if(tvState) {
			System.out.println("TV is Off");
		}
		else {
			channelId--;
			getChannelByName(channelId);
		}
		
	}
	
	public void changeVolumeUp() {
			volume++;
			getVolume();
		
		
	}
	public void changeVolumeDown() {
		volume--;
		getVolume();
	
	
}
	
	
}
