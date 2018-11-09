'use strict';

var webpack = require('webpack');

var config = {
    "mode": "development",
    "context": "/home/alex/workspace_js/hausbewerter-js/build/js",
    "entry": {
        "main": "./hausbewerter-js"
    },
    "output": {
        "path": "/home/alex/workspace_js/hausbewerter-js/build/bundle",
        "filename": "[name].bundle.js",
        "chunkFilename": "[id].bundle.js",
        "publicPath": "/"
    },
    "module": {
        "rules": [
            
        ]
    },
    "resolve": {
        "modules": [
            "js",
            "resources/main",
            "node_modules",
            "/home/alex/workspace_js/hausbewerter-js/build/node_modules"
        ]
    },
    "plugins": [
        
    ]
};

module.exports = config;

