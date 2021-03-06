# cordova-plugin-check-debugger [![npm version](https://badge.fury.io/js/cordova-plugin-check-debugger.svg)](//npmjs.com/package/cordova-plugin-check-debugger)
A cordova plugin to check if a debugger is attached to the app or not. Attackers attach a debugger to the app to gain access to the internal workings of the app, even when the app is in release mode. This plugin can be used to check if an unauthorised debugging of the app is in progress. 

## Install
```
cordova plugin add cordova-plugin-check-debugger
```

## Usage
```js
checkDebugger.isAttached(function(isDebug) {
    if (isDebug) {
        // isDebug is of string format in Android.
        // Do something aggressive here, like deleting your local storage or closing the app
        console.log('Oh Oh!! Looks like your app is being debugged! Is it you or an intruder?');
    } else {
        // Continue normal logic
        console.log('Phew! Everything seems to be fine');
    }
}, function(err) {
    console.error(err);
});
```

## Supported platforms
* iOS
* Android

## Credits
* https://github.com/sensepost/objection
* https://www.frida.re/

## License
MIT
