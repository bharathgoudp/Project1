class Gun 
{
	public String gname;
	public int bullets;
	Gun(String i,int j)
	{
		gname=i;
		bullets=j;
	}
	public void info()
	{
		System.out.println("gun name is:"+gname+"bullets:"+bullets);
	}
	public static void main(String[] args) 
	{
		Gun g1 = new Gun("ak47",100);
		Gun g2= new Gun("m416",40);
		g1.info();
		g2.info();
	}
}
