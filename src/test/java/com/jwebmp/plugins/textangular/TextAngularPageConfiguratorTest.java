package com.jwebmp.plugins.textangular;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class TextAngularPageConfiguratorTest

{

	public TextAngularPageConfiguratorTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		AngularPageConfigurator.setRequired(true);
		Page p = new Page();
		System.out.println(p.toString(0));
	}

}
