package HouseConstruction;

public class HouseConstructioncost {

	public int calc(String material_standard,double area, String fah) {
		if(material_standard.equals("high standard materials") && fah.equals("Fully Automated Home"))
		{
			return (int) (2700*area);
		}
	   else if(material_standard.equals("standard materials"))
		{
			return (int) (area*1400);
		}
		else if(material_standard.equals("above standard materials"))
		{
			return (int) (1700*area);
		}
		else if(material_standard.equals("high standard materials"))
		{
			return (int) (1900*area);
		}
		return 0;
		
	}
}
