module.exports = {
    "env": {
        "browser": true,
        "commonjs": true,
        "es6": true,
        "node": true
    },
    "settings": {
    "react": {
      "createClass": "createReactClass", // Regex for Component Factory to use,
                                         // default to "createReactClass"
      "pragma": "React",  // Pragma to use, default to "React"
      "version": "15.0", // React version, default to the latest React stable release
      "flowVersion": "0.53" // Flow version
    },
    "propWrapperFunctions": [ "forbidExtraProps" ] // The names of any functions used to wrap the
                                                   // propTypes object, e.g. `forbidExtraProps`.
                                                   // If this isn't set, any propTypes wrapped in
                                                   // a function will be skipped.
  },
    "extends": ["eslint:recommended", "plugin:react/recommended"],
    "parserOptions": {
        "sourceType": "module"
    },
    "rules": {
        "indent": [
            "error",
            2
        ],
        "linebreak-style": [
            "error",
            "unix"
        ],
        "quotes": [
            "error",
            "single"
        ],
        "semi": [
            "error",
            "always"
        ],
        "no-console": 1,
        "no-unreachable": 2,
        "no-undef": 2
    }
};
