var exec = require('cordova/exec');

var LivenessFace = {
  /**
   * Initialize the native SDK.
   * @param {Object} options
   * @param {function()} success
   * @param {function(*):void} error
   */
  initialize: function (options, success, error) {
    exec(success, error, 'LivenessFace', 'initialize', [options || {}]);
  },

  /**
   * Launch the liveness detection workflow.
   * @param {Object} options
   * @param {function(Object):void} success
   * @param {function(*):void} error
   */
  startDetection: function (options, success, error) {
    exec(success, error, 'LivenessFace', 'startDetection', [options || {}]);
  }
};

module.exports = LivenessFace;
