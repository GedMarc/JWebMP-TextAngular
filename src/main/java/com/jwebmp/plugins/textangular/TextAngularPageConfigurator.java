/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.textangular;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * The Angular UI Sortable Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "TextAngular",
		pluginDescription = "A radically powerful Text-Editor/Wysiwyg editor for Angular.js! Create multiple editor instances, two-way-bind HTML content, watch editors for changes and more!",
		pluginUniqueName = "jwebswing-angular-ui-bootstrap",
		pluginVersion = "1.5.16",
		pluginCategories = "text,html entry, edit box,bootstrap, ui,web ui, framework",
		pluginSubtitle = "textAngular is a super cool WYSIWYG Text Editor directive for AngularJS",
		pluginSourceUrl = "https://github.com/textAngular/textAngular",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-TextAngular/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-TextAngular",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://textangular.com/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-text-angular",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-text-angular",
		pluginModuleName = "com.jwebmp.plugins.textangular",
		pluginStatus = PluginStatus.Released
)
public class TextAngularPageConfigurator
		implements IPageConfigurator<TextAngularPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new TextAngularPageConfigurator
	 */
	public TextAngularPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return TextAngularPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		TextAngularPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getBody()
			    .addJavaScriptReference(TextAngularReferencePool.TextAngular.getJavaScriptReference());
			page.getBody()
			    .addJavaScriptReference(TextAngularReferencePool.TextAngularRangy.getJavaScriptReference());
			page.getBody()
			    .addJavaScriptReference(TextAngularReferencePool.TextAngularSanitize.getJavaScriptReference());

			page.getBody()
			    .addCssReference(TextAngularReferencePool.TextAngular.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return TextAngularPageConfigurator.enabled;
	}
}
