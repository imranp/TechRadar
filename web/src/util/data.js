/**
 * Created by Imran on 13-May-17.
 */
const $ = require("jquery");

const Data = function() {
    var self = {};

    self.generateRadarFromAllBlips = function(callback) {
        $.getJSON("/radar/blips", function(data) {
            callback(data);
        });
    }

    return self;
}

module.exports = Data;