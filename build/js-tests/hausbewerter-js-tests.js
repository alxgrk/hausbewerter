(function (_, Kotlin, $module$kotlin_test) {
  'use strict';
  var assertTrue = $module$kotlin_test.kotlin.test.assertTrue_i7pyzi$;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var test = $module$kotlin_test.kotlin.test.test;
  var suite = $module$kotlin_test.kotlin.test.suite;
  function Test() {
  }
  function Test$test$lambda() {
    return true;
  }
  Test.prototype.test = function () {
    assertTrue(void 0, Test$test$lambda);
  };
  Test.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Test',
    interfaces: []
  };
  _.Test = Test;
  suite('', false, function () {
    suite('Test', false, function () {
      test('test', false, function () {
        return (new Test()).test();
      });
    });
  });
  Kotlin.defineModule('hausbewerter-js-tests', _);
  return _;
}(module.exports, require('kotlin'), require('kotlin-test')));

//# sourceMappingURL=hausbewerter-js-tests.js.map
