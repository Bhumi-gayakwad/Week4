package annotations.use_deprecated;

class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("Warning: oldFeature() is deprecated. Use newFeature() instead.");
    }

    void newFeature() {
        System.out.println("This is the new and improved feature.");
    }
}