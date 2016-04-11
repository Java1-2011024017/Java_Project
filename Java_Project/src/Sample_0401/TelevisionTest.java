package Sample_0401;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		Television yourTv = new Television();
		Television testTv = myTv;
		
		myTv.channel = 18;
		myTv.volume = 20;
		myTv.onOff = true;
		// System.out.println(myTv.channel + " " + myTv.volume + " " + myTv.onOff); 
		
		//myTv.volume = myTv.volumeUP(30);
		// myTv.volumeUP(30);
		myTv.volumeUP();
		myTv.pr();
		
		yourTv.channel = 18;
		yourTv.volume = 20;
		yourTv.onOff = true;
		// System.out.println(yourTv.channel + " " + yourTv.volume + " " + yourTv.onOff); 
		
		yourTv.pr();
		
		myTv.channel = 232;
		
		// testTv = null;
		// System.out.println(testTv.channel + " " + testTv.volume + " " + testTv.onOff); 
		testTv.pr();
	}

}
