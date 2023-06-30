package Week3_01_Reflect;

class Car1{
	private String model;
	private String owner;
	
	public Car1(){}
	public Car1(String model){ this.model = model;}
	/**
	 * @return the model
	 */
	public String getModel()
	{
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model)
	{
		this.model = model;
	}
	/**
	 * @return the owner
	 */
	public String getOwner()
	{
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	
}

