package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import dev.flutter.plugins.e2e.E2EPlugin;
import io.flutter.plugins.firebaseperformance.FirebasePerformancePlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterFirebaseCorePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin"));
    E2EPlugin.registerWith(registry.registrarFor("dev.flutter.plugins.e2e.E2EPlugin"));
    FirebasePerformancePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebaseperformance.FirebasePerformancePlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
