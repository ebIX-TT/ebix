/*
 * generated by Xtext
 */
package org.ebix.umm;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class UmmUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.ebix.umm.ui.internal.UmmActivator.getInstance().getInjector("org.ebix.umm.Umm");
	}
	
}
