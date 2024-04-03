package com.app.geometry;

public class Point2D 
{
	private double x;
	private double y;
	
	public Point2D(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		String details;
		details = "("+x+","+y+")";
		return details;
	}
	
	public boolean isEqual(Point2D p)
	{
		if(this.x == p.x && this.y == p.y)
		{
			return true;
		}
		else
			return false;
	}
	
	public double CalculateDistance(Point2D p)
	{
		double x = Math.pow((p.x-this.x),2);
		double y = Math.pow((p.y-this.y),2);
		double dist = Math.sqrt(x+y);
		return dist;
	}
	
}
