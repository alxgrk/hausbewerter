@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package pact.dsl

external fun term(opts: OptsClass): TermClass
external fun <T> eachLike(content: T, opts: OptsClass?): ArrayLikeClass<T>
external fun <T> somethingLike(value: T): SomethingLikeClass<T>

external interface MatcherResult {
    var json_class: String
}
external interface OptsClass {
    var generate: String
    var matcher: String
}
external interface MatcherClass {
    var json_class: String /* "Regexp" */
    var o: Number /* 0 */
    var s: String
}
external interface DataClass {
    var generate: String
    var matcher: MatcherClass
}
external interface TermClass {
    var json_class: String /* "Pact::Term" */
    var data: DataClass
}
external interface OptsWithMinClass {
    var min: Number
}
external interface ArrayLikeClass<T> {
    var json_class: String /* "Pact::ArrayLike" */
    var contents: T
    var min: Number
}
external interface SomethingLikeClass<T> {
    var json_class: String /* "Pact::SomethingLike" */
    var contents: T
}
