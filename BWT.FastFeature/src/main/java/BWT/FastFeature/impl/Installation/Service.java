package BWT.FastFeature.impl.Installation;

import java.util.Locale;


import com.ur.urcap.api.contribution.ViewAPIProvider;
import com.ur.urcap.api.contribution.installation.ContributionConfiguration;
import com.ur.urcap.api.contribution.installation.CreationContext;
import com.ur.urcap.api.contribution.installation.InstallationAPIProvider;
import com.ur.urcap.api.contribution.installation.swing.SwingInstallationNodeService;

import com.ur.urcap.api.domain.data.DataModel; 
public class Service implements SwingInstallationNodeService<Contribution, View> {

    @Override
    public void configureContribution(ContributionConfiguration configuration) {
       //
    }

    @Override
    public String getTitle(Locale locale) {
       return "BWT Fast Feature"; 
    }

    @Override
    public View createView(ViewAPIProvider apiProvider) {
        return new View(apiProvider); 
    }

    @Override
    public Contribution createInstallationNode(InstallationAPIProvider apiProvider, View view, DataModel model, CreationContext context) {
        return new Contribution(apiProvider, view, model, context); 
    }
    
}
