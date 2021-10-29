/**
 *	City data - the city name, state name, location designation,
 *				and population est. 2017
 *
 *	@author	Sania Shah
 *	@since	January 25, 2020
 */
public class City implements Comparable<City> {
	
	// fields
	private String name;
	private String state;
	private String designation;
	private int population;
	private int element;
	
	// constructor
	public City(String stateName, String cityName, String des, int pop)
	{
		state = stateName;
		name = cityName;
		designation = des;
		population = pop;
		element = 0;
	}
	
	/**	Compare two cities populations
	 *	@param other		the other City to compare
	 *	@return				the following value:
	 *		If populations are different, then returns (this.population - other.population)
	 *		else if states are different, then returns (this.state - other.state)
	 *		else returns (this.name - other.name)
	 */
	public int compareTo(City other)
	{
		if(this.population != other.population)
			return this.population - other.population;
		if(this.state.compareTo(other.state) != 0)
			return this.state.compareTo(other.state);
		return this.name.compareTo(other.name);
	}

	/**
	 * Compares the name of two cities
	 * @param 	otherwise the other cities name to compare to
	 * @return  this.name - other.name
	 */

	public int compareToCity(City other)
	{
		return this.name.compareTo(other.name);
	}

	/**	Equal city name and state name
	 *	@param other		the other City to compare
	 *	@return				true if city name and state name equal; false otherwise
	 */
	public boolean equals(Object other)
	{
		if(other instanceof City && compareTo((City)other) == 0)
			return true;
		return false;
	}

	
	/**	Accessor methods */

	/**
	 * Returns the state of the City Object
	 * @return state Name
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 * Return the city of each City Object
	 * @return city Name
	 */
	public String getCity()
	{
		return name;
	}

	/**	toString */
	@Override
	public String toString() {
		return String.format("%-22s %-22s %-12s %,12d", state, name, designation,
						population);
	}
}