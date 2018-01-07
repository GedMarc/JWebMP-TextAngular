package za.co.mmagon.jwebswing.plugins.textangular;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

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
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/TextAngular.jar/download"
) class TextAngularPageConfigurator extends PageConfigurator
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
			BootstrapPageConfigurator.setRequired(page.getBody(), true);

			page.getBody().addJavaScriptReference(TextAngularReferencePool.TextAngular.getJavaScriptReference());
			page.getBody().addJavaScriptReference(TextAngularReferencePool.TextAngularRangy.getJavaScriptReference());
			page.getBody().addJavaScriptReference(TextAngularReferencePool.TextAngularSanitize.getJavaScriptReference());

			page.getBody().addCssReference(TextAngularReferencePool.TextAngular.getCssReference());
			page.getAngular().getAngularModules().add(new TextAngularModule());
		}
		return page;
	}
}
