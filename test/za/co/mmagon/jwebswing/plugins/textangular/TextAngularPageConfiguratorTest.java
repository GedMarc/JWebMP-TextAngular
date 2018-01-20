package za.co.mmagon.jwebswing.plugins.textangular;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;

/**
 * @author Marc Magon
 */
public class TextAngularPageConfiguratorTest extends BaseTestClass
{

	public TextAngularPageConfiguratorTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		AngularPageConfigurator.setRequired(true);
		Page p = getInstance();
		System.out.println(p.toString(0));
	}

}
