public class Country implements Measurable
{
   private String name;
   private double area;

   /**
      Construct a country with name and area.
      @param name country's name
      @param area total area of country
   */
   public Country(String name, double area)
   {
      this.name = name;
      this.area = area;
   }
   
   /**
	   Get the name of the country
	   @return the name of the country
	*/
	public String getName()
	{
	   return this.name;
	}

   /**
      Measurable interface method to retrieve measure.
      @return the measured area
   */
   public double getMeasure()
   {
      return area;
   }
}