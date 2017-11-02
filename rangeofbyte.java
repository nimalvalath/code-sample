class RangeOfDataType {
	public void shortRange(){
		short i=1;
		while(i>0)
			i++;
		System.out.println("range of byte is from-->:  "+i+"  to--> : "+--i);
	}
	public static void main(String[] args) {
		RangeOfDataType rt= new RangeOfDataType();
		
		
		byteRange();
		intRange();
		rt.shortRange();

	}
	public static void byteRange(){
		byte b=1;
		while(b>0)
			b++;
		//b willl get increments to 128 
		// since byte actual range -128 to  127
		// +128 is represented as signValue - and  128
		System.out.println("range of byte is from-->:  "+b+"  to--> : "+--b);

	}

	public static void intRange(){
		// integer is 4bytes 
		int i=1;
		while(i>0)
			i++;
		System.out.println("range of byte is from-->:  "+i+"  to--> : "+--i);
	}
	//taking long time since: 8 byte range
	/*public static void longRange(){
		long l=1; 
		while(l>0)
			l++;
		System.out.println("range of byte is from-->:  "+l+"to--> : "+--l);
	}*/
}