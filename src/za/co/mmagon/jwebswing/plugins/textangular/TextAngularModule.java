package za.co.mmagon.jwebswing.plugins.textangular;

import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class TextAngularModule extends AngularModuleBase
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new TextAngularModule
     */
    public TextAngularModule()
    {
        super("textAngular");
    }

    @Override
    public String renderFunction()
    {
        return null;
    }
}
