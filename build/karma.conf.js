var webpackConfig = require("/home/alex/workspace_js/hausbewerter-js/build/webpack.config.js");
webpackConfig.mode = 'development';
webpackConfig.resolve.modules = ["js", "/home/alex/workspace_js/hausbewerter-js/build/js/hausbewerter-js.js", "resources/main", "node_modules", "/home/alex/workspace_js/hausbewerter-js/build/node_modules"];
webpackConfig.context = "/home/alex/workspace_js/hausbewerter-js/build/js";

module.exports = function (config) {
config.set({
    "basePath": "/home/alex/workspace_js/hausbewerter-js/build",
    "frameworks": [
        "qunit"
    ],
    "reporters": [
        "progress",
        "junit"
    ],
    "files": [
        "/home/alex/workspace_js/hausbewerter-js/build/js-tests/hausbewerter-js-tests.js"
    ],
    "exclude": [
        "*~",
        "*.swp",
        "*.swo"
    ],
    "port": 9876,
    "runnerPort": 9100,
    "colors": false,
    "autoWatch": true,
    "browsers": [
        "PhantomJS"
    ],
    "captureTimeout": 60000,
    "singleRun": false,
    "preprocessors": {
        "/home/alex/workspace_js/hausbewerter-js/build/js-tests/hausbewerter-js-tests.js": [
            "webpack"
        ]
    },
    "plugins": [
        "karma-phantomjs-launcher",
        "karma-junit-reporter",
        "karma-qunit",
        "karma-webpack"
    ],
    "client": {
        "clearContext": false,
        "qunit": {
            "showUI": true,
            "testTimeout": 5000
        }
    },
    "junitReporter": {
        "outputFile": "/home/alex/workspace_js/hausbewerter-js/build/reports/karma.xml",
        "suite": "karma"
    },
    "webpack": webpackConfig
})
};
