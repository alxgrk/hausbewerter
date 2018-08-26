@file:Suppress("DEPRECATED", "INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("Chai")
package chai

import kotlinext.js.PropertyDescriptor
import kotlin.js.*

external interface ChaiStatic {
    var expect: ExpectStatic
    fun should(): Should
    fun use(fn: (chai: Any, utils: Any) -> Unit): ChaiStatic
    var assert: AssertStatic
    var config: Config
    var AssertionError: Any?
    var version: String
}
external interface ExpectStatic : AssertionStatic {
    fun fail(actual: Any? = definedExternally /* null */, expected: Any? = definedExternally /* null */, message: String? = definedExternally /* null */, operator: String? = definedExternally /* null */)
}
external interface AssertStatic : Assert
external interface AssertionStatic {
    @nativeInvoke
    operator fun invoke(target: Any, message: String? = definedExternally /* null */): Assertion
}
external interface ShouldAssertion {
    fun equal(value1: Any, value2: Any, message: String? = definedExternally /* null */)
    var Throw: ShouldThrow
    var `throw`: ShouldThrow
    fun exist(value: Any, message: String? = definedExternally /* null */)
}
external interface Should : ShouldAssertion {
    var not: ShouldAssertion
    fun fail(actual: Any, expected: Any, message: String? = definedExternally /* null */, operator: String? = definedExternally /* null */)
}
external interface ShouldThrow {
    @nativeInvoke
    operator fun invoke(actual: Function<*>, expected: String? = definedExternally /* null */, message: String? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(actual: Function<*>, expected: RegExp? = definedExternally /* null */, message: String? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(actual: Function<*>, constructor: Function<*>, expected: String? = definedExternally /* null */, message: String? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(actual: Function<*>, constructor: Function<*>, expected: RegExp? = definedExternally /* null */, message: String? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(actual: Function<*>, constructor: Error, expected: String? = definedExternally /* null */, message: String? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(actual: Function<*>, constructor: Error, expected: RegExp? = definedExternally /* null */, message: String? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(actual: Function<*>)
    @nativeInvoke
    operator fun invoke(actual: Function<*>, constructor: Function<*>)
    @nativeInvoke
    operator fun invoke(actual: Function<*>, constructor: Error)
}
external interface Assertion : LanguageChains, NumericComparison, TypeComparison {
    var not: Assertion
    var deep: Deep
    var ordered: Ordered
    var nested: Nested
    var any: KeyFilter
    var all: KeyFilter
    var a: TypeComparison
    var an: TypeComparison
    var include: Include
    var includes: Include
    var contain: Include
    var contains: Include
    var ok: Assertion
    var `true`: Assertion
    var `false`: Assertion
    var `null`: Assertion
    var undefined: Assertion
    var NaN: Assertion
    var exist: Assertion
    var empty: Assertion
    var arguments: Assertion
    var Arguments: Assertion
    var equal: Equal
    var equals: Equal
    var eq: Equal
    var eql: Equal
    var eqls: Equal
    var property: Property
    var ownProperty: OwnProperty
    var haveOwnProperty: OwnProperty
    var ownPropertyDescriptor: OwnPropertyDescriptor
    var haveOwnPropertyDescriptor: OwnPropertyDescriptor
    var length: Length
    var lengthOf: Length
    var match: Match
    var matches: Match
    fun string(string: String, message: String? = definedExternally /* null */): Assertion
    var keys: Keys
    fun key(string: String): Assertion
    var `throw`: Throw
    var throws: Throw
    var Throw: Throw
    var respondTo: RespondTo
    var respondsTo: RespondTo
    var itself: Assertion
    var satisfy: Satisfy
    var satisfies: Satisfy
    var closeTo: CloseTo
    var approximately: CloseTo
    var members: Members
    var increase: PropertyChange
    var increases: PropertyChange
    var decrease: PropertyChange
    var decreases: PropertyChange
    var change: PropertyChange
    var changes: PropertyChange
    var extensible: Assertion
    var sealed: Assertion
    var frozen: Assertion
    fun oneOf(list: Array<Any>, message: String? = definedExternally /* null */): Assertion
}
external interface LanguageChains {
    var to: Assertion
    var be: Assertion
    var been: Assertion
    var `is`: Assertion
    var that: Assertion
    var which: Assertion
    var and: Assertion
    var has: Assertion
    var have: Assertion
    var with: Assertion
    var at: Assertion
    var of: Assertion
    var same: Assertion
    var but: Assertion
    var does: Assertion
}
external interface NumericComparison {
    var above: NumberComparer
    var gt: NumberComparer
    var greaterThan: NumberComparer
    var least: NumberComparer
    var gte: NumberComparer
    var below: NumberComparer
    var lt: NumberComparer
    var lessThan: NumberComparer
    var most: NumberComparer
    var lte: NumberComparer
    fun within(start: Number, finish: Number, message: String? = definedExternally /* null */): Assertion
    fun within(start: Date, finish: Date, message: String? = definedExternally /* null */): Assertion
}
external interface NumberComparer {
    @nativeInvoke
    operator fun invoke(value: Number, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(value: Date, message: String? = definedExternally /* null */): Assertion
}
external interface TypeComparison {
    @nativeInvoke
    operator fun invoke(type: String, message: String? = definedExternally /* null */): Assertion
    var instanceof: InstanceOf
    var instanceOf: InstanceOf
}
external interface InstanceOf {
    @nativeInvoke
    operator fun invoke(constructor: Any, message: String? = definedExternally /* null */): Assertion
}
external interface CloseTo {
    @nativeInvoke
    operator fun invoke(expected: Number, delta: Number, message: String? = definedExternally /* null */): Assertion
}
external interface Nested {
    var include: Include
    var property: Property
    var members: Members
}
external interface Deep {
    var equal: Equal
    var equals: Equal
    var eq: Equal
    var include: Include
    var property: Property
    var members: Members
    var ordered: Ordered
}
external interface Ordered {
    var members: Members
}
external interface KeyFilter {
    var keys: Keys
}
external interface Equal {
    @nativeInvoke
    operator fun invoke(value: Any, message: String? = definedExternally /* null */): Assertion
}
external interface Property {
    @nativeInvoke
    operator fun invoke(name: String, value: Any? = definedExternally /* null */, message: String? = definedExternally /* null */): Assertion
}
external interface OwnProperty {
    @nativeInvoke
    operator fun invoke(name: String, message: String? = definedExternally /* null */): Assertion
}
external interface OwnPropertyDescriptor {
    @nativeInvoke
    operator fun invoke(name: String, descriptor: PropertyDescriptor<Any>, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(name: String, message: String? = definedExternally /* null */): Assertion
}
external interface Length : LanguageChains, NumericComparison {
    @nativeInvoke
    operator fun invoke(length: Number, message: String? = definedExternally /* null */): Assertion
}
external interface Include {
    @nativeInvoke
    operator fun invoke(value: String, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(value: Number, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(value: Any, message: String? = definedExternally /* null */): Assertion
    var keys: Keys
    var deep: Deep
    var ordered: Ordered
    var members: Members
    var any: KeyFilter
    var all: KeyFilter
}
external interface Match {
    @nativeInvoke
    operator fun invoke(regexp: RegExp, message: String? = definedExternally /* null */): Assertion
}
external interface Keys {
    @nativeInvoke
    operator fun invoke(vararg keys: String): Assertion
    @nativeInvoke
    operator fun invoke(keys: Any): Assertion
    @nativeInvoke
    operator fun invoke(keys: Array<Any>): Assertion
}
external interface Throw {
    @nativeInvoke
    operator fun invoke(expected: String? = definedExternally /* null */, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(expected: RegExp? = definedExternally /* null */, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(constructor: Function<*>, expected: String? = definedExternally /* null */, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(constructor: Function<*>, expected: RegExp? = definedExternally /* null */, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(constructor: Error, expected: String? = definedExternally /* null */, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(constructor: Error, expected: RegExp? = definedExternally /* null */, message: String? = definedExternally /* null */): Assertion
    @nativeInvoke
    operator fun invoke(): Assertion
    @nativeInvoke
    operator fun invoke(constructor: Function<*>): Assertion
    @nativeInvoke
    operator fun invoke(constructor: Error): Assertion
}
external interface RespondTo {
    @nativeInvoke
    operator fun invoke(method: String, message: String? = definedExternally /* null */): Assertion
}
external interface Satisfy {
    @nativeInvoke
    operator fun invoke(matcher: Function<*>, message: String? = definedExternally /* null */): Assertion
}
external interface Members {
    @nativeInvoke
    operator fun invoke(set: Array<Any>, message: String? = definedExternally /* null */): Assertion
}
external interface PropertyChange {
    @nativeInvoke
    operator fun invoke(`object`: Any, property: String, message: String? = definedExternally /* null */): Assertion
}
external interface `T$0` {
    var length: Number? get() = definedExternally; set(value) = definedExternally
}
external interface Assert {
    @nativeInvoke
    operator fun invoke(expression: Any, message: String? = definedExternally /* null */)
    fun <T> fail(actual: T? = definedExternally /* null */, expected: T? = definedExternally /* null */, message: String? = definedExternally /* null */, operator: String? = definedExternally /* null */)
    fun <T> isOk(value: T, message: String? = definedExternally /* null */)
    fun <T> ok(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotOk(value: T, message: String? = definedExternally /* null */)
    fun <T> notOk(value: T, message: String? = definedExternally /* null */)
    fun <T> equal(actual: T, expected: T, message: String? = definedExternally /* null */)
    fun <T> notEqual(actual: T, expected: T, message: String? = definedExternally /* null */)
    fun <T> strictEqual(actual: T, expected: T, message: String? = definedExternally /* null */)
    fun <T> notStrictEqual(actual: T, expected: T, message: String? = definedExternally /* null */)
    fun <T> deepEqual(actual: T, expected: T, message: String? = definedExternally /* null */)
    fun <T> notDeepEqual(actual: T, expected: T, message: String? = definedExternally /* null */)
    fun <T> deepStrictEqual(actual: T, expected: T, message: String? = definedExternally /* null */)
    fun isAbove(valueToCheck: Number, valueToBeAbove: Number, message: String? = definedExternally /* null */)
    fun isAtLeast(valueToCheck: Number, valueToBeAtLeast: Number, message: String? = definedExternally /* null */)
    fun isBelow(valueToCheck: Number, valueToBeBelow: Number, message: String? = definedExternally /* null */)
    fun isAtMost(valueToCheck: Number, valueToBeAtMost: Number, message: String? = definedExternally /* null */)
    fun <T> isTrue(value: T, message: String? = definedExternally /* null */)
    fun <T> isFalse(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotTrue(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotFalse(value: T, message: String? = definedExternally /* null */)
    fun <T> isNull(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotNull(value: T, message: String? = definedExternally /* null */)
    fun <T> isNaN(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotNaN(value: T, message: String? = definedExternally /* null */)
    fun <T> exists(value: T, message: String? = definedExternally /* null */)
    fun <T> notExists(value: T, message: String? = definedExternally /* null */)
    fun <T> isUndefined(value: T, message: String? = definedExternally /* null */)
    fun <T> isDefined(value: T, message: String? = definedExternally /* null */)
    fun <T> isFunction(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotFunction(value: T, message: String? = definedExternally /* null */)
    fun <T> isObject(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotObject(value: T, message: String? = definedExternally /* null */)
    fun <T> isArray(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotArray(value: T, message: String? = definedExternally /* null */)
    fun <T> isString(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotString(value: T, message: String? = definedExternally /* null */)
    fun <T> isNumber(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotNumber(value: T, message: String? = definedExternally /* null */)
    fun <T> isBoolean(value: T, message: String? = definedExternally /* null */)
    fun <T> isNotBoolean(value: T, message: String? = definedExternally /* null */)
    fun <T> typeOf(value: T, name: String, message: String? = definedExternally /* null */)
    fun <T> notTypeOf(value: T, name: String, message: String? = definedExternally /* null */)
    fun <T> instanceOf(value: T, constructor: Function<*>, message: String? = definedExternally /* null */)
    fun <T> notInstanceOf(value: T, type: Function<*>, message: String? = definedExternally /* null */)
    fun include(haystack: String, needle: String, message: String? = definedExternally /* null */)
    fun <T> include(haystack: Array<T>, needle: T, message: String? = definedExternally /* null */)
    fun notInclude(haystack: String, needle: Any, message: String? = definedExternally /* null */)
    fun notInclude(haystack: Array<Any>, needle: Any, message: String? = definedExternally /* null */)
    fun deepInclude(haystack: String, needle: String, message: String? = definedExternally /* null */)
    fun <T> deepInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun notDeepInclude(haystack: String, needle: Any, message: String? = definedExternally /* null */)
    fun notDeepInclude(haystack: Array<Any>, needle: Any, message: String? = definedExternally /* null */)
    fun nestedInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun notNestedInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun deepNestedInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun notDeepNestedInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun ownInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun notOwnInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun deepOwnInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun notDeepOwnInclude(haystack: Any, needle: Any, message: String? = definedExternally /* null */)
    fun match(value: String, regexp: RegExp, message: String? = definedExternally /* null */)
    fun notMatch(expected: Any, regexp: RegExp, message: String? = definedExternally /* null */)
    fun <T> property(`object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> notProperty(`object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> deepProperty(`object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> notDeepProperty(`object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T, V> propertyVal(`object`: T, property: String, value: V, message: String? = definedExternally /* null */)
    fun <T, V> propertyNotVal(`object`: T, property: String, value: V, message: String? = definedExternally /* null */)
    fun <T, V> deepPropertyVal(`object`: T, property: String, value: V, message: String? = definedExternally /* null */)
    fun <T, V> deepPropertyNotVal(`object`: T, property: String, value: V, message: String? = definedExternally /* null */)
    fun <T : `T$0`> lengthOf(`object`: T, length: Number, message: String? = definedExternally /* null */)
    fun `throw`(fn: Function<*>, message: String? = definedExternally /* null */)
    fun `throw`(fn: Function<*>, regExp: RegExp)
    fun `throw`(fn: Function<*>, constructor: Function<*>, message: String? = definedExternally /* null */)
    fun `throw`(fn: Function<*>, constructor: Function<*>, regExp: RegExp)
    fun throws(fn: Function<*>, message: String? = definedExternally /* null */)
    fun throws(fn: Function<*>, errType: Function<*>, message: String? = definedExternally /* null */)
    fun throws(fn: Function<*>, errType: RegExp, message: String? = definedExternally /* null */)
    fun throws(fn: Function<*>, errType: Function<*>, regExp: RegExp)
    fun Throw(fn: Function<*>, message: String? = definedExternally /* null */)
    fun Throw(fn: Function<*>, regExp: RegExp)
    fun Throw(fn: Function<*>, errType: Function<*>, message: String? = definedExternally /* null */)
    fun Throw(fn: Function<*>, errType: Function<*>, regExp: RegExp)
    fun doesNotThrow(fn: Function<*>, message: String? = definedExternally /* null */)
    fun doesNotThrow(fn: Function<*>, regExp: RegExp)
    fun doesNotThrow(fn: Function<*>, errType: Function<*>, message: String? = definedExternally /* null */)
    fun doesNotThrow(fn: Function<*>, errType: Function<*>, regExp: RegExp)
    fun operator(val1: String, operator: String, val2: dynamic /* String | Number | Boolean | Date | Nothing? */, message: String? = definedExternally /* null */)
    fun operator(val1: Number, operator: String, val2: dynamic /* String | Number | Boolean | Date | Nothing? */, message: String? = definedExternally /* null */)
    fun operator(val1: Boolean, operator: String, val2: dynamic /* String | Number | Boolean | Date | Nothing? */, message: String? = definedExternally /* null */)
    fun operator(val1: Date, operator: String, val2: dynamic /* String | Number | Boolean | Date | Nothing? */, message: String? = definedExternally /* null */)
    fun operator(val1: Nothing?, operator: String, val2: dynamic /* String | Number | Boolean | Date | Nothing? */, message: String? = definedExternally /* null */)
    fun closeTo(actual: Number, expected: Number, delta: Number, message: String? = definedExternally /* null */)
    fun approximately(act: Number, exp: Number, delta: Number, message: String? = definedExternally /* null */)
    fun <T> sameMembers(set1: Array<T>, set2: Array<T>, message: String? = definedExternally /* null */)
    fun <T> sameDeepMembers(set1: Array<T>, set2: Array<T>, message: String? = definedExternally /* null */)
    fun <T> sameOrderedMembers(set1: Array<T>, set2: Array<T>, message: String? = definedExternally /* null */)
    fun <T> notSameOrderedMembers(set1: Array<T>, set2: Array<T>, message: String? = definedExternally /* null */)
    fun <T> sameDeepOrderedMembers(set1: Array<T>, set2: Array<T>, message: String? = definedExternally /* null */)
    fun <T> notSameDeepOrderedMembers(set1: Array<T>, set2: Array<T>, message: String? = definedExternally /* null */)
    fun <T> includeOrderedMembers(superset: Array<T>, subset: Array<T>, message: String? = definedExternally /* null */)
    fun <T> notIncludeOrderedMembers(superset: Array<T>, subset: Array<T>, message: String? = definedExternally /* null */)
    fun <T> includeDeepOrderedMembers(superset: Array<T>, subset: Array<T>, message: String? = definedExternally /* null */)
    fun <T> notIncludeDeepOrderedMembers(superset: Array<T>, subset: Array<T>, message: String? = definedExternally /* null */)
    fun <T> includeMembers(superset: Array<T>, subset: Array<T>, message: String? = definedExternally /* null */)
    fun <T> includeDeepMembers(superset: Array<T>, subset: Array<T>, message: String? = definedExternally /* null */)
    fun <T> oneOf(inList: T, list: Array<T>, message: String? = definedExternally /* null */)
    fun <T> changes(modifier: Function<*>, `object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> doesNotChange(modifier: Function<*>, `object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> increases(modifier: Function<*>, `object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> doesNotIncrease(modifier: Function<*>, `object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> decreases(modifier: Function<*>, `object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> doesNotDecrease(modifier: Function<*>, `object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> ifError(`object`: T, message: String? = definedExternally /* null */)
    fun <T> isExtensible(`object`: T, message: String? = definedExternally /* null */)
    fun <T> extensible(`object`: T, message: String? = definedExternally /* null */)
    fun <T> isNotExtensible(`object`: T, message: String? = definedExternally /* null */)
    fun <T> notExtensible(`object`: T, message: String? = definedExternally /* null */)
    fun <T> isSealed(`object`: T, message: String? = definedExternally /* null */)
    fun <T> sealed(`object`: T, message: String? = definedExternally /* null */)
    fun <T> isNotSealed(`object`: T, message: String? = definedExternally /* null */)
    fun <T> notSealed(`object`: T, message: String? = definedExternally /* null */)
    fun <T> isFrozen(`object`: T, message: String? = definedExternally /* null */)
    fun <T> frozen(`object`: T, message: String? = definedExternally /* null */)
    fun <T> isNotFrozen(`object`: T, message: String? = definedExternally /* null */)
    fun <T> notFrozen(`object`: T, message: String? = definedExternally /* null */)
    fun <T> isEmpty(`object`: T, message: String? = definedExternally /* null */)
    fun <T> isNotEmpty(`object`: T, message: String? = definedExternally /* null */)
    fun <T> hasAnyKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> hasAnyKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> hasAllKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> hasAllKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> containsAllKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> containsAllKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> doesNotHaveAnyKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> doesNotHaveAnyKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> doesNotHaveAllKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> doesNotHaveAllKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> hasAnyDeepKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> hasAnyDeepKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> hasAllDeepKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> hasAllDeepKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> containsAllDeepKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> containsAllDeepKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> doesNotHaveAnyDeepKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> doesNotHaveAnyDeepKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> doesNotHaveAllDeepKeys(`object`: T, keys: Array<dynamic /* String | Any */>, message: String? = definedExternally /* null */)
    fun <T> doesNotHaveAllDeepKeys(`object`: T, keys: Json, message: String? = definedExternally /* null */)
    fun <T> nestedProperty(`object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> notNestedProperty(`object`: T, property: String, message: String? = definedExternally /* null */)
    fun <T> nestedPropertyVal(`object`: T, property: String, value: Any, message: String? = definedExternally /* null */)
    fun <T> notNestedPropertyVal(`object`: T, property: String, value: Any, message: String? = definedExternally /* null */)
    fun <T> deepNestedPropertyVal(`object`: T, property: String, value: Any, message: String? = definedExternally /* null */)
    fun <T> notDeepNestedPropertyVal(`object`: T, property: String, value: Any, message: String? = definedExternally /* null */)
}
external interface Config {
    var includeStack: Boolean
    var showDiff: Boolean
    var truncateThreshold: Number
}
external open class AssertionError(message: String, _props: Any? = definedExternally /* null */, ssf: Function<*>? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var message: String = definedExternally
    open var showDiff: Boolean = definedExternally
    open var stack: String = definedExternally
}
