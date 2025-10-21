import Foundation
import Cordova

@objc(LivenessFace)
class LivenessFacePlugin: CDVPlugin {
    @objc(initialize:)
    func initialize(command: CDVInvokedUrlCommand) {
        // TODO: Configure native SDK using command.arguments.first
        let pluginResult = CDVPluginResult(status: CDVCommandStatus_OK)
        commandDelegate.send(pluginResult, callbackId: command.callbackId)
    }

    @objc(startDetection:)
    func startDetection(command: CDVInvokedUrlCommand) {
        // TODO: Launch liveness detection workflow and return payload
        let payload: [String: Any] = ["status": "not_implemented"]
        let pluginResult = CDVPluginResult(status: CDVCommandStatus_OK, messageAs: payload)
        commandDelegate.send(pluginResult, callbackId: command.callbackId)
    }
}
