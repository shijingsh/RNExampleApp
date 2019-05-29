/**
 * @format
 */

import {AppRegistry} from 'react-native';
import App from './App';
import {name as appName} from './app.json';

if (!__DEV__) {
    global.console = {
        info: () => {
        },
        log: () => {
        },
        warn: () => {
        },
        debug: () => {
        },
        error: () => {
        },
    };
}
console.ignoredYellowBox = [ 'Setting a timer' ]

AppRegistry.registerComponent(appName, () => App);
