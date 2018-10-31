package com.jwebmp.plugins.textangular;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Angular UI Sortable Helper
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Text Angular",
		description = "A radically powerful Text-Editor/Wysiwyg editor for Angular.js! Create multiple editor instances, two-way-bind HTML content, watch editors for changes and more!",
		url = "https://github.com/textAngular/textAngular")
public class TextAngular
		extends Div
{


	/**
	 * The Angular Variable Name for this component
	 */
	private String variableName;

	/**
	 * Constructs a new text angular without any binding
	 */
	private TextAngular()
	{
	}

	/**
	 * Constructs a new Text Angular bound to the given variable name
	 *
	 * @param variableName
	 */
	public TextAngular(String variableName)
	{
		this.variableName = variableName;
		setTag("text-angular");
		bind(variableName);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof TextAngular))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		TextAngular that = (TextAngular) o;

		return getVariableName() != null ? getVariableName().equals(that.getVariableName()) : that.getVariableName() == null;
	}

	/**
	 * The Angular Variable Name for this component
	 *
	 * @return
	 */
	public String getVariableName()
	{
		return variableName;
	}

	/**
	 * The Angular Variable Name for this component
	 *
	 * @param variableName
	 *
	 * @return
	 */
	public TextAngular setVariableName(String variableName)
	{
		this.variableName = variableName;
		return this;
	}
}
