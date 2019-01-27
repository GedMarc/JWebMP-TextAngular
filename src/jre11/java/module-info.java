module com.jwebmp.plugins.textangular {

	exports com.jwebmp.plugins.textangular;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.textangular.TextAngularPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.textangular.TextAngularModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.textangular.implementations.TextAngularExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.textangular.implementations.TextAngularExclusionsModule;

	opens com.jwebmp.plugins.textangular to com.fasterxml.jackson.databind, com.jwebmp.core;
}