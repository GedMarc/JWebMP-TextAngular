import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.textangular.TextAngularModule;
import com.jwebmp.plugins.textangular.TextAngularPageConfigurator;
import com.jwebmp.plugins.textangular.implementations.TextAngularExclusionsModule;

module com.jwebmp.plugins.textangular {

	exports com.jwebmp.plugins.textangular;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides IPageConfigurator with TextAngularPageConfigurator;
	provides IAngularModule with TextAngularModule;
	provides IGuiceScanModuleExclusions with TextAngularExclusionsModule;
	provides IGuiceScanJarExclusions with TextAngularExclusionsModule;

	opens com.jwebmp.plugins.textangular to com.fasterxml.jackson.databind, com.jwebmp.core;
}
