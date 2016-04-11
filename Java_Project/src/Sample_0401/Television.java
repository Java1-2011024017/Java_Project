package Sample_0401;

public class Television {
	int channel; 
	int volume; 
	boolean onOff; 
	
	void pr(){
		if(onOff==false){
			System.out.println("Tv Die");
			return;
		}
		System.out.println(channel + " " + volume + " " + onOff);
	}
	
/*	int volumeUP(int up_data){
		int vol=volume;
		vol += up_data;
		return vol; 
		
	} */
	
	void volumeUP(int up_data){
		if(onOff==false){
			System.out.println("Tv Die");
			return;
		}
		volume += up_data;		
	}
	
	void volumeUP(){
		if(onOff == false){
			System.out.println("Tv Die");
			return;
		}
		volume += 1;					
	}
}
