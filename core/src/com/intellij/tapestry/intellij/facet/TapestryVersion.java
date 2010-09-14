package com.intellij.tapestry.intellij.facet;

public enum TapestryVersion {

  TAPESTRY_5_1_0_5("5.1.0.5");

  private final String _name;

  private TapestryVersion(String name) {
    _name = name;
  }

   public String toString() {
    return _name;
  }

  public static TapestryVersion fromString(String name) {
    for (TapestryVersion version : TapestryVersion.values()) {
      if (version.toString().equals(name)) return version;
    }
    return null;
  }


}
