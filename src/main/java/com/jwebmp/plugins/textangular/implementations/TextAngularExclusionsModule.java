package com.jwebmp.plugins.textangular.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class TextAngularExclusionsModule
		implements IGuiceScanModuleExclusions<TextAngularExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.textangular");
		return strings;
	}
}
