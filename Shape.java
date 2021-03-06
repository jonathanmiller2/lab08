/**
 * Enum to represent possible shapes of game pieces.
 *
 * @author Jonathan Miller
 * @version 2019-03-18
 */

public enum Shape 
{
	THIMBLE,
	BOOT,
	RACECAR;
	
	/**
	 * @return The name of the enum value in lower case
	 */
	public String toString()
	{
		return this.name().toLowerCase();
	}
}
