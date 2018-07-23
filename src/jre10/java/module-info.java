import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.textangular.TextAngularModule;
import com.jwebmp.plugins.textangular.TextAngularPageConfigurator;

module com.jwebmp.plugins.textangular {

	exports com.jwebmp.plugins.textangular;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with TextAngularPageConfigurator;
	provides IAngularModule with TextAngularModule;

}
