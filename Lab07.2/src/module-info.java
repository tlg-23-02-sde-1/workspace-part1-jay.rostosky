/**
 * A module is a collection of related packages.
 * The packages that live with this config file are the packages in the module
 * There is no explicit listing of them.
 *
 * The packages in this module are:
 *  com.entertainment
 *  com.entertainment.util
 */
module com.entertainment {
    // which *packages* does this module  "export?"
    // exported packages are available to other modules
    exports com.entertainment;  // this is a *package* name
}