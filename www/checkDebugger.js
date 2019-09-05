module.exports = {
  isAttached: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "checkDebugger", "isAttached", []);
  }
};