package za.co.mmagon.jwebswing.plugins.textangular;

/**
 * @author Marc Magon
 * @since 11 Jun 2017
 */
public enum TextAngularAttributes
{

	;
	/**
	 * Any sub data
	 */
	private String data;

	/**
	 * A new TextAngularAttributes
	 */
	TextAngularAttributes()
	{

	}


	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data;
		}
		else
		{
			return name();
		}
	}
}
