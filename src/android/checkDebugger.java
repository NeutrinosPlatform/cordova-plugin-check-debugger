package com.neutrinos.checkdebuggerplugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;


public class checkDebugger extends CordovaPlugin {

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if (action.equals("isAttached")) {

            try {

                callbackContext.success(String.valueOf(android.os.Debug.isDebuggerConnected()));
                PluginResult r = new PluginResult(PluginResult.Status.OK);
                callbackContext.sendPluginResult(r);
            } catch (Exception e) {
                callbackContext.error("Main loop Exception");
                PluginResult r = new PluginResult(PluginResult.Status.ERROR);
                callbackContext.sendPluginResult(r);
            }
            return true;
        }
        return false;
    }
}
