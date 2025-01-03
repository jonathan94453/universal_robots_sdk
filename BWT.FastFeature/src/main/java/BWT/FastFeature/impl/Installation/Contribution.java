package BWT.FastFeature.impl.Installation;

import com.ur.urcap.api.contribution.InstallationNodeContribution;
import com.ur.urcap.api.contribution.installation.CreationContext;
import com.ur.urcap.api.contribution.installation.InstallationAPIProvider;
import com.ur.urcap.api.domain.data.DataModel;
import com.ur.urcap.api.domain.script.ScriptWriter;

public class Contribution implements InstallationNodeContribution {


private InstallationAPIProvider apiProvider; 
private View view;
private DataModel model; 
private CreationContext context; 
private boolean freedriveEnabled = false; 

public Contribution(InstallationAPIProvider apiProvider, View view, DataModel model, CreationContext context) {
    this.apiProvider = apiProvider; 
    this.view = view; 
    this.model = model; 
    this.context = context; 
}
public boolean isFreedriveEnabled() {
    return freedriveEnabled;
}
public void SetFreeDriveEnabled(Boolean climate) {
   freedriveEnabled = climate; 
}


    @Override
    public void openView() {
        // 
    }

  

    @Override
    public void generateScript(ScriptWriter writer) {
        // Generate script based on freedrive state
        if(freedriveEnabled) {
            writer.appendLine("freedrive_mode()");
        }
    }

    @Override
    public void closeView() {
       //   
    }
    
}
