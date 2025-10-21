# Liveness Face Detection Cordova Plugin

This repository contains the starting point for an OutSystems 11 Cordova plugin
that exposes native liveness face detection capabilities for both Android and
iOS applications.

## Repository Layout

```
plugin/
├── plugin.xml                 # Cordova plugin manifest consumed by OutSystems MABS
├── package.json               # NPM metadata for local testing with Cordova/Capacitor
├── www/
│   └── liveness-face.js       # JavaScript bridge exposed to OutSystems client apps
├── src/
│   ├── android/
│   │   └── LivenessFacePlugin.java  # Native Android entry point (placeholder)
│   └── ios/
│       └── LivenessFacePlugin.swift # Native iOS entry point (placeholder)
└── extensibility/
    └── ExtensibilityConfigurations.json # OutSystems build-time declarations
```

## Getting Started

1. Customize the placeholders in `plugin/plugin.xml` (plugin id, version,
   dependencies, preferences, etc.).
2. Implement the native code inside `src/android/LivenessFacePlugin.java` and
   `src/ios/LivenessFacePlugin.swift` to bridge your liveness detection SDKs.
3. Update `www/liveness-face.js` with strongly-typed wrappers for the native
   methods you plan to expose to OutSystems.
4. Adjust `extensibility/ExtensibilityConfigurations.json` to declare required
   Gradle dependencies, CocoaPods, entitlements, or configuration fragments.
5. Zip the `plugin/` folder and upload it as a Cordova Plugin module in
   OutSystems Service Studio.

Refer to the OutSystems documentation on Cordova plugin development for more
information about packaging and distributing the plugin through MABS.
