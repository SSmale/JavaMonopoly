
public class Dice {

	private int faceValue1;
	private int faceValue2;
	private boolean doubles=false;


	public void rollDice(){
		faceValue1=12;//(int) ((Math.random() * 6) + 1);
		faceValue2=12;//(int) ((Math.random() * 6) + 1);
	}

	public int getDice1(){		
		return faceValue1;	
	}

	public int getDice2(){
		return faceValue2;	
	}

	public int getResult(){
		return faceValue1+faceValue2;
	}
	public boolean getDoubles(){
		if (faceValue1==faceValue2){
			doubles=true;
		}
		return doubles;

	}
}
