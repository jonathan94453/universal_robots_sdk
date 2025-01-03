package BWT.FastFeature.impl;

import com.ur.urcap.api.contribution.installation.swing.SwingInstallationNodeService;
import com.ur.urcap.api.contribution.toolbar.swing.SwingToolbarService;

import BWT.FastFeature.impl.Installation.Service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		bundleContext.registerService(SwingToolbarService.class, new MyToolbarService(), null); 
		bundleContext.registerService(SwingInstallationNodeService.class, new Service(), null); 
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
	}
}

