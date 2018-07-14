/*
 * Copyright (C) 2017 Marc Magon
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

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.plugins.PluginInformation;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;

/**
 * The Angular UI Sortable Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "TextAngular",
		pluginDescription = "A radically powerful Text-Editor/Wysiwyg editor for Angular.js! Create multiple editor instances, two-way-bind HTML content, watch editors for changes and more!",
		pluginUniqueName = "jwebswing-angular-ui-bootstrap",
		pluginVersion = "1.5.16",
		pluginCategories = "text,html entry, edit box,bootstrap, ui,web ui, framework",
		pluginSubtitle = "textAngular is a super cool WYSIWYG Text Editor directive for AngularJS",
		pluginSourceUrl = "https://github.com/textAngular/textAngular",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-TextAngular/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-TextAngular",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://textangular.com/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/TextAngular.jar/download") class TextAngularPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new TextAngularPageConfigurator
	 */
	public TextAngularPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
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
			page.getAngular()
			    .getAngularModules()
			    .add(new TextAngularModule());
		}
		return page;
	}
}
