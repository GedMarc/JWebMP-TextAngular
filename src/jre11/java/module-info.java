import com.jwebmp.plugins.textangular.implementations.TextAngularInclusionsModule;

module com.jwebmp.plugins.textangular {

	exports com.jwebmp.plugins.textangular;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.textangular.TextAngularPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.textangular.TextAngularModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.textangular.implementations.TextAngularExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with TextAngularInclusionsModule;
	
	opens com.jwebmp.plugins.textangular to com.fasterxml.jackson.databind, com.jwebmp.core;
}
