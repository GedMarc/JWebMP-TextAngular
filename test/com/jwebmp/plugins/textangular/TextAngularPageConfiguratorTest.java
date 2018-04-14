package com.jwebmp.plugins.textangular;

import com.jwebmp.BaseTestClass;
import com.jwebmp.Page;
import com.jwebmp.base.angular.AngularPageConfigurator;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class TextAngularPageConfiguratorTest
		extends BaseTestClass
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
