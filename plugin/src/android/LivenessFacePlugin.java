package com.example.outsystems.livenessface;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LivenessFacePlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) {
        switch (action) {
            case "initialize":
                cordova.getThreadPool().execute(() -> handleInitialize(args, callbackContext));
                return true;
            case "startDetection":
                cordova.getThreadPool().execute(() -> handleStartDetection(args, callbackContext));
                return true;
            default:
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.INVALID_ACTION));
                return false;
        }
    }

    private void handleInitialize(JSONArray args, CallbackContext callbackContext) {
        try {
            JSONObject options = args.optJSONObject(0);
            // TODO: initialize native SDK with options
            callbackContext.success();
        } catch (Exception e) {
            callbackContext.error(e.getMessage());
        }
    }

    private void handleStartDetection(JSONArray args, CallbackContext callbackContext) {
        try {
            JSONObject options = args.optJSONObject(0);
            // TODO: invoke native liveness detection SDK
            JSONObject result = new JSONObject();
            result.put("status", "not_implemented");
            callbackContext.success(result);
        } catch (JSONException e) {
            callbackContext.error(e.getMessage());
        }
    }
}
