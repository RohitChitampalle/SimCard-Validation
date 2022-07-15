class SimCard 
{
	private long number;
	private String servicePro;
	private double locallRate;

	SimCard(long num,String serprovider,double loRate)
	{
		this.number=num;
		this.servicePro=serprovider;
		this.locallRate=loRate;
	}
	public long getNumber()
	{
		return number;
	}
	public String getSerProvider()
	{
		return servicePro;
	}
	public void setName(long num,String newSerProvider)
	{
		if(this.number==num)
		{
		this.servicePro=newSerProvider;
		System.out.println("Service Provider is changed");
		}
		else
		{
			System.out.println("Invalid Number");
		}
	}
	public double getLoclRate()
	{
		return locallRate;
	}
	public void setLocalRate(long num,double locRate)
	{
		if(this.number==num)
		{
		this.locallRate=locRate;
		System.out.println("Local call rate is changed");
		}
		else
		{
			System.out.println("Inavlid Number");
		}
	}

	public void simDetails(int num)
	{
		if(this.number==num)
		{
		System.out.println("Simcard Number"+number);
		System.out.println("Simcard Service provider"+servicePro);
		System.out.println("Simcard Laocal Call Rate"+locallRate);
		}
		else
		{
			System.out.println("Invalid number");
		}
	
	}

}
