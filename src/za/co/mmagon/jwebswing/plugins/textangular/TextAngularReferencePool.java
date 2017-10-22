package za.co.mmagon.jwebswing.plugins.textangular;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum TextAngularReferencePool implements ReferencePool
{
	TextAngular(new JavascriptReference("TextAngular", 1.5, "bower_components/textAngular/dist/textAngular.min.js", 16),
	            new CSSReference("TextAngular", 1.5, "bower_components/textAngular/dist/textAngular.css")),
	TextAngularSetup(new JavascriptReference("TextAngularSetup", 1.5, "bower_components/textAngular/dist/textAngularSetup", 15), null),
	TextAngularSanitize(new JavascriptReference("TextAngularSanitize", 1.5, "bower_components/textAngular/dist/textAngular-sanitize.js", 15), null),
	TextAngularRangy(new JavascriptReference("TextAngularRangy", 1.5, "bower_components/textAngular/dist/textAngular-rangy.min.js", 15), null);
	/**
	 * Any sub data
	 */
	private String data;
	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	/**
	 * A new AngularSlimScrollReferencePool
	 */
	TextAngularReferencePool()
	{

	}


	TextAngularReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		if (this.javaScriptReference != null)
		{
			this.javaScriptReference.setPriority(RequirementsPriority.DontCare);
		}
		this.cssReference = cssReference;
		if (this.cssReference != null)
		{
			this.cssReference.setPriority(RequirementsPriority.DontCare);
		}
	}

	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}

	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
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
